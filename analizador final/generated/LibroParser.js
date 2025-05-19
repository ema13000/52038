// Generated from Libro.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import LibroListener from './LibroListener.js';
import LibroVisitor from './LibroVisitor.js';

const serializedATN = [4,1,14,68,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,1,0,4,0,18,8,0,11,0,12,0,19,1,1,1,1,1,1,1,1,3,1,
26,8,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,5,2,36,8,2,10,2,12,2,39,9,2,1,3,1,
3,1,3,5,3,44,8,3,10,3,12,3,47,9,3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,
5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,0,0,8,0,2,4,6,8,10,12,14,0,1,1,
0,11,13,65,0,17,1,0,0,0,2,21,1,0,0,0,4,32,1,0,0,0,6,45,1,0,0,0,8,48,1,0,
0,0,10,54,1,0,0,0,12,60,1,0,0,0,14,65,1,0,0,0,16,18,3,2,1,0,17,16,1,0,0,
0,18,19,1,0,0,0,19,17,1,0,0,0,19,20,1,0,0,0,20,1,1,0,0,0,21,22,5,1,0,0,22,
23,5,11,0,0,23,25,5,5,0,0,24,26,3,4,2,0,25,24,1,0,0,0,25,26,1,0,0,0,26,27,
1,0,0,0,27,28,5,6,0,0,28,29,5,7,0,0,29,30,3,6,3,0,30,31,5,8,0,0,31,3,1,0,
0,0,32,37,5,11,0,0,33,34,5,9,0,0,34,36,5,11,0,0,35,33,1,0,0,0,36,39,1,0,
0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,5,1,0,0,0,39,37,1,0,0,0,40,44,3,8,4,0,
41,44,3,10,5,0,42,44,3,12,6,0,43,40,1,0,0,0,43,41,1,0,0,0,43,42,1,0,0,0,
44,47,1,0,0,0,45,43,1,0,0,0,45,46,1,0,0,0,46,7,1,0,0,0,47,45,1,0,0,0,48,
49,5,2,0,0,49,50,5,5,0,0,50,51,5,11,0,0,51,52,5,6,0,0,52,53,5,10,0,0,53,
9,1,0,0,0,54,55,5,3,0,0,55,56,5,5,0,0,56,57,3,14,7,0,57,58,5,6,0,0,58,59,
5,10,0,0,59,11,1,0,0,0,60,61,5,11,0,0,61,62,5,4,0,0,62,63,3,14,7,0,63,64,
5,10,0,0,64,13,1,0,0,0,65,66,7,0,0,0,66,15,1,0,0,0,5,19,25,37,43,45];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class LibroParser extends antlr4.Parser {

    static grammarFileName = "Libro.g4";
    static literalNames = [ null, "'funcion'", "'leer'", "'escribir'", "'='", 
                            "'('", "')'", "'{'", "'}'", "','", "';'" ];
    static symbolicNames = [ null, "FN", "READ", "WRITE", "EQ", "LPAREN", 
                             "RPAREN", "LCURLY", "RCURLY", "COMMA", "SEMI", 
                             "ID", "INT", "STRING", "WS" ];
    static ruleNames = [ "programa", "funcion", "parametros", "instrucciones", 
                         "leer", "escribir", "asignacion", "expresion" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = LibroParser.ruleNames;
        this.literalNames = LibroParser.literalNames;
        this.symbolicNames = LibroParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, LibroParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 17; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 16;
	            this.funcion();
	            this.state = 19; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funcion() {
	    let localctx = new FuncionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, LibroParser.RULE_funcion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 21;
	        this.match(LibroParser.FN);
	        this.state = 22;
	        this.match(LibroParser.ID);
	        this.state = 23;
	        this.match(LibroParser.LPAREN);
	        this.state = 25;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 24;
	            this.parametros();
	        }

	        this.state = 27;
	        this.match(LibroParser.RPAREN);
	        this.state = 28;
	        this.match(LibroParser.LCURLY);
	        this.state = 29;
	        this.instrucciones();
	        this.state = 30;
	        this.match(LibroParser.RCURLY);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	parametros() {
	    let localctx = new ParametrosContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, LibroParser.RULE_parametros);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        this.match(LibroParser.ID);
	        this.state = 37;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===9) {
	            this.state = 33;
	            this.match(LibroParser.COMMA);
	            this.state = 34;
	            this.match(LibroParser.ID);
	            this.state = 39;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instrucciones() {
	    let localctx = new InstruccionesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, LibroParser.RULE_instrucciones);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 45;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2060) !== 0)) {
	            this.state = 43;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 2:
	                this.state = 40;
	                this.leer();
	                break;
	            case 3:
	                this.state = 41;
	                this.escribir();
	                break;
	            case 11:
	                this.state = 42;
	                this.asignacion();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 47;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	leer() {
	    let localctx = new LeerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, LibroParser.RULE_leer);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 48;
	        this.match(LibroParser.READ);
	        this.state = 49;
	        this.match(LibroParser.LPAREN);
	        this.state = 50;
	        this.match(LibroParser.ID);
	        this.state = 51;
	        this.match(LibroParser.RPAREN);
	        this.state = 52;
	        this.match(LibroParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	escribir() {
	    let localctx = new EscribirContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, LibroParser.RULE_escribir);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 54;
	        this.match(LibroParser.WRITE);
	        this.state = 55;
	        this.match(LibroParser.LPAREN);
	        this.state = 56;
	        this.expresion();
	        this.state = 57;
	        this.match(LibroParser.RPAREN);
	        this.state = 58;
	        this.match(LibroParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	asignacion() {
	    let localctx = new AsignacionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, LibroParser.RULE_asignacion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 60;
	        this.match(LibroParser.ID);
	        this.state = 61;
	        this.match(LibroParser.EQ);
	        this.state = 62;
	        this.expresion();
	        this.state = 63;
	        this.match(LibroParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expresion() {
	    let localctx = new ExpresionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, LibroParser.RULE_expresion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 65;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 14336) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

LibroParser.EOF = antlr4.Token.EOF;
LibroParser.FN = 1;
LibroParser.READ = 2;
LibroParser.WRITE = 3;
LibroParser.EQ = 4;
LibroParser.LPAREN = 5;
LibroParser.RPAREN = 6;
LibroParser.LCURLY = 7;
LibroParser.RCURLY = 8;
LibroParser.COMMA = 9;
LibroParser.SEMI = 10;
LibroParser.ID = 11;
LibroParser.INT = 12;
LibroParser.STRING = 13;
LibroParser.WS = 14;

LibroParser.RULE_programa = 0;
LibroParser.RULE_funcion = 1;
LibroParser.RULE_parametros = 2;
LibroParser.RULE_instrucciones = 3;
LibroParser.RULE_leer = 4;
LibroParser.RULE_escribir = 5;
LibroParser.RULE_asignacion = 6;
LibroParser.RULE_expresion = 7;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_programa;
    }

	funcion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(FuncionContext);
	    } else {
	        return this.getTypedRuleContext(FuncionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FuncionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_funcion;
    }

	FN() {
	    return this.getToken(LibroParser.FN, 0);
	};

	ID() {
	    return this.getToken(LibroParser.ID, 0);
	};

	LPAREN() {
	    return this.getToken(LibroParser.LPAREN, 0);
	};

	RPAREN() {
	    return this.getToken(LibroParser.RPAREN, 0);
	};

	LCURLY() {
	    return this.getToken(LibroParser.LCURLY, 0);
	};

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	RCURLY() {
	    return this.getToken(LibroParser.RCURLY, 0);
	};

	parametros() {
	    return this.getTypedRuleContext(ParametrosContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterFuncion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitFuncion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitFuncion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ParametrosContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_parametros;
    }

	ID = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(LibroParser.ID);
	    } else {
	        return this.getToken(LibroParser.ID, i);
	    }
	};


	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(LibroParser.COMMA);
	    } else {
	        return this.getToken(LibroParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterParametros(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitParametros(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitParametros(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_instrucciones;
    }

	leer = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(LeerContext);
	    } else {
	        return this.getTypedRuleContext(LeerContext,i);
	    }
	};

	escribir = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EscribirContext);
	    } else {
	        return this.getTypedRuleContext(EscribirContext,i);
	    }
	};

	asignacion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AsignacionContext);
	    } else {
	        return this.getTypedRuleContext(AsignacionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterInstrucciones(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitInstrucciones(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LeerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_leer;
    }

	READ() {
	    return this.getToken(LibroParser.READ, 0);
	};

	LPAREN() {
	    return this.getToken(LibroParser.LPAREN, 0);
	};

	ID() {
	    return this.getToken(LibroParser.ID, 0);
	};

	RPAREN() {
	    return this.getToken(LibroParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(LibroParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterLeer(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitLeer(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitLeer(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class EscribirContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_escribir;
    }

	WRITE() {
	    return this.getToken(LibroParser.WRITE, 0);
	};

	LPAREN() {
	    return this.getToken(LibroParser.LPAREN, 0);
	};

	expresion() {
	    return this.getTypedRuleContext(ExpresionContext,0);
	};

	RPAREN() {
	    return this.getToken(LibroParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(LibroParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterEscribir(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitEscribir(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitEscribir(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AsignacionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_asignacion;
    }

	ID() {
	    return this.getToken(LibroParser.ID, 0);
	};

	EQ() {
	    return this.getToken(LibroParser.EQ, 0);
	};

	expresion() {
	    return this.getTypedRuleContext(ExpresionContext,0);
	};

	SEMI() {
	    return this.getToken(LibroParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterAsignacion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitAsignacion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitAsignacion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpresionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LibroParser.RULE_expresion;
    }

	INT() {
	    return this.getToken(LibroParser.INT, 0);
	};

	STRING() {
	    return this.getToken(LibroParser.STRING, 0);
	};

	ID() {
	    return this.getToken(LibroParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.enterExpresion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof LibroListener ) {
	        listener.exitExpresion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof LibroVisitor ) {
	        return visitor.visitExpresion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




LibroParser.ProgramaContext = ProgramaContext; 
LibroParser.FuncionContext = FuncionContext; 
LibroParser.ParametrosContext = ParametrosContext; 
LibroParser.InstruccionesContext = InstruccionesContext; 
LibroParser.LeerContext = LeerContext; 
LibroParser.EscribirContext = EscribirContext; 
LibroParser.AsignacionContext = AsignacionContext; 
LibroParser.ExpresionContext = ExpresionContext; 
