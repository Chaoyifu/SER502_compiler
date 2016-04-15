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
		T__0=1, T__1=2, T__2=3, WS=4, MAIN=5, START=6, END=7, PROGRAMEND=8, IDENTIFIER=9, 
		EOD=10, EQUALS=11, SIGN=12, DIGIT=13, TRUE=14, FALSE=15, CONDITIONS=16, 
		ADD=17, MUL=18, OPENPAR=19, CLOSEPAR=20, SEPERATOR=21, IF=22, ELSE=23, 
		LOOP=24, TO=25, WITH=26, FUNCTION=27, IN=28, OUT=29;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_arithmetic = 4, RULE_type = 5, RULE_bool = 6, RULE_assignment = 7, 
		RULE_expr = 8, RULE_factor = 9, RULE_number = 10, RULE_functioncall = 11, 
		RULE_conditional = 12, RULE_boolcheck = 13, RULE_loop = 14, RULE_funcdeclaration = 15, 
		RULE_num = 16, RULE_boolt = 17;
	public static final String[] ruleNames = {
		"program", "body", "statements", "statement", "arithmetic", "type", "bool", 
		"assignment", "expr", "factor", "number", "functioncall", "conditional", 
		"boolcheck", "loop", "funcdeclaration", "num", "boolt"
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
		public TerminalNode EOD() { return getToken(MNCParser.EOD, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(MAIN);
			setState(37);
			match(EOD);
			setState(38);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(MNCParser.START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(MNCParser.END, 0); }
		public List<TerminalNode> EOD() { return getTokens(MNCParser.EOD); }
		public TerminalNode EOD(int i) {
			return getToken(MNCParser.EOD, i);
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
			setState(40);
			match(START);
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					match(EOD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(46);
			statements();
			setState(47);
			match(END);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(EOD);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public List<TerminalNode> EOD() { return getTokens(MNCParser.EOD); }
		public TerminalNode EOD(int i) {
			return getToken(MNCParser.EOD, i);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << IDENTIFIER) | (1L << EOD) | (1L << IF) | (1L << LOOP) | (1L << FUNCTION))) != 0)) {
					{
					{
					setState(54);
					statement();
					setState(55);
					match(EOD);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOD) {
					{
					{
					setState(62);
					match(EOD);
					}
					}
					setState(67);
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
		public FuncdeclarationContext funcdeclaration() {
			return getRuleContext(FuncdeclarationContext.class,0);
		}
		public List<TerminalNode> EOD() { return getTokens(MNCParser.EOD); }
		public TerminalNode EOD(int i) {
			return getToken(MNCParser.EOD, i);
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
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				funcdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						match(EOD);
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
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
			setState(84);
			type();
			setState(85);
			match(T__0);
			setState(86);
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

	public static class TypeContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public BooltContext boolt() {
			return getRuleContext(BooltContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(88);
				num();
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(89);
				boolt();
				}
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
		enterRule(_localctx, 12, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(MNCParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			setState(95);
			match(EQUALS);
			setState(96);
			expr(0);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MNCParser.ADD, 0); }
		public TerminalNode MUL() { return getToken(MNCParser.MUL, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(ADD);
						setState(103);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(MUL);
						setState(106);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(IDENTIFIER);
				}
				break;
			case SIGN:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode SIGN() { return getToken(MNCParser.SIGN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(MNCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MNCParser.DIGIT, i);
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
		enterRule(_localctx, 20, RULE_number);
		try {
			int _alt;
			setState(127);
			switch (_input.LA(1)) {
			case SIGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116);
				match(SIGN);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctioncallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MNCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MNCParser.IDENTIFIER, i);
		}
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public TerminalNode EOD() { return getToken(MNCParser.EOD, 0); }
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
		enterRule(_localctx, 22, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(OPENPAR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(131);
				match(IDENTIFIER);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPERATOR) {
					{
					{
					{
					setState(132);
					match(SEPERATOR);
					}
					setState(133);
					match(IDENTIFIER);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(CLOSEPAR);
			{
			setState(145);
			match(EOD);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MNCParser.IF, 0); }
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
		public BoolcheckContext boolcheck() {
			return getRuleContext(BoolcheckContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
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
		enterRule(_localctx, 24, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			match(OPENPAR);
			setState(151);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case SIGN:
			case DIGIT:
				{
				setState(149);
				boolcheck();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(150);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			match(CLOSEPAR);
			{
			setState(154);
			body();
			}
			setState(157);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(155);
				match(ELSE);
				{
				setState(156);
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
		enterRule(_localctx, 26, RULE_boolcheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			expr(0);
			setState(160);
			match(CONDITIONS);
			setState(161);
			expr(0);
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
		public List<TerminalNode> DIGIT() { return getTokens(MNCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MNCParser.DIGIT, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MNCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MNCParser.IDENTIFIER, i);
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
		enterRule(_localctx, 28, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LOOP);
			setState(164);
			match(OPENPAR);
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(166);
			match(CLOSEPAR);
			setState(167);
			match(TO);
			setState(168);
			match(OPENPAR);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(170);
			match(CLOSEPAR);
			setState(171);
			match(WITH);
			setState(172);
			match(DIGIT);
			setState(173);
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

	public static class FuncdeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MNCParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MNCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MNCParser.IDENTIFIER, i);
		}
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode IN() { return getToken(MNCParser.IN, 0); }
		public TerminalNode OUT() { return getToken(MNCParser.OUT, 0); }
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
		enterRule(_localctx, 30, RULE_funcdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FUNCTION);
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(OPENPAR);
			{
			setState(178);
			match(IN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(179);
				match(IDENTIFIER);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(OUT);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(186);
				match(IDENTIFIER);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(192);
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

	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__1);
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

	public static class BooltContext extends ParserRuleContext {
		public BooltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).enterBoolt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MNCListener ) ((MNCListener)listener).exitBoolt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MNCVisitor ) return ((MNCVisitor<? extends T>)visitor).visitBoolt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooltContext boolt() throws RecognitionException {
		BooltContext _localctx = new BooltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\7\4B"+
		"\n\4\f\4\16\4E\13\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5"+
		"\16\5S\13\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7]\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3"+
		"\13\3\13\5\13u\n\13\3\f\3\f\6\fy\n\f\r\f\16\fz\3\f\6\f~\n\f\r\f\16\f\177"+
		"\5\f\u0082\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\7"+
		"\r\u008e\n\r\f\r\16\r\u0091\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u009a\n\16\3\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba\13\21\3\21\3\21\7\21\u00be"+
		"\n\21\f\21\16\21\u00c1\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\3\22"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\20\21\4\2\13\13"+
		"\17\17\u00cf\2&\3\2\2\2\4*\3\2\2\2\6F\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\f"+
		"\\\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22d\3\2\2\2\24t\3\2\2\2\26\u0081\3"+
		"\2\2\2\30\u0083\3\2\2\2\32\u0095\3\2\2\2\34\u00a1\3\2\2\2\36\u00a5\3\2"+
		"\2\2 \u00b1\3\2\2\2\"\u00c4\3\2\2\2$\u00c6\3\2\2\2&\'\7\7\2\2\'(\7\f\2"+
		"\2()\5\4\3\2)\3\3\2\2\2*,\7\b\2\2+-\7\f\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\60\3\2\2\2\60\61\5\6\4\2\61\65\7\t\2\2\62\64\7\f\2\2\63"+
		"\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67"+
		"\65\3\2\2\289\5\b\5\29:\7\f\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>G\3\2\2\2?=\3\2\2\2@B\7\f\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F=\3\2\2\2FC\3\2\2\2G\7\3\2\2\2HU\5\n"+
		"\6\2IU\5\20\t\2JU\5\30\r\2KU\5\32\16\2LU\5\36\20\2MU\5 \21\2NP\7\f\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TH\3\2\2\2"+
		"TI\3\2\2\2TJ\3\2\2\2TK\3\2\2\2TL\3\2\2\2TM\3\2\2\2TQ\3\2\2\2U\t\3\2\2"+
		"\2VW\5\f\7\2WX\7\3\2\2XY\7\13\2\2Y\13\3\2\2\2Z]\5\"\22\2[]\5$\23\2\\Z"+
		"\3\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\t\2\2\2_\17\3\2\2\2`a\7\13\2\2ab\7\r"+
		"\2\2bc\5\22\n\2c\21\3\2\2\2de\b\n\1\2ef\5\24\13\2fo\3\2\2\2gh\f\5\2\2"+
		"hi\7\23\2\2in\5\22\n\6jk\f\4\2\2kl\7\24\2\2ln\5\22\n\5mg\3\2\2\2mj\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qo\3\2\2\2ru\7\13\2\2su"+
		"\5\26\f\2tr\3\2\2\2ts\3\2\2\2u\25\3\2\2\2vx\7\16\2\2wy\7\17\2\2xw\3\2"+
		"\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7\17\2\2}|\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"v\3\2\2\2\u0081}\3\2\2\2\u0082\27\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u008f"+
		"\7\25\2\2\u0085\u008a\7\13\2\2\u0086\u0087\7\27\2\2\u0087\u0089\7\13\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\26\2\2\u0093\u0094\7\f\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\7\30\2\2\u0096\u0099\7\25\2\2\u0097\u009a\5\34"+
		"\17\2\u0098\u009a\5\16\b\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\26\2\2\u009c\u009f\5\4\3\2\u009d\u009e\7"+
		"\31\2\2\u009e\u00a0\5\4\3\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\33\3\2\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\5\22"+
		"\n\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\u00a8\t\3\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\7"+
		"\25\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\7\34\2\2"+
		"\u00ae\u00af\7\17\2\2\u00af\u00b0\5\4\3\2\u00b0\37\3\2\2\2\u00b1\u00b2"+
		"\7\35\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b8\7\36\2"+
		"\2\u00b5\u00b7\7\13\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bf\7\37\2\2\u00bc\u00be\7\13\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\4\3\2\u00c3!\3\2\2\2\u00c4\u00c5"+
		"\7\4\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7%\3\2\2\2\26.\65=CFQ"+
		"T\\motz\177\u0081\u008a\u008f\u0099\u009f\u00b8\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}