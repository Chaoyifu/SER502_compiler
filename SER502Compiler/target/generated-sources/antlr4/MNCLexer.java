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
		T__0=1, T__1=2, T__2=3, WS=4, MAIN=5, START=6, END=7, PROGRAMEND=8, IDENTIFIER=9, 
		EOD=10, EQUALS=11, SIGN=12, DIGIT=13, TRUE=14, FALSE=15, CONDITIONS=16, 
		ADD=17, MUL=18, OPENPAR=19, CLOSEPAR=20, SEPERATOR=21, IF=22, ELSE=23, 
		LOOP=24, TO=25, WITH=26, FUNCTION=27, IN=28, OUT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WS", "MAIN", "START", "END", "PROGRAMEND", "IDENTIFIER", 
		"EOD", "EQUALS", "SIGN", "DIGIT", "TRUE", "FALSE", "CONDITIONS", "ADD", 
		"MUL", "OPENPAR", "CLOSEPAR", "SEPERATOR", "IF", "ELSE", "LOOP", "TO", 
		"WITH", "FUNCTION", "IN", "OUT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'number'", "'boolean'", null, "'main'", "'start'", "'end'", 
		"'mainEnd'", null, "'\n'", "'='", null, null, "'true'", "'false'", null, 
		null, null, "'('", "')'", "','", "'if'", "'else'", "'loop:'", "'to'", 
		"'with'", "'function:'", "'in:'", "'out:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "MAIN", "START", "END", "PROGRAMEND", "IDENTIFIER", 
		"EOD", "EQUALS", "SIGN", "DIGIT", "TRUE", "FALSE", "CONDITIONS", "ADD", 
		"MUL", "OPENPAR", "CLOSEPAR", "SEPERATOR", "IF", "ELSE", "LOOP", "TO", 
		"WITH", "FUNCTION", "IN", "OUT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5P\n\5\r"+
		"\5\16\5Q\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\nn\n\n\3\n\7\nq\n\n\f\n\16"+
		"\nt\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0092\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2"+
		"\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37\3\2\t\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\3\2\62"+
		";\4\2>>@@\4\2,,\61\61\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7F\3\2\2\2\tO"+
		"\3\2\2\2\13U\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21d\3\2\2\2\23m\3\2\2\2\25"+
		"u\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\u0082\3\2"+
		"\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099"+
		"\3\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u00a0\3\2\2\2\61\u00a5\3\2\2\2"+
		"\63\u00ab\3\2\2\2\65\u00ae\3\2\2\2\67\u00b3\3\2\2\29\u00bd\3\2\2\2;\u00c1"+
		"\3\2\2\2=>\7<\2\2>\4\3\2\2\2?@\7p\2\2@A\7w\2\2AB\7o\2\2BC\7d\2\2CD\7g"+
		"\2\2DE\7t\2\2E\6\3\2\2\2FG\7d\2\2GH\7q\2\2HI\7q\2\2IJ\7n\2\2JK\7g\2\2"+
		"KL\7c\2\2LM\7p\2\2M\b\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RS\3\2\2\2ST\b\5\2\2T\n\3\2\2\2UV\7o\2\2VW\7c\2\2WX\7k\2\2X"+
		"Y\7p\2\2Y\f\3\2\2\2Z[\7u\2\2[\\\7v\2\2\\]\7c\2\2]^\7t\2\2^_\7v\2\2_\16"+
		"\3\2\2\2`a\7g\2\2ab\7p\2\2bc\7f\2\2c\20\3\2\2\2de\7o\2\2ef\7c\2\2fg\7"+
		"k\2\2gh\7p\2\2hi\7G\2\2ij\7p\2\2jk\7f\2\2k\22\3\2\2\2ln\t\3\2\2ml\3\2"+
		"\2\2nr\3\2\2\2oq\t\4\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\24\3"+
		"\2\2\2tr\3\2\2\2uv\7\f\2\2v\26\3\2\2\2wx\7?\2\2x\30\3\2\2\2yz\t\5\2\2"+
		"z\32\3\2\2\2{|\t\6\2\2|\34\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2"+
		"\2\u0080\u0081\7g\2\2\u0081\36\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087"+
		" \3\2\2\2\u0088\u0089\7?\2\2\u0089\u0092\7?\2\2\u008a\u008b\7#\2\2\u008b"+
		"\u0092\7?\2\2\u008c\u008d\7>\2\2\u008d\u0092\7?\2\2\u008e\u008f\7@\2\2"+
		"\u008f\u0092\7?\2\2\u0090\u0092\t\7\2\2\u0091\u0088\3\2\2\2\u0091\u008a"+
		"\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\t\5\2\2\u0094$\3\2\2\2\u0095\u0096\t\b\2\2\u0096"+
		"&\3\2\2\2\u0097\u0098\7*\2\2\u0098(\3\2\2\2\u0099\u009a\7+\2\2\u009a*"+
		"\3\2\2\2\u009b\u009c\7.\2\2\u009c,\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7h\2\2\u009f.\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\62\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7q\2\2\u00ad\64\3\2\2\2\u00ae"+
		"\u00af\7y\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2"+
		"\u00b2\66\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7"+
		"p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7<\2\2\u00bc8\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7<\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7<\2\2\u00c5"+
		"<\3\2\2\2\b\2Qmpr\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}