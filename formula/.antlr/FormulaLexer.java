// Generated from /Users/xzhang1/Desktop/state/formula/Formula.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACKET=1, RBRACKET=2, ELEMENT=3, NUMBER=4, WHITESPACE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LBRACKET", "RBRACKET", "ELEMENT", "NUMBER", "DIGIT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACKET", "RBRACKET", "ELEMENT", "NUMBER", "WHITESPACE"
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


	public FormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e1\n\4\3\5\6\5\u00e4\n\5"+
		"\r\5\16\5\u00e5\3\5\3\5\6\5\u00ea\n\5\r\5\16\5\u00eb\5\5\u00ee\n\5\3\6"+
		"\3\6\3\7\6\7\u00f3\n\7\r\7\16\7\u00f4\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13"+
		"\2\r\7\3\2\b\4\2**]]\4\2++__\5\2DEHHPQ\4\2RRUU\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u0164\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2"+
		"\2\3\17\3\2\2\2\5\21\3\2\2\2\7\u00e0\3\2\2\2\t\u00e3\3\2\2\2\13\u00ef"+
		"\3\2\2\2\r\u00f2\3\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\22\t\3\2\2\22\6"+
		"\3\2\2\2\23\u00e1\7J\2\2\24\25\7J\2\2\25\u00e1\7g\2\2\26\27\7N\2\2\27"+
		"\u00e1\7k\2\2\30\31\7D\2\2\31\u00e1\7g\2\2\32\u00e1\t\4\2\2\33\34\7P\2"+
		"\2\34\u00e1\7g\2\2\35\36\7P\2\2\36\u00e1\7c\2\2\37 \7O\2\2 \u00e1\7i\2"+
		"\2!\"\7C\2\2\"\u00e1\7n\2\2#$\7U\2\2$\u00e1\7k\2\2%\u00e1\t\5\2\2&\'\7"+
		"E\2\2\'\u00e1\7n\2\2()\7C\2\2)\u00e1\7t\2\2*\u00e1\7M\2\2+,\7E\2\2,\u00e1"+
		"\7c\2\2-.\7U\2\2.\u00e1\7e\2\2/\60\7V\2\2\60\u00e1\7k\2\2\61\u00e1\7X"+
		"\2\2\62\63\7E\2\2\63\u00e1\7t\2\2\64\65\7O\2\2\65\u00e1\7p\2\2\66\67\7"+
		"H\2\2\67\u00e1\7g\2\289\7P\2\29\u00e1\7k\2\2:;\7E\2\2;\u00e1\7q\2\2<="+
		"\7E\2\2=\u00e1\7w\2\2>?\7\\\2\2?\u00e1\7p\2\2@A\7I\2\2A\u00e1\7c\2\2B"+
		"C\7I\2\2C\u00e1\7g\2\2DE\7C\2\2E\u00e1\7u\2\2FG\7U\2\2G\u00e1\7g\2\2H"+
		"I\7D\2\2I\u00e1\7t\2\2JK\7M\2\2K\u00e1\7t\2\2LM\7T\2\2M\u00e1\7d\2\2N"+
		"O\7U\2\2O\u00e1\7t\2\2P\u00e1\7[\2\2QR\7\\\2\2R\u00e1\7t\2\2ST\7P\2\2"+
		"T\u00e1\7d\2\2UV\7O\2\2V\u00e1\7q\2\2WX\7V\2\2X\u00e1\7e\2\2YZ\7T\2\2"+
		"Z\u00e1\7w\2\2[\\\7T\2\2\\\u00e1\7j\2\2]^\7R\2\2^\u00e1\7f\2\2_`\7C\2"+
		"\2`\u00e1\7i\2\2ab\7E\2\2b\u00e1\7f\2\2cd\7K\2\2d\u00e1\7p\2\2ef\7U\2"+
		"\2f\u00e1\7p\2\2gh\7U\2\2h\u00e1\7d\2\2ij\7V\2\2j\u00e1\7g\2\2k\u00e1"+
		"\7K\2\2lm\7Z\2\2m\u00e1\7g\2\2no\7E\2\2o\u00e1\7u\2\2pq\7D\2\2q\u00e1"+
		"\7c\2\2rs\7N\2\2s\u00e1\7c\2\2tu\7E\2\2u\u00e1\7g\2\2vw\7R\2\2w\u00e1"+
		"\7t\2\2xy\7P\2\2y\u00e1\7f\2\2z{\7R\2\2{\u00e1\7o\2\2|}\7U\2\2}\u00e1"+
		"\7o\2\2~\177\7G\2\2\177\u00e1\7w\2\2\u0080\u0081\7I\2\2\u0081\u00e1\7"+
		"f\2\2\u0082\u0083\7V\2\2\u0083\u00e1\7d\2\2\u0084\u0085\7F\2\2\u0085\u00e1"+
		"\7{\2\2\u0086\u0087\7J\2\2\u0087\u00e1\7q\2\2\u0088\u0089\7G\2\2\u0089"+
		"\u00e1\7t\2\2\u008a\u008b\7V\2\2\u008b\u00e1\7o\2\2\u008c\u008d\7[\2\2"+
		"\u008d\u00e1\7d\2\2\u008e\u008f\7N\2\2\u008f\u00e1\7w\2\2\u0090\u0091"+
		"\7J\2\2\u0091\u00e1\7h\2\2\u0092\u0093\7V\2\2\u0093\u00e1\7c\2\2\u0094"+
		"\u00e1\7Y\2\2\u0095\u0096\7T\2\2\u0096\u00e1\7g\2\2\u0097\u0098\7Q\2\2"+
		"\u0098\u00e1\7u\2\2\u0099\u009a\7K\2\2\u009a\u00e1\7t\2\2\u009b\u009c"+
		"\7R\2\2\u009c\u00e1\7v\2\2\u009d\u009e\7C\2\2\u009e\u00e1\7w\2\2\u009f"+
		"\u00a0\7J\2\2\u00a0\u00e1\7i\2\2\u00a1\u00a2\7V\2\2\u00a2\u00e1\7n\2\2"+
		"\u00a3\u00a4\7R\2\2\u00a4\u00e1\7d\2\2\u00a5\u00a6\7D\2\2\u00a6\u00e1"+
		"\7k\2\2\u00a7\u00a8\7V\2\2\u00a8\u00e1\7j\2\2\u00a9\u00aa\7R\2\2\u00aa"+
		"\u00e1\7c\2\2\u00ab\u00e1\7W\2\2\u00ac\u00ad\7P\2\2\u00ad\u00e1\7r\2\2"+
		"\u00ae\u00af\7R\2\2\u00af\u00e1\7w\2\2\u00b0\u00b1\7C\2\2\u00b1\u00e1"+
		"\7o\2\2\u00b2\u00b3\7E\2\2\u00b3\u00e1\7o\2\2\u00b4\u00b5\7D\2\2\u00b5"+
		"\u00e1\7m\2\2\u00b6\u00b7\7E\2\2\u00b7\u00e1\7h\2\2\u00b8\u00b9\7G\2\2"+
		"\u00b9\u00e1\7u\2\2\u00ba\u00bb\7H\2\2\u00bb\u00e1\7o\2\2\u00bc\u00bd"+
		"\7O\2\2\u00bd\u00e1\7f\2\2\u00be\u00bf\7P\2\2\u00bf\u00e1\7q\2\2\u00c0"+
		"\u00c1\7N\2\2\u00c1\u00e1\7t\2\2\u00c2\u00c3\7T\2\2\u00c3\u00e1\7h\2\2"+
		"\u00c4\u00c5\7F\2\2\u00c5\u00e1\7d\2\2\u00c6\u00c7\7U\2\2\u00c7\u00e1"+
		"\7i\2\2\u00c8\u00c9\7D\2\2\u00c9\u00e1\7j\2\2\u00ca\u00cb\7J\2\2\u00cb"+
		"\u00e1\7u\2\2\u00cc\u00cd\7O\2\2\u00cd\u00e1\7v\2\2\u00ce\u00cf\7F\2\2"+
		"\u00cf\u00e1\7u\2\2\u00d0\u00d1\7T\2\2\u00d1\u00e1\7i\2\2\u00d2\u00d3"+
		"\7E\2\2\u00d3\u00e1\7p\2\2\u00d4\u00d5\7P\2\2\u00d5\u00e1\7j\2\2\u00d6"+
		"\u00d7\7H\2\2\u00d7\u00e1\7n\2\2\u00d8\u00d9\7O\2\2\u00d9\u00e1\7e\2\2"+
		"\u00da\u00db\7N\2\2\u00db\u00e1\7x\2\2\u00dc\u00dd\7V\2\2\u00dd\u00e1"+
		"\7u\2\2\u00de\u00df\7Q\2\2\u00df\u00e1\7i\2\2\u00e0\23\3\2\2\2\u00e0\24"+
		"\3\2\2\2\u00e0\26\3\2\2\2\u00e0\30\3\2\2\2\u00e0\32\3\2\2\2\u00e0\33\3"+
		"\2\2\2\u00e0\35\3\2\2\2\u00e0\37\3\2\2\2\u00e0!\3\2\2\2\u00e0#\3\2\2\2"+
		"\u00e0%\3\2\2\2\u00e0&\3\2\2\2\u00e0(\3\2\2\2\u00e0*\3\2\2\2\u00e0+\3"+
		"\2\2\2\u00e0-\3\2\2\2\u00e0/\3\2\2\2\u00e0\61\3\2\2\2\u00e0\62\3\2\2\2"+
		"\u00e0\64\3\2\2\2\u00e0\66\3\2\2\2\u00e08\3\2\2\2\u00e0:\3\2\2\2\u00e0"+
		"<\3\2\2\2\u00e0>\3\2\2\2\u00e0@\3\2\2\2\u00e0B\3\2\2\2\u00e0D\3\2\2\2"+
		"\u00e0F\3\2\2\2\u00e0H\3\2\2\2\u00e0J\3\2\2\2\u00e0L\3\2\2\2\u00e0N\3"+
		"\2\2\2\u00e0P\3\2\2\2\u00e0Q\3\2\2\2\u00e0S\3\2\2\2\u00e0U\3\2\2\2\u00e0"+
		"W\3\2\2\2\u00e0Y\3\2\2\2\u00e0[\3\2\2\2\u00e0]\3\2\2\2\u00e0_\3\2\2\2"+
		"\u00e0a\3\2\2\2\u00e0c\3\2\2\2\u00e0e\3\2\2\2\u00e0g\3\2\2\2\u00e0i\3"+
		"\2\2\2\u00e0k\3\2\2\2\u00e0l\3\2\2\2\u00e0n\3\2\2\2\u00e0p\3\2\2\2\u00e0"+
		"r\3\2\2\2\u00e0t\3\2\2\2\u00e0v\3\2\2\2\u00e0x\3\2\2\2\u00e0z\3\2\2\2"+
		"\u00e0|\3\2\2\2\u00e0~\3\2\2\2\u00e0\u0080\3\2\2\2\u00e0\u0082\3\2\2\2"+
		"\u00e0\u0084\3\2\2\2\u00e0\u0086\3\2\2\2\u00e0\u0088\3\2\2\2\u00e0\u008a"+
		"\3\2\2\2\u00e0\u008c\3\2\2\2\u00e0\u008e\3\2\2\2\u00e0\u0090\3\2\2\2\u00e0"+
		"\u0092\3\2\2\2\u00e0\u0094\3\2\2\2\u00e0\u0095\3\2\2\2\u00e0\u0097\3\2"+
		"\2\2\u00e0\u0099\3\2\2\2\u00e0\u009b\3\2\2\2\u00e0\u009d\3\2\2\2\u00e0"+
		"\u009f\3\2\2\2\u00e0\u00a1\3\2\2\2\u00e0\u00a3\3\2\2\2\u00e0\u00a5\3\2"+
		"\2\2\u00e0\u00a7\3\2\2\2\u00e0\u00a9\3\2\2\2\u00e0\u00ab\3\2\2\2\u00e0"+
		"\u00ac\3\2\2\2\u00e0\u00ae\3\2\2\2\u00e0\u00b0\3\2\2\2\u00e0\u00b2\3\2"+
		"\2\2\u00e0\u00b4\3\2\2\2\u00e0\u00b6\3\2\2\2\u00e0\u00b8\3\2\2\2\u00e0"+
		"\u00ba\3\2\2\2\u00e0\u00bc\3\2\2\2\u00e0\u00be\3\2\2\2\u00e0\u00c0\3\2"+
		"\2\2\u00e0\u00c2\3\2\2\2\u00e0\u00c4\3\2\2\2\u00e0\u00c6\3\2\2\2\u00e0"+
		"\u00c8\3\2\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00ce\3\2"+
		"\2\2\u00e0\u00d0\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dc\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\b\3\2\2\2\u00e2\u00e4\5\13\6\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ed\3\2\2\2\u00e7\u00e9\7\60\2\2\u00e8\u00ea\5\13\6\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\n\3\2\2\2"+
		"\u00ef\u00f0\t\6\2\2\u00f0\f\3\2\2\2\u00f1\u00f3\t\7\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\b\7\2\2\u00f7\16\3\2\2\2\b\2\u00e0\u00e5\u00eb"+
		"\u00ed\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}