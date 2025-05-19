// Generated from c:/Users/Ema/analizador/analizador final/Libro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LibroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FN=1, READ=2, WRITE=3, EQ=4, LPAREN=5, RPAREN=6, LCURLY=7, RCURLY=8, COMMA=9, 
		SEMI=10, ID=11, INT=12, STRING=13, WS=14;
	public static final int
		RULE_programa = 0, RULE_funcion = 1, RULE_parametros = 2, RULE_instrucciones = 3, 
		RULE_leer = 4, RULE_escribir = 5, RULE_asignacion = 6, RULE_expresion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcion", "parametros", "instrucciones", "leer", "escribir", 
			"asignacion", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'leer'", "'escribir'", "'='", "'('", "')'", "'{'", 
			"'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FN", "READ", "WRITE", "EQ", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"COMMA", "SEMI", "ID", "INT", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Libro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LibroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				funcion();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(LibroParser.FN, 0); }
		public TerminalNode ID() { return getToken(LibroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LibroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LibroParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(LibroParser.LCURLY, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(LibroParser.RCURLY, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(FN);
			setState(22);
			match(ID);
			setState(23);
			match(LPAREN);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(24);
				parametros();
				}
			}

			setState(27);
			match(RPAREN);
			setState(28);
			match(LCURLY);
			setState(29);
			instrucciones();
			setState(30);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LibroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LibroParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LibroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LibroParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ID);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(33);
				match(COMMA);
				setState(34);
				match(ID);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<EscribirContext> escribir() {
			return getRuleContexts(EscribirContext.class);
		}
		public EscribirContext escribir(int i) {
			return getRuleContext(EscribirContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2060L) != 0)) {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READ:
					{
					setState(40);
					leer();
					}
					break;
				case WRITE:
					{
					setState(41);
					escribir();
					}
					break;
				case ID:
					{
					setState(42);
					asignacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeerContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LibroParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(LibroParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LibroParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(LibroParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LibroParser.SEMI, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(READ);
			setState(49);
			match(LPAREN);
			setState(50);
			match(ID);
			setState(51);
			match(RPAREN);
			setState(52);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(LibroParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(LibroParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LibroParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LibroParser.SEMI, 0); }
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(WRITE);
			setState(55);
			match(LPAREN);
			setState(56);
			expresion();
			setState(57);
			match(RPAREN);
			setState(58);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LibroParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LibroParser.EQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LibroParser.SEMI, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(EQ);
			setState(62);
			expresion();
			setState(63);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LibroParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LibroParser.STRING, 0); }
		public TerminalNode ID() { return getToken(LibroParser.ID, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eD\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0000\u0001\u0001\u0000\u000b\rA\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0002\u0015\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006"+
		"-\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000"+
		"\u0000\f<\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0005\u000b\u0000\u0000\u0017"+
		"\u0019\u0005\u0005\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c"+
		"\u001d\u0005\u0007\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e"+
		"\u001f\u0005\b\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 %\u0005"+
		"\u000b\u0000\u0000!\"\u0005\t\u0000\u0000\"$\u0005\u000b\u0000\u0000#"+
		"!\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(,\u0003\b\u0004\u0000),\u0003\n\u0005\u0000*,\u0003"+
		"\f\u0006\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000001\u0005\u0002\u0000\u000012\u0005\u0005\u0000\u000023\u0005"+
		"\u000b\u0000\u000034\u0005\u0006\u0000\u000045\u0005\n\u0000\u00005\t"+
		"\u0001\u0000\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0005\u0000"+
		"\u000089\u0003\u000e\u0007\u00009:\u0005\u0006\u0000\u0000:;\u0005\n\u0000"+
		"\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\u000b\u0000\u0000=>\u0005"+
		"\u0004\u0000\u0000>?\u0003\u000e\u0007\u0000?@\u0005\n\u0000\u0000@\r"+
		"\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000B\u000f\u0001\u0000"+
		"\u0000\u0000\u0005\u0013\u0019%+-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}