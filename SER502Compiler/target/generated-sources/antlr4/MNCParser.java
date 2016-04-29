// Generated from MNC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MNCParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_arithmetic = 4, RULE_var = 5, RULE_array = 6, RULE_type = 7, RULE_bool = 8, 
		RULE_assignment = 9, RULE_expr = 10, RULE_term = 11, RULE_factor = 12, 
		RULE_element = 13, RULE_number = 14, RULE_conditional = 15, RULE_loop = 16, 
		RULE_startlooppar = 17, RULE_looppar = 18, RULE_funcdeclaration = 19, 
		RULE_instatement = 20, RULE_outstatement = 21, RULE_printcall = 22, RULE_functioncall = 23, 
		RULE_boolcheck = 24, RULE_sign = 25;
	public static final String[] ruleNames = {
		"program", "body", "statements", "statement", "arithmetic", "var", "array", 
		"type", "bool", "assignment", "expr", "term", "factor", "element", "number", 
		"conditional", "loop", "startlooppar", "looppar", "funcdeclaration", "instatement", 
		"outstatement", "printcall", "functioncall", "boolcheck", "sign"
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

	@Override
	public String getGrammarFileName() { return "MNC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MNCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MNCParser.MAIN, 0); }
		public List<TerminalNode> EOL() { return getTokens(MNCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MNCParser.EOL, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<FuncdeclarationContext> funcdeclaration() {
			return getRuleContexts(FuncdeclarationContext.class);
		}
		public FuncdeclarationContext funcdeclaration(int i) {
			return getRuleContext(FuncdeclarationContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(54);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(52);
					funcdeclaration();
					}
					break;
				case NUM:
				case BOOLT:
					{
					setState(53);
					arithmetic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56);
				match(EOL);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(MAIN);
			setState(64);
			match(EOL);
			setState(65);
			body();
			setState(66);
			match(EOL);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(69);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(67);
					funcdeclaration();
					}
					break;
				case NUM:
				case BOOLT:
					{
					setState(68);
					arithmetic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71);
				match(EOL);
				}
				}
				setState(77);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(MNCParser.START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(MNCParser.END, 0); }
		public List<TerminalNode> EOL() { return getTokens(MNCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MNCParser.EOL, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(START);
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(84);
			statements();
			setState(85);
			match(END);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(EOL);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(MNCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MNCParser.EOL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << IF) | (1L << LOOP) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(92);
					statement();
					setState(93);
					match(EOL);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(100);
					match(EOL);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintcallContext printcall() {
			return getRuleContext(PrintcallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				printcall();
				}
				break;
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MNCParser.COLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
			match(COLON);
			setState(118);
			var();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				array();
				}
				break;
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

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MNCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MNCParser.IDENTIFIER, i);
		}
		public TerminalNode ARRAYOPEN() { return getToken(MNCParser.ARRAYOPEN, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(MNCParser.ARRAYCLOSE, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(MNCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MNCParser.DIGIT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(ARRAYOPEN);
			setState(132);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					match(DIGIT);
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case IDENTIFIER:
				{
				setState(131);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			match(ARRAYCLOSE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MNCParser.NUM, 0); }
		public TerminalNode BOOLT() { return getToken(MNCParser.BOOLT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==BOOLT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MNCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MNCParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MNCParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(MNCParser.READ, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				var();
				setState(141);
				match(EQUALS);
				setState(142);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				var();
				setState(145);
				match(EQUALS);
				setState(146);
				match(READ);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MNCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MNCParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(151);
				term();
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(153);
				expr();
				}
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MNCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MNCParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(158);
				factor();
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(160);
				term();
				}
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(OPENPAR);
				setState(166);
				expr();
				setState(167);
				match(CLOSEPAR);
				}
				break;
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

	public static class ElementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element);
		try {
			setState(174);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MNCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MNCParser.DIGIT, i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(DIGIT);
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(181);
				sign();
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					match(DIGIT);
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MNCParser.IF, 0); }
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public BoolcheckContext boolcheck() {
			return getRuleContext(BoolcheckContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(MNCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MNCParser.EOL, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MNCParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			match(OPENPAR);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(191);
				boolcheck();
				}
				break;
			case 2:
				{
				setState(192);
				var();
				}
				break;
			}
			setState(195);
			match(CLOSEPAR);
			{
			setState(196);
			match(EOL);
			setState(197);
			body();
			}
			setState(202);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(199);
				match(ELSE);
				{
				setState(200);
				match(EOL);
				setState(201);
				body();
				}
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(MNCParser.LOOP, 0); }
		public List<TerminalNode> OPENPAR() { return getTokens(MNCParser.OPENPAR); }
		public TerminalNode OPENPAR(int i) {
			return getToken(MNCParser.OPENPAR, i);
		}
		public List<TerminalNode> CLOSEPAR() { return getTokens(MNCParser.CLOSEPAR); }
		public TerminalNode CLOSEPAR(int i) {
			return getToken(MNCParser.CLOSEPAR, i);
		}
		public TerminalNode TO() { return getToken(MNCParser.TO, 0); }
		public TerminalNode WITH() { return getToken(MNCParser.WITH, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MNCParser.EOL, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StartloopparContext startlooppar() {
			return getRuleContext(StartloopparContext.class,0);
		}
		public LoopparContext looppar() {
			return getRuleContext(LoopparContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LOOP);
			setState(205);
			match(OPENPAR);
			{
			setState(206);
			startlooppar();
			}
			setState(207);
			match(CLOSEPAR);
			setState(208);
			match(TO);
			setState(209);
			match(OPENPAR);
			{
			setState(210);
			looppar();
			}
			setState(211);
			match(CLOSEPAR);
			setState(212);
			match(WITH);
			setState(213);
			number();
			setState(214);
			match(EOL);
			setState(215);
			body();
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

	public static class StartloopparContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StartloopparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startlooppar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterStartlooppar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitStartlooppar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitStartlooppar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartloopparContext startlooppar() throws RecognitionException {
		StartloopparContext _localctx = new StartloopparContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_startlooppar);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LoopparContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LoopparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_looppar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterLooppar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitLooppar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitLooppar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopparContext looppar() throws RecognitionException {
		LoopparContext _localctx = new LoopparContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_looppar);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncdeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MNCParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public TerminalNode EOL() { return getToken(MNCParser.EOL, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<InstatementContext> instatement() {
			return getRuleContexts(InstatementContext.class);
		}
		public InstatementContext instatement(int i) {
			return getRuleContext(InstatementContext.class,i);
		}
		public OutstatementContext outstatement() {
			return getRuleContext(OutstatementContext.class,0);
		}
		public FuncdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterFuncdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitFuncdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitFuncdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclarationContext funcdeclaration() throws RecognitionException {
		FuncdeclarationContext _localctx = new FuncdeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FUNCTION);
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(OPENPAR);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(228);
				instatement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			_la = _input.LA(1);
			if (_la==OUT) {
				{
				setState(234);
				outstatement();
				}
			}

			}
			setState(237);
			match(CLOSEPAR);
			setState(238);
			match(EOL);
			setState(239);
			body();
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

	public static class InstatementContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MNCParser.IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterInstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitInstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitInstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstatementContext instatement() throws RecognitionException {
		InstatementContext _localctx = new InstatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IN);
			setState(242);
			type();
			setState(243);
			var();
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

	public static class OutstatementContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(MNCParser.OUT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public OutstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterOutstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitOutstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitOutstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutstatementContext outstatement() throws RecognitionException {
		OutstatementContext _localctx = new OutstatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(OUT);
			setState(246);
			type();
			setState(247);
			match(IDENTIFIER);
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

	public static class PrintcallContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MNCParser.PRINT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrintcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterPrintcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitPrintcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitPrintcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintcallContext printcall() throws RecognitionException {
		PrintcallContext _localctx = new PrintcallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(PRINT);
			setState(253);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(250);
				var();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(251);
				bool();
				}
				break;
			case DIGIT:
			case OPENPAR:
				{
				setState(252);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(MNCParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(MNCParser.SEPERATOR, i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(OPENPAR);
			setState(258);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(257);
				var();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(260);
				match(SEPERATOR);
				setState(261);
				var();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(CLOSEPAR);
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

	public static class BoolcheckContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONDITIONS() { return getToken(MNCParser.CONDITIONS, 0); }
		public BoolcheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolcheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterBoolcheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitBoolcheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitBoolcheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolcheckContext boolcheck() throws RecognitionException {
		BoolcheckContext _localctx = new BoolcheckContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolcheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			expr();
			setState(270);
			match(CONDITIONS);
			setState(271);
			expr();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode ADD() { return getToken(MNCParser.ADD, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public TerminalNode SUB() { return getToken(MNCParser.SUB, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sign);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(OPENPAR);
				setState(274);
				match(ADD);
				setState(275);
				match(CLOSEPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(OPENPAR);
				setState(277);
				match(SUB);
				setState(278);
				match(CLOSEPAR);
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3"+
		"\3\3\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\4\3\4\3"+
		"\4\7\4b\n\4\f\4\16\4e\13\4\3\4\7\4h\n\4\f\4\16\4k\13\4\5\4m\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7}\n\7\3\b\3\b\3"+
		"\b\6\b\u0082\n\b\r\b\16\b\u0083\3\b\5\b\u0087\n\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\6\20"+
		"\u00b4\n\20\r\20\16\20\u00b5\3\20\3\20\6\20\u00ba\n\20\r\20\16\20\u00bb"+
		"\5\20\u00be\n\20\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00cd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00de\n\23\3\24\3\24\5\24"+
		"\u00e2\n\24\3\25\3\25\3\25\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb\13\25"+
		"\3\25\5\25\u00ee\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0100\n\30\3\31\3\31\3\31\5\31\u0105"+
		"\n\31\3\31\3\31\7\31\u0109\n\31\f\31\16\31\u010c\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011a\n\33\3\33\2\2"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\6\3\2\7"+
		"\b\3\2\t\n\3\2\31\32\3\2\33\34\u0126\2>\3\2\2\2\4P\3\2\2\2\6l\3\2\2\2"+
		"\bt\3\2\2\2\nv\3\2\2\2\f|\3\2\2\2\16~\3\2\2\2\20\u008a\3\2\2\2\22\u008c"+
		"\3\2\2\2\24\u0096\3\2\2\2\26\u009d\3\2\2\2\30\u00a4\3\2\2\2\32\u00ab\3"+
		"\2\2\2\34\u00b0\3\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2\2\"\u00ce\3\2\2"+
		"\2$\u00dd\3\2\2\2&\u00e1\3\2\2\2(\u00e3\3\2\2\2*\u00f3\3\2\2\2,\u00f7"+
		"\3\2\2\2.\u00fb\3\2\2\2\60\u0101\3\2\2\2\62\u010f\3\2\2\2\64\u0119\3\2"+
		"\2\2\669\5(\25\2\679\5\n\6\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:;\7\25"+
		"\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2"+
		"\2\2AB\7\4\2\2BC\7\25\2\2CD\5\4\3\2DM\7\25\2\2EH\5(\25\2FH\5\n\6\2GE\3"+
		"\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\25\2\2JL\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK"+
		"\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2PR\7\5\2\2QS\7\25\2\2RQ\3\2\2\2"+
		"ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\6\4\2W[\7\6\2\2XZ\7\25\2"+
		"\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2][\3\2\2\2^_\5"+
		"\b\5\2_`\7\25\2\2`b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dm"+
		"\3\2\2\2ec\3\2\2\2fh\7\25\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jm\3\2\2\2ki\3\2\2\2lc\3\2\2\2li\3\2\2\2m\7\3\2\2\2nu\5\n\6\2ou\5\24\13"+
		"\2pu\5\60\31\2qu\5 \21\2ru\5\"\22\2su\5.\30\2tn\3\2\2\2to\3\2\2\2tp\3"+
		"\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\t\3\2\2\2vw\5\20\t\2wx\7\"\2\2x"+
		"y\5\f\7\2y\13\3\2\2\2z}\7#\2\2{}\5\16\b\2|z\3\2\2\2|{\3\2\2\2}\r\3\2\2"+
		"\2~\177\7#\2\2\177\u0086\7\37\2\2\u0080\u0082\7\27\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0087\7#\2\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7 \2\2\u0089\17\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b\21\3\2\2\2\u008c\u008d\t\3\2\2\u008d\23\3\2\2\2\u008e\u008f"+
		"\5\f\7\2\u008f\u0090\7\26\2\2\u0090\u0091\5\26\f\2\u0091\u0097\3\2\2\2"+
		"\u0092\u0093\5\f\7\2\u0093\u0094\7\26\2\2\u0094\u0095\7\24\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\25\3\2\2\2\u0098"+
		"\u009e\5\30\r\2\u0099\u009a\5\30\r\2\u009a\u009b\t\4\2\2\u009b\u009c\5"+
		"\26\f\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\27\3\2\2\2\u009f\u00a5\5\32\16\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\t"+
		"\5\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00ac\5\34\17\2\u00a7\u00a8\7\35"+
		"\2\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\7\36\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00b1\5\f\7"+
		"\2\u00ae\u00b1\5\36\20\2\u00af\u00b1\5\22\n\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b4\7\27\2"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00be\3\2\2\2\u00b7\u00b9\5\64\33\2\u00b8\u00ba\7\27\2"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c3\7\35\2\2\u00c1\u00c4\5\62"+
		"\32\2\u00c2\u00c4\5\f\7\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5"+
		"\4\3\2\u00c8\u00cc\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7\25\2\2\u00cb"+
		"\u00cd\5\4\3\2\u00cc\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd!\3\2\2\2"+
		"\u00ce\u00cf\7\r\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\5&\24"+
		"\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\u00d9\7\25\2\2\u00d9\u00da\5\4\3\2\u00da#\3\2\2\2\u00db\u00de\7#\2\2"+
		"\u00dc\u00de\5\36\20\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de%"+
		"\3\2\2\2\u00df\u00e2\5\f\7\2\u00e0\u00e2\5\36\20\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5"+
		"\7#\2\2\u00e5\u00e9\7\35\2\2\u00e6\u00e8\5*\26\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\5,\27\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\36\2\2\u00f0\u00f1\7"+
		"\25\2\2\u00f1\u00f2\5\4\3\2\u00f2)\3\2\2\2\u00f3\u00f4\7\21\2\2\u00f4"+
		"\u00f5\5\20\t\2\u00f5\u00f6\5\f\7\2\u00f6+\3\2\2\2\u00f7\u00f8\7\22\2"+
		"\2\u00f8\u00f9\5\20\t\2\u00f9\u00fa\7#\2\2\u00fa-\3\2\2\2\u00fb\u00ff"+
		"\7\23\2\2\u00fc\u0100\5\f\7\2\u00fd\u0100\5\22\n\2\u00fe\u0100\5\36\20"+
		"\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100/"+
		"\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0104\7\35\2\2\u0103\u0105\5\f\7\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2\2\2\u0106\u0107\7!"+
		"\2\2\u0107\u0109\5\f\7\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7\36\2\2\u010e\61\3\2\2\2\u010f\u0110\5\26\f\2\u0110"+
		"\u0111\7\30\2\2\u0111\u0112\5\26\f\2\u0112\63\3\2\2\2\u0113\u0114\7\35"+
		"\2\2\u0114\u0115\7\31\2\2\u0115\u011a\7\36\2\2\u0116\u0117\7\35\2\2\u0117"+
		"\u0118\7\32\2\2\u0118\u011a\7\36\2\2\u0119\u0113\3\2\2\2\u0119\u0116\3"+
		"\2\2\2\u011a\65\3\2\2\2!8>GMT[cilt|\u0083\u0086\u0096\u009d\u00a4\u00ab"+
		"\u00b0\u00b5\u00bb\u00bd\u00c3\u00cc\u00dd\u00e1\u00e9\u00ed\u00ff\u0104"+
		"\u010a\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}