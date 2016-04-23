// Generated from MNC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MNCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAIN=2, START=3, END=4, NUM=5, BOOLT=6, TRUE=7, FALSE=8, IF=9, ELSE=10, 
		LOOP=11, TO=12, WITH=13, FUNCTION=14, IN=15, OUT=16, PRINT=17, READ=18, 
		EOL=19, EQUALS=20, DIGIT=21, CONDITIONS=22, ADD=23, SUB=24, MUL=25, DIV=26, 
		OPENPAR=27, CLOSEPAR=28, ARRAYOPEN=29, ARRAYCLOSE=30, SEPERATOR=31, COLON=32, 
		IDENTIFIER=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "MAIN", "START", "END", "NUM", "BOOLT", "TRUE", "FALSE", "IF", "ELSE", 
		"LOOP", "TO", "WITH", "FUNCTION", "IN", "OUT", "PRINT", "READ", "EOL", 
		"EQUALS", "DIGIT", "CONDITIONS", "ADD", "SUB", "MUL", "DIV", "OPENPAR", 
		"CLOSEPAR", "ARRAYOPEN", "ARRAYCLOSE", "SEPERATOR", "COLON", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'main'", "'start'", "'end'", "'number'", "'boolean'", "'true'", 
		"'false'", "'if'", "'else'", "'loop:'", "'to'", "'with'", "'function:'", 
		"'in:'", "'out:'", "'print:'", "'readInput'", "'\n'", "'='", null, null, 
		"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "MAIN", "START", "END", "NUM", "BOOLT", "TRUE", "FALSE", "IF", 
		"ELSE", "LOOP", "TO", "WITH", "FUNCTION", "IN", "OUT", "PRINT", "READ", 
		"EOL", "EQUALS", "DIGIT", "CONDITIONS", "ADD", "SUB", "MUL", "DIV", "OPENPAR", 
		"CLOSEPAR", "ARRAYOPEN", "ARRAYCLOSE", "SEPERATOR", "COLON", "IDENTIFIER"
	};
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


	public MNCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MNC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00bf\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\5\"\u00d6\n\"\3\"\7\"\u00d9"+
		"\n\"\f\"\16\"\u00dc\13\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\4\2\13\13\17\17\3\2\62;\4"+
		"\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\u00e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\3F\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2\13[\3\2"+
		"\2\2\rb\3\2\2\2\17j\3\2\2\2\21o\3\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27}\3"+
		"\2\2\2\31\u0083\3\2\2\2\33\u0086\3\2\2\2\35\u008b\3\2\2\2\37\u0095\3\2"+
		"\2\2!\u0099\3\2\2\2#\u009e\3\2\2\2%\u00a5\3\2\2\2\'\u00af\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b3\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00ca\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C\u00d5\3\2\2\2E"+
		"G\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\2\2\2"+
		"K\4\3\2\2\2LM\7o\2\2MN\7c\2\2NO\7k\2\2OP\7p\2\2P\6\3\2\2\2QR\7u\2\2RS"+
		"\7v\2\2ST\7c\2\2TU\7t\2\2UV\7v\2\2V\b\3\2\2\2WX\7g\2\2XY\7p\2\2YZ\7f\2"+
		"\2Z\n\3\2\2\2[\\\7p\2\2\\]\7w\2\2]^\7o\2\2^_\7d\2\2_`\7g\2\2`a\7t\2\2"+
		"a\f\3\2\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2fg\7g\2\2gh\7c\2\2hi\7"+
		"p\2\2i\16\3\2\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mn\7g\2\2n\20\3\2\2\2op\7"+
		"h\2\2pq\7c\2\2qr\7n\2\2rs\7u\2\2st\7g\2\2t\22\3\2\2\2uv\7k\2\2vw\7h\2"+
		"\2w\24\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\26\3\2\2\2}~\7n\2"+
		"\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0081\7r\2\2\u0081\u0082\7<\2\2"+
		"\u0082\30\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2\u0085\32\3\2\2"+
		"\2\u0086\u0087\7y\2\2\u0087\u0088\7k\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7j\2\2\u008a\34\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7w\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093\u0094\7<\2\2\u0094\36\3\2\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7<\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7w\2\2\u009b\u009c\7v\2\2\u009c\u009d\7<\2\2"+
		"\u009d\"\3\2\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k"+
		"\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7<\2\2\u00a4$\3"+
		"\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7r\2\2"+
		"\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae&\3\2\2\2\u00af\u00b0\7\f"+
		"\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2*\3\2\2\2\u00b3\u00b4\t\3"+
		"\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00bf\7?\2\2\u00b7\u00b8"+
		"\7#\2\2\u00b8\u00bf\7?\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bf\7?\2\2\u00bb"+
		"\u00bc\7@\2\2\u00bc\u00bf\7?\2\2\u00bd\u00bf\t\4\2\2\u00be\u00b5\3\2\2"+
		"\2\u00be\u00b7\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\60\3\2\2\2\u00c2\u00c3"+
		"\7/\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\7\61\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7*\2\2\u00c98\3\2\2\2\u00ca\u00cb"+
		"\7+\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7]\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7"+
		"_\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7<"+
		"\2\2\u00d3B\3\2\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00da"+
		"\3\2\2\2\u00d7\u00d9\t\6\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00dbD\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\b\2H\u00be\u00d5\u00d8\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}