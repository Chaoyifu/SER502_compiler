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
		EOD=10, EQUALS=11, DIGIT=12, TRUE=13, FALSE=14, CONDITIONS=15, ADD=16, 
		SUB=17, MUL=18, DIV=19, OPENPAR=20, CLOSEPAR=21, SEPERATOR=22, IF=23, 
		ELSE=24, LOOP=25, TO=26, WITH=27, FUNCTION=28, IN=29, OUT=30;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_arithmetic = 4, RULE_type = 5, RULE_bool = 6, RULE_assignment = 7, 
		RULE_expr = 8, RULE_term = 9, RULE_factor = 10, RULE_number = 11, RULE_functioncall = 12, 
		RULE_conditional = 13, RULE_boolcheck = 14, RULE_loop = 15, RULE_funcdeclaration = 16, 
		RULE_sign = 17, RULE_num = 18, RULE_boolt = 19;
	public static final String[] ruleNames = {
		"program", "body", "statements", "statement", "arithmetic", "type", "bool", 
		"assignment", "expr", "term", "factor", "number", "functioncall", "conditional", 
		"boolcheck", "loop", "funcdeclaration", "sign", "num", "boolt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'number'", "'boolean'", null, "'main'", "'start'", "'end'", 
		"'mainEnd'", null, "'\n'", "'='", null, "'true'", "'false'", null, "'+'", 
		"'-'", "'*'", "'/'", "'('", "')'", "','", "'if'", "'else'", "'loop:'", 
		"'to'", "'with'", "'function:'", "'in:'", "'out:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "MAIN", "START", "END", "PROGRAMEND", "IDENTIFIER", 
		"EOD", "EQUALS", "DIGIT", "TRUE", "FALSE", "CONDITIONS", "ADD", "SUB", 
		"MUL", "DIV", "OPENPAR", "CLOSEPAR", "SEPERATOR", "IF", "ELSE", "LOOP", 
		"TO", "WITH", "FUNCTION", "IN", "OUT"
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
			setState(40);
			match(MAIN);
			setState(41);
			match(EOD);
			setState(42);
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
			setState(44);
			match(START);
			setState(46); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(45);
					match(EOD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(50);
			statements();
			setState(51);
			match(END);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(EOD);
					}
					} 
				}
				setState(57);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << IDENTIFIER) | (1L << EOD) | (1L << IF) | (1L << LOOP) | (1L << FUNCTION))) != 0)) {
					{
					{
					setState(58);
					statement();
					setState(59);
					match(EOD);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOD) {
					{
					{
					setState(66);
					match(EOD);
					}
					}
					setState(71);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				funcdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						match(EOD);
						}
						} 
					}
					setState(85);
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
			setState(88);
			type();
			setState(89);
			match(T__0);
			setState(90);
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
			setState(94);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(92);
				num();
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(93);
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
			setState(96);
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
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(EQUALS);
			setState(100);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(MNCParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(MNCParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(MNCParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(MNCParser.SUB, i);
		}
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
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			term();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(104);
				term();
				}
				}
				setState(109);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(MNCParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(MNCParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MNCParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MNCParser.DIV, i);
		}
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
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			factor();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(112);
				factor();
				}
				}
				setState(117);
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
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		public List<TerminalNode> DIGIT() { return getTokens(MNCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MNCParser.DIGIT, i);
		}
		public TerminalNode OPENPAR() { return getToken(MNCParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(MNCParser.CLOSEPAR, 0); }
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
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			setState(136);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					match(DIGIT);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(OPENPAR);
				{
				{
				setState(128);
				sign();
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(DIGIT);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				setState(134);
				match(CLOSEPAR);
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
		enterRule(_localctx, 24, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IDENTIFIER);
			setState(139);
			match(OPENPAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(140);
				match(IDENTIFIER);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPERATOR) {
					{
					{
					{
					setState(141);
					match(SEPERATOR);
					}
					setState(142);
					match(IDENTIFIER);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(CLOSEPAR);
			{
			setState(154);
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
		enterRule(_localctx, 26, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IF);
			setState(157);
			match(OPENPAR);
			setState(160);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DIGIT:
			case OPENPAR:
				{
				setState(158);
				boolcheck();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(159);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			match(CLOSEPAR);
			{
			setState(163);
			body();
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(164);
				match(ELSE);
				{
				setState(165);
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
		enterRule(_localctx, 28, RULE_boolcheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expr();
			setState(169);
			match(CONDITIONS);
			setState(170);
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
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LOOP);
			setState(173);
			match(OPENPAR);
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(175);
			match(CLOSEPAR);
			setState(176);
			match(TO);
			setState(177);
			match(OPENPAR);
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(179);
			match(CLOSEPAR);
			setState(180);
			match(WITH);
			setState(181);
			match(DIGIT);
			setState(182);
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
		enterRule(_localctx, 32, RULE_funcdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FUNCTION);
			setState(185);
			match(IDENTIFIER);
			setState(186);
			match(OPENPAR);
			{
			setState(187);
			match(IN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(188);
				match(IDENTIFIER);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(OUT);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(195);
				match(IDENTIFIER);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(201);
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

	public static class SignContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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
		enterRule(_localctx, 36, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 38, RULE_boolt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\6\3\61\n\3\r\3"+
		"\16\3\62\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\7\4@\n\4\f\4"+
		"\16\4C\13\4\3\4\7\4F\n\4\f\4\16\4I\13\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7a\n"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\13\3"+
		"\13\3\13\7\13t\n\13\f\13\16\13w\13\13\3\f\3\f\5\f{\n\f\3\r\6\r~\n\r\r"+
		"\r\16\r\177\3\r\3\r\3\r\6\r\u0085\n\r\r\r\16\r\u0086\3\r\3\r\5\r\u008b"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\7"+
		"\16\u0097\n\16\f\16\16\16\u009a\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00a3\n\17\3\17\3\17\3\17\3\17\5\17\u00a9\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3\13\22\3\22\3\22"+
		"\7\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\6\3\2\17\20\3\2\22\23\3\2\24\25\4\2\13\13\16\16\u00d8\2*\3\2\2\2\4.\3"+
		"\2\2\2\6J\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20d\3\2"+
		"\2\2\22h\3\2\2\2\24p\3\2\2\2\26z\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2"+
		"\2\2\34\u009e\3\2\2\2\36\u00aa\3\2\2\2 \u00ae\3\2\2\2\"\u00ba\3\2\2\2"+
		"$\u00cd\3\2\2\2&\u00cf\3\2\2\2(\u00d1\3\2\2\2*+\7\7\2\2+,\7\f\2\2,-\5"+
		"\4\3\2-\3\3\2\2\2.\60\7\b\2\2/\61\7\f\2\2\60/\3\2\2\2\61\62\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\5\6\4\2\659\7\t\2\2\668"+
		"\7\f\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3"+
		"\2\2\2<=\5\b\5\2=>\7\f\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BK\3\2\2\2CA\3\2\2\2DF\7\f\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2JA\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LY\5\n\6\2MY"+
		"\5\20\t\2NY\5\32\16\2OY\5\34\17\2PY\5 \21\2QY\5\"\22\2RT\7\f\2\2SR\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XL\3\2\2\2XM\3\2"+
		"\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XU\3\2\2\2Y\t\3\2\2\2Z[\5"+
		"\f\7\2[\\\7\3\2\2\\]\7\13\2\2]\13\3\2\2\2^a\5&\24\2_a\5(\25\2`^\3\2\2"+
		"\2`_\3\2\2\2a\r\3\2\2\2bc\t\2\2\2c\17\3\2\2\2de\7\13\2\2ef\7\r\2\2fg\5"+
		"\22\n\2g\21\3\2\2\2hm\5\24\13\2ij\t\3\2\2jl\5\24\13\2ki\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2om\3\2\2\2pu\5\26\f\2qr\t\4\2\2rt"+
		"\5\26\f\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wu\3\2\2"+
		"\2x{\7\13\2\2y{\5\30\r\2zx\3\2\2\2zy\3\2\2\2{\27\3\2\2\2|~\7\16\2\2}|"+
		"\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\3\2\2"+
		"\2\u0081\u0082\7\26\2\2\u0082\u0084\5$\23\2\u0083\u0085\7\16\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008b\3\2\2\2\u008a"+
		"}\3\2\2\2\u008a\u0081\3\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7\13\2\2\u008d"+
		"\u0098\7\26\2\2\u008e\u0093\7\13\2\2\u008f\u0090\7\30\2\2\u0090\u0092"+
		"\7\13\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008e"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\27\2\2\u009c\u009d\7"+
		"\f\2\2\u009d\33\3\2\2\2\u009e\u009f\7\31\2\2\u009f\u00a2\7\26\2\2\u00a0"+
		"\u00a3\5\36\20\2\u00a1\u00a3\5\16\b\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a8\5\4\3\2"+
		"\u00a6\u00a7\7\32\2\2\u00a7\u00a9\5\4\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\21\2\2\u00ac"+
		"\u00ad\5\22\n\2\u00ad\37\3\2\2\2\u00ae\u00af\7\33\2\2\u00af\u00b0\7\26"+
		"\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b4\7\26\2\2\u00b4\u00b5\t\5\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\7"+
		"\35\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\5\4\3\2\u00b9!\3\2\2\2\u00ba"+
		"\u00bb\7\36\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00c1"+
		"\7\37\2\2\u00be\u00c0\7\13\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c8\7 \2\2\u00c5\u00c7\7\13\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\4\3\2\u00cc#\3\2\2\2\u00cd\u00ce"+
		"\t\3\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7\4\2\2\u00d0\'\3\2\2\2\u00d1\u00d2"+
		"\7\5\2\2\u00d2)\3\2\2\2\26\629AGJUX`muz\177\u0086\u008a\u0093\u0098\u00a2"+
		"\u00a8\u00c1\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}