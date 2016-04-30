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
		RULE_looppar = 17, RULE_funcdeclaration = 18, RULE_instatement = 19, RULE_outstatement = 20, 
		RULE_printcall = 21, RULE_functioncall = 22, RULE_boolcheck = 23, RULE_sign = 24;
	public static final String[] ruleNames = {
		"program", "body", "statements", "statement", "arithmetic", "var", "array", 
		"type", "bool", "assignment", "expr", "term", "factor", "element", "number", 
		"conditional", "loop", "looppar", "funcdeclaration", "instatement", "outstatement", 
		"printcall", "functioncall", "boolcheck", "sign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'main'", "'start'", "'end'", "'number'", "'boolean'", "'true'", 
		"'false'", "'if'", "'else'", "'loop:'", "'to'", "'with'", "'function:'", 
		"'in:'", "'out:'", "'print:'", "'readInput'", null, "'='", null, null, 
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(52);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(50);
					funcdeclaration();
					}
					break;
				case NUM:
				case BOOLT:
					{
					setState(51);
					arithmetic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54);
				match(EOL);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(MAIN);
			setState(62);
			match(EOL);
			setState(63);
			body();
			setState(64);
			match(EOL);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(67);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(65);
					funcdeclaration();
					}
					break;
				case NUM:
				case BOOLT:
					{
					setState(66);
					arithmetic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69);
				match(EOL);
				}
				}
				setState(75);
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
			setState(76);
			match(START);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(82);
			statements();
			setState(83);
			match(END);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(EOL);
					}
					} 
				}
				setState(89);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << IF) | (1L << LOOP) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(90);
					statement();
					setState(91);
					match(EOL);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(98);
					match(EOL);
					}
					}
					setState(103);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
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
			setState(114);
			type();
			setState(115);
			match(COLON);
			setState(116);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(ARRAYOPEN);
			setState(130);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(DIGIT);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case IDENTIFIER:
				{
				setState(129);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
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
			setState(134);
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
			setState(136);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				var();
				setState(139);
				match(EQUALS);
				setState(140);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				var();
				setState(143);
				match(EQUALS);
				setState(144);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(149);
				term();
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(151);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				factor();
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(158);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(OPENPAR);
				setState(164);
				expr();
				setState(165);
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
			setState(172);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
			setState(185);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					match(DIGIT);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(179);
				sign();
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					match(DIGIT);
					}
					}
					setState(183); 
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
			setState(187);
			match(IF);
			setState(188);
			match(OPENPAR);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(189);
				boolcheck();
				}
				break;
			case 2:
				{
				setState(190);
				var();
				}
				break;
			}
			setState(193);
			match(CLOSEPAR);
			{
			setState(194);
			match(EOL);
			setState(195);
			body();
			}
			setState(200);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(197);
				match(ELSE);
				{
				setState(198);
				match(EOL);
				setState(199);
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
		public List<LoopparContext> looppar() {
			return getRuleContexts(LoopparContext.class);
		}
		public LoopparContext looppar(int i) {
			return getRuleContext(LoopparContext.class,i);
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
			setState(202);
			match(LOOP);
			setState(203);
			match(OPENPAR);
			{
			setState(204);
			looppar();
			}
			setState(205);
			match(CLOSEPAR);
			setState(206);
			match(TO);
			setState(207);
			match(OPENPAR);
			{
			setState(208);
			looppar();
			}
			setState(209);
			match(CLOSEPAR);
			setState(210);
			match(WITH);
			setState(211);
			number();
			setState(212);
			match(EOL);
			setState(213);
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

	public static class LoopparContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 34, RULE_looppar);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		enterRule(_localctx, 36, RULE_funcdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(FUNCTION);
			setState(220);
			match(IDENTIFIER);
			setState(221);
			match(OPENPAR);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(222);
				instatement();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_la = _input.LA(1);
			if (_la==OUT) {
				{
				setState(228);
				outstatement();
				}
			}

			}
			setState(231);
			match(CLOSEPAR);
			setState(232);
			match(EOL);
			setState(233);
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
		enterRule(_localctx, 38, RULE_instatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IN);
			setState(236);
			type();
			setState(237);
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
		enterRule(_localctx, 40, RULE_outstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(OUT);
			setState(240);
			type();
			setState(241);
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
		enterRule(_localctx, 42, RULE_printcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(PRINT);
			setState(247);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(244);
				var();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(245);
				bool();
				}
				break;
			case DIGIT:
			case OPENPAR:
				{
				setState(246);
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
		enterRule(_localctx, 44, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(250);
			match(OPENPAR);
			setState(252);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(251);
				var();
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(254);
				match(SEPERATOR);
				setState(255);
				var();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
		enterRule(_localctx, 46, RULE_boolcheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expr();
			setState(264);
			match(CONDITIONS);
			setState(265);
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
		enterRule(_localctx, 48, RULE_sign);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(OPENPAR);
				setState(268);
				match(ADD);
				setState(269);
				match(CLOSEPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(OPENPAR);
				setState(271);
				match(SUB);
				setState(272);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2F\n\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\6\3"+
		"Q\n\3\r\3\16\3R\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\4\3\4\3\4\7\4`\n"+
		"\4\f\4\16\4c\13\4\3\4\7\4f\n\4\f\4\16\4i\13\4\5\4k\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\6\b\u0080"+
		"\n\b\r\b\16\b\u0081\3\b\5\b\u0085\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u009c\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00aa\n\16\3\17\3\17\3\17\5\17\u00af\n\17\3\20\6\20\u00b2\n\20\r"+
		"\20\16\20\u00b3\3\20\3\20\6\20\u00b8\n\20\r\20\16\20\u00b9\5\20\u00bc"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u00c2\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00cb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\5\23\u00dc\n\23\3\24\3\24\3\24\3\24\7\24\u00e2"+
		"\n\24\f\24\16\24\u00e5\13\24\3\24\5\24\u00e8\n\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00fa"+
		"\n\27\3\30\3\30\3\30\5\30\u00ff\n\30\3\30\3\30\7\30\u0103\n\30\f\30\16"+
		"\30\u0106\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0114\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\6\3\2\7\b\3\2\t\n\3\2\31\32\3\2\33\34\u0120\2<\3"+
		"\2\2\2\4N\3\2\2\2\6j\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fz\3\2\2\2\16|\3\2"+
		"\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0094\3\2\2\2\26\u009b\3\2\2"+
		"\2\30\u00a2\3\2\2\2\32\u00a9\3\2\2\2\34\u00ae\3\2\2\2\36\u00bb\3\2\2\2"+
		" \u00bd\3\2\2\2\"\u00cc\3\2\2\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00ed\3"+
		"\2\2\2*\u00f1\3\2\2\2,\u00f5\3\2\2\2.\u00fb\3\2\2\2\60\u0109\3\2\2\2\62"+
		"\u0113\3\2\2\2\64\67\5&\24\2\65\67\5\n\6\2\66\64\3\2\2\2\66\65\3\2\2\2"+
		"\678\3\2\2\289\7\25\2\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\4\2\2@A\7\25\2\2AB\5\4\3\2BK\7\25\2\2C"+
		"F\5&\24\2DF\5\n\6\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GH\7\25\2\2HJ\3\2\2\2"+
		"IE\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MK\3\2\2\2NP\7\5\2"+
		"\2OQ\7\25\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5\6"+
		"\4\2UY\7\6\2\2VX\7\25\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\5\3"+
		"\2\2\2[Y\3\2\2\2\\]\5\b\5\2]^\7\25\2\2^`\3\2\2\2_\\\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2bk\3\2\2\2ca\3\2\2\2df\7\25\2\2ed\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2ja\3\2\2\2jg\3\2\2\2k\7\3\2"+
		"\2\2ls\5\n\6\2ms\5\24\13\2ns\5.\30\2os\5 \21\2ps\5\"\22\2qs\5,\27\2rl"+
		"\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\t\3\2\2\2"+
		"tu\5\20\t\2uv\7\"\2\2vw\5\f\7\2w\13\3\2\2\2x{\7#\2\2y{\5\16\b\2zx\3\2"+
		"\2\2zy\3\2\2\2{\r\3\2\2\2|}\7#\2\2}\u0084\7\37\2\2~\u0080\7\27\2\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0085\7#\2\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0087\7 \2\2\u0087\17\3\2\2\2\u0088\u0089"+
		"\t\2\2\2\u0089\21\3\2\2\2\u008a\u008b\t\3\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\5\f\7\2\u008d\u008e\7\26\2\2\u008e\u008f\5\26\f\2\u008f\u0095\3\2\2\2"+
		"\u0090\u0091\5\f\7\2\u0091\u0092\7\26\2\2\u0092\u0093\7\24\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095\25\3\2\2\2\u0096"+
		"\u009c\5\30\r\2\u0097\u0098\5\30\r\2\u0098\u0099\t\4\2\2\u0099\u009a\5"+
		"\26\f\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c"+
		"\27\3\2\2\2\u009d\u00a3\5\32\16\2\u009e\u009f\5\32\16\2\u009f\u00a0\t"+
		"\5\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00aa\5\34\17\2\u00a5\u00a6\7\35"+
		"\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\36\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00af\5\f\7"+
		"\2\u00ac\u00af\5\36\20\2\u00ad\u00af\5\22\n\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b2\7\27\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00b7\5\62\32\2\u00b6\u00b8\7\27\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bc"+
		"\37\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00c1\7\35\2\2\u00bf\u00c2\5\60"+
		"\31\2\u00c0\u00c2\5\f\7\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5"+
		"\4\3\2\u00c6\u00ca\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7\25\2\2\u00c9"+
		"\u00cb\5\4\3\2\u00ca\u00c7\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb!\3\2\2\2"+
		"\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0"+
		"\7\36\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\5$\23"+
		"\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\5\36\20\2\u00d6"+
		"\u00d7\7\25\2\2\u00d7\u00d8\5\4\3\2\u00d8#\3\2\2\2\u00d9\u00dc\7#\2\2"+
		"\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc%"+
		"\3\2\2\2\u00dd\u00de\7\20\2\2\u00de\u00df\7#\2\2\u00df\u00e3\7\35\2\2"+
		"\u00e0\u00e2\5(\25\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\5*\26\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec\5\4\3\2\u00ec"+
		"\'\3\2\2\2\u00ed\u00ee\7\21\2\2\u00ee\u00ef\5\20\t\2\u00ef\u00f0\5\f\7"+
		"\2\u00f0)\3\2\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4"+
		"\7#\2\2\u00f4+\3\2\2\2\u00f5\u00f9\7\23\2\2\u00f6\u00fa\5\f\7\2\u00f7"+
		"\u00fa\5\22\n\2\u00f8\u00fa\5\36\20\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fe"+
		"\7\35\2\2\u00fd\u00ff\5\f\7\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u0104\3\2\2\2\u0100\u0101\7!\2\2\u0101\u0103\5\f\7\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\36\2\2\u0108/\3\2\2\2"+
		"\u0109\u010a\5\26\f\2\u010a\u010b\7\30\2\2\u010b\u010c\5\26\f\2\u010c"+
		"\61\3\2\2\2\u010d\u010e\7\35\2\2\u010e\u010f\7\31\2\2\u010f\u0114\7\36"+
		"\2\2\u0110\u0111\7\35\2\2\u0111\u0112\7\32\2\2\u0112\u0114\7\36\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\63\3\2\2\2 \66<EKRYagjrz\u0081"+
		"\u0084\u0094\u009b\u00a2\u00a9\u00ae\u00b3\u00b9\u00bb\u00c1\u00ca\u00db"+
		"\u00e3\u00e7\u00f9\u00fe\u0104\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}