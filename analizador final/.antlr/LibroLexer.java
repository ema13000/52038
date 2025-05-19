// Generated from c:/Users/Ema/analizador/analizador final/Libro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LibroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FN=1, READ=2, WRITE=3, EQ=4, LPAREN=5, RPAREN=6, LCURLY=7, RCURLY=8, COMMA=9, 
		SEMI=10, ID=11, INT=12, STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FN", "READ", "WRITE", "EQ", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"COMMA", "SEMI", "ID", "INT", "STRING", "WS"
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


	public LibroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Libro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nD\b\n\n\n\f\nG\t\n\u0001"+
		"\u000b\u0004\u000bJ\b\u000b\u000b\u000b\f\u000bK\u0001\f\u0001\f\u0005"+
		"\fP\b\f\n\f\f\fS\t\f\u0001\f\u0001\f\u0001\r\u0004\rX\b\r\u000b\r\f\r"+
		"Y\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000"+
		"\t\n\f\r  `\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001d\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005"+
		"*\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000"+
		"\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?"+
		"\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017I\u0001\u0000"+
		"\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005f\u0000\u0000\u001e\u001f\u0005u\u0000\u0000\u001f "+
		"\u0005n\u0000\u0000 !\u0005c\u0000\u0000!\"\u0005i\u0000\u0000\"#\u0005"+
		"o\u0000\u0000#$\u0005n\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005"+
		"l\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005e\u0000\u0000()\u0005r\u0000"+
		"\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005e\u0000\u0000+,\u0005s\u0000"+
		"\u0000,-\u0005c\u0000\u0000-.\u0005r\u0000\u0000./\u0005i\u0000\u0000"+
		"/0\u0005b\u0000\u000001\u0005i\u0000\u000012\u0005r\u0000\u00002\u0006"+
		"\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\b\u0001\u0000\u0000\u0000"+
		"56\u0005(\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005)\u0000\u0000"+
		"8\f\u0001\u0000\u0000\u00009:\u0005{\u0000\u0000:\u000e\u0001\u0000\u0000"+
		"\u0000;<\u0005}\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005,\u0000"+
		"\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005;\u0000\u0000@\u0014\u0001"+
		"\u0000\u0000\u0000AE\u0007\u0000\u0000\u0000BD\u0007\u0001\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HJ\u0007\u0002\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000L\u0018\u0001\u0000\u0000\u0000MQ\u0005\"\u0000\u0000NP\b\u0003"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0005\"\u0000\u0000U\u001a\u0001\u0000\u0000"+
		"\u0000VX\u0007\u0004\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0006\r\u0000\u0000\\\u001c\u0001\u0000\u0000\u0000"+
		"\u0005\u0000EKQY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}