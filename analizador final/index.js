import antlr4 from 'antlr4';
import fs from 'fs';
import LibroLexer from './generated/LibroLexer.js';
import LibroParser from './generated/LibroParser.js';
import LibroListener from './generated/LibroListener.js';

// --- 1. Lectura del código fuente ---
const inputCode = fs.readFileSync('input.txt', 'utf-8');

// --- 2. ANÁLISIS LÉXICO ---
const chars = new antlr4.InputStream(inputCode);
const lexer = new LibroLexer(chars);

console.log('--- Tabla de lexemas y tokens ---');
let token = lexer.nextToken();
const tokensList = [];
const erroresLexicos = [];

while (token.type !== antlr4.Token.EOF) {
  const tokenName = LibroLexer.symbolicNames[token.type];
  if (!tokenName) {
    erroresLexicos.push(`Error léxico en línea ${token.line}: símbolo inválido "${token.text}"`);
    console.warn(`Token desconocido con tipo ${token.type} y texto: "${token.text}" en línea ${token.line}`);
  }
  tokensList.push({ lexema: token.text, token: tokenName || 'UNKNOWN_TOKEN', linea: token.line });
  console.log(`Línea ${token.line}: ${token.text} => ${tokenName || 'UNKNOWN_TOKEN'}`);
  token = lexer.nextToken();
}

// --- 3. ANÁLISIS SINTÁCTICO ---
const charsForParser = new antlr4.InputStream(inputCode);
const lexerForParser = new LibroLexer(charsForParser);
const tokens = new antlr4.CommonTokenStream(lexerForParser);
const parser = new LibroParser(tokens);

const erroresSintacticos = [];

parser.removeErrorListeners();
parser.addErrorListener({
  syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
    const error = `Error sintáctico en línea ${line}:${column} - ${msg}`;
    erroresSintacticos.push(error);
    console.error(error);
  }
});

const tree = parser.programa();

console.log('\n--- Árbol de análisis sintáctico (formato texto) ---');
console.log(tree.toStringTree(parser.ruleNames));

// --- 4. INTERPRETACIÓN ---
class Interpreter extends LibroListener {
  constructor() {
    super();
    this.globalVariables = {};
    this.contextStack = [];
    this.jsCode = '';
    this.functions = {};
  }

  currentContext() {
    return this.contextStack.length > 0 ? this.contextStack[this.contextStack.length - 1] : this.globalVariables;
  }

  enterPrograma(ctx) {
    if (ctx.funcion) {
      ctx.funcion().forEach(func => this.enterFuncion(func));
    }
  }

  enterFuncion(ctx) {
    const id = ctx.ID().getText();
    this.functions[id] = ctx;
  }

  ejecutarFuncion(id) {
    const funcCtx = this.functions[id];
    if (!funcCtx) throw new Error(`Función no definida: ${id}`);

    const instruccionesCtx = funcCtx.instrucciones();
    if (instruccionesCtx && instruccionesCtx.children) {
      instruccionesCtx.children.forEach(instr => this.visit(instr));
    }
  }

  visit(ctx) {
    if (!ctx) return;
    const methodName = 'enter' + ctx.constructor.name.replace('Context', '');
    if (typeof this[methodName] === 'function') {
      this[methodName](ctx);
    }
    if (ctx.children) {
      ctx.children.forEach(child => {
        if (child.constructor.name.endsWith('Context')) {
          this.visit(child);
        }
      });
    }
  }

  enterAsignacion(ctx) {
    const id = ctx.ID().getText();
    const val = this.evalExpr(ctx.expresion());
    this.currentContext()[id] = val;
    this.jsCode += `var ${id} = ${JSON.stringify(val)};\n`;
  }

  enterEscribir(ctx) {
    const val = this.evalExpr(ctx.expresion());
    this.jsCode += `console.log(${JSON.stringify(val)});\n`;
    console.log(val);
  }

  enterLeer(ctx) {
    const id = ctx.ID().getText();
    const dummyInput = "inputValue";
    this.currentContext()[id] = dummyInput;
    this.jsCode += `var ${id} = "inputValue"; // lectura simulada\n`;
  }

  evalExpr(ctx) {
    if (ctx.INT()) {
      return parseInt(ctx.INT().getText(), 10);
    } else if (ctx.STRING()) {
      return ctx.STRING().getText().slice(1, -1);
    } else if (ctx.ID()) {
      const id = ctx.ID().getText();
      const context = this.currentContext();
      if (context.hasOwnProperty(id)) {
        return context[id];
      } else if (this.globalVariables.hasOwnProperty(id)) {
        return this.globalVariables[id];
      } else {
        throw new Error(`Variable no definida: ${id}`);
      }
    }
    return null;
  }
}

// --- 5. EJECUCIÓN ---
const interpreter = new Interpreter();
interpreter.enterPrograma(tree); // Registrar funciones

try {
  if (interpreter.functions['main']) {
    interpreter.ejecutarFuncion('main');
  } else {
    console.warn('No se encontró función main para ejecutar');
  }
} catch (e) {
  console.error('Error durante la ejecución:', e.message);
}

console.log('\n--- Código JavaScript generado ---');
console.log(interpreter.jsCode);

console.log('\n--- Ejecución terminada ---');

console.log('\n--- Resultado del análisis ---');
if (erroresLexicos.length === 0 && erroresSintacticos.length === 0) {
  console.log('✅ Análisis exitoso: sin errores léxicos ni sintácticos.');
} else {
  console.log('❌ Se encontraron errores durante el análisis:');
  erroresLexicos.forEach(e => console.log(e));
  erroresSintacticos.forEach(e => console.log(e));
}
