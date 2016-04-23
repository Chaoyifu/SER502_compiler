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
		RULE_funcdeclaration = 17, RULE_instatement = 18, RULE_outstatement = 19, 
		RULE_printcall = 20, RULE_functioncall = 21, RULE_boolcheck = 22, RULE_sign = 23;
	public static final String[] ruleNames = {
		"program", "body", "statements", "statement", "arithmetic", "var", "array", 
		"type", "bool", "assignment", "expr", "term", "factor", "element", "number", 
		"conditional", "loop", "funcdeclaration", "instatement", "outstatement", 
		"printcall", "functioncall", "boolcheck", "sign"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(48);
				funcdeclaration();
				setState(49);
				match(EOL);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(MAIN);
			setState(57);
			match(EOL);
			setState(58);
			body();
			setState(59);
			match(EOL);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(60);
				funcdeclaration();
				setState(61);
				match(EOL);
				}
				}
				setState(67);
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
			setState(68);
			match(START);
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(74);
			statements();
			setState(75);
			match(END);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(EOL);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOLT) | (1L << IF) | (1L << LOOP) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(82);
					statement();
					setState(83);
					match(EOL);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(90);
					match(EOL);
					}
					}
					setState(95);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
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
			setState(106);
			type();
			setState(107);
			match(COLON);
			setState(108);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
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
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
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
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(ARRAYOPEN);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(DIGIT);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(121);
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
			setState(123);
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
			setState(125);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				var();
				setState(128);
				match(EQUALS);
				setState(129);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				var();
				setState(132);
				match(EQUALS);
				setState(133);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(138);
				term();
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(140);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				factor();
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(147);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(OPENPAR);
				setState(153);
				expr();
				setState(154);
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
			setState(161);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
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
			setState(174);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					match(DIGIT);
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(168);
				sign();
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(DIGIT);
					}
					}
					setState(172); 
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
			setState(176);
			match(IF);
			setState(177);
			match(OPENPAR);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(178);
				boolcheck();
				}
				break;
			case 2:
				{
				setState(179);
				var();
				}
				break;
			}
			setState(182);
			match(CLOSEPAR);
			{
			setState(183);
			match(EOL);
			setState(184);
			body();
			}
			setState(189);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(186);
				match(ELSE);
				{
				setState(187);
				match(EOL);
				setState(188);
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode EOL() { return getToken(MNCParser.EOL, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
			setState(191);
			match(LOOP);
			setState(192);
			match(OPENPAR);
			setState(195);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(193);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				{
				setState(194);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			match(CLOSEPAR);
			setState(198);
			match(TO);
			setState(199);
			match(OPENPAR);
			setState(202);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(200);
				var();
				}
				break;
			case DIGIT:
			case OPENPAR:
				{
				setState(201);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			match(CLOSEPAR);
			setState(205);
			match(WITH);
			setState(206);
			number();
			setState(207);
			match(EOL);
			setState(208);
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
		enterRule(_localctx, 34, RULE_funcdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FUNCTION);
			setState(211);
			match(IDENTIFIER);
			setState(212);
			match(OPENPAR);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(213);
				instatement();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_la = _input.LA(1);
			if (_la==OUT) {
				{
				setState(219);
				outstatement();
				}
			}

			}
			setState(222);
			match(CLOSEPAR);
			setState(223);
			match(EOL);
			setState(224);
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
		public TerminalNode IDENTIFIER() { return getToken(MNCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 36, RULE_instatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IN);
			setState(227);
			type();
			setState(228);
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
		enterRule(_localctx, 38, RULE_outstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(OUT);
			setState(231);
			type();
			setState(232);
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
		enterRule(_localctx, 40, RULE_printcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PRINT);
			setState(238);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(235);
				var();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(236);
				bool();
				}
				break;
			case DIGIT:
			case OPENPAR:
				{
				setState(237);
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
		enterRule(_localctx, 42, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(IDENTIFIER);
			setState(241);
			match(OPENPAR);
			setState(243);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(242);
				var();
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(245);
				match(SEPERATOR);
				setState(246);
				var();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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
		enterRule(_localctx, 44, RULE_boolcheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expr();
			setState(255);
			match(CONDITIONS);
			setState(256);
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
		enterRule(_localctx, 46, RULE_sign);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(OPENPAR);
				setState(259);
				match(ADD);
				setState(260);
				match(CLOSEPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(OPENPAR);
				setState(262);
				match(SUB);
				setState(263);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"B\n\2\f\2\16\2E\13\2\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\3\3\7\3P\n\3\f"+
		"\3\16\3S\13\3\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\7\4^\n\4\f\4\16"+
		"\4a\13\4\5\4c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\5\7s\n\7\3\b\3\b\3\b\6\bx\n\b\r\b\16\by\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0091\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\6\20\u00a7"+
		"\n\20\r\20\16\20\u00a8\3\20\3\20\6\20\u00ad\n\20\r\20\16\20\u00ae\5\20"+
		"\u00b1\n\20\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22\5\22\u00c6\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc\13\23\3\23\5\23\u00df"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00f1\n\26\3\27\3\27\3\27\5\27\u00f6\n\27\3\27\3"+
		"\27\7\27\u00fa\n\27\f\27\16\27\u00fd\13\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010b\n\31\3\31\2\2\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\7\b\3\2\t\n\3\2\31"+
		"\32\3\2\33\34\u0116\2\67\3\2\2\2\4F\3\2\2\2\6b\3\2\2\2\bj\3\2\2\2\nl\3"+
		"\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u0089\3\2"+
		"\2\2\26\u0090\3\2\2\2\30\u0097\3\2\2\2\32\u009e\3\2\2\2\34\u00a3\3\2\2"+
		"\2\36\u00b0\3\2\2\2 \u00b2\3\2\2\2\"\u00c1\3\2\2\2$\u00d4\3\2\2\2&\u00e4"+
		"\3\2\2\2(\u00e8\3\2\2\2*\u00ec\3\2\2\2,\u00f2\3\2\2\2.\u0100\3\2\2\2\60"+
		"\u010a\3\2\2\2\62\63\5$\23\2\63\64\7\25\2\2\64\66\3\2\2\2\65\62\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\4\2"+
		"\2;<\7\25\2\2<=\5\4\3\2=C\7\25\2\2>?\5$\23\2?@\7\25\2\2@B\3\2\2\2A>\3"+
		"\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2FH\7\5\2\2GI"+
		"\7\25\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\6\4\2"+
		"MQ\7\6\2\2NP\7\25\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\5\3\2\2"+
		"\2SQ\3\2\2\2TU\5\b\5\2UV\7\25\2\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Zc\3\2\2\2[Y\3\2\2\2\\^\7\25\2\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bY\3\2\2\2b_\3\2\2\2c\7\3\2\2\2"+
		"dk\5\n\6\2ek\5\24\13\2fk\5,\27\2gk\5 \21\2hk\5\"\22\2ik\5*\26\2jd\3\2"+
		"\2\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\5"+
		"\20\t\2mn\7\"\2\2no\5\f\7\2o\13\3\2\2\2ps\7#\2\2qs\5\16\b\2rp\3\2\2\2"+
		"rq\3\2\2\2s\r\3\2\2\2tu\7#\2\2uw\7\37\2\2vx\7\27\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7 \2\2|\17\3\2\2\2}~\t\2\2\2~\21\3"+
		"\2\2\2\177\u0080\t\3\2\2\u0080\23\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0083"+
		"\7\26\2\2\u0083\u0084\5\26\f\2\u0084\u008a\3\2\2\2\u0085\u0086\5\f\7\2"+
		"\u0086\u0087\7\26\2\2\u0087\u0088\7\24\2\2\u0088\u008a\3\2\2\2\u0089\u0081"+
		"\3\2\2\2\u0089\u0085\3\2\2\2\u008a\25\3\2\2\2\u008b\u0091\5\30\r\2\u008c"+
		"\u008d\5\30\r\2\u008d\u008e\t\4\2\2\u008e\u008f\5\26\f\2\u008f\u0091\3"+
		"\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\27\3\2\2\2\u0092"+
		"\u0098\5\32\16\2\u0093\u0094\5\32\16\2\u0094\u0095\t\5\2\2\u0095\u0096"+
		"\5\30\r\2\u0096\u0098\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2"+
		"\u0098\31\3\2\2\2\u0099\u009f\5\34\17\2\u009a\u009b\7\35\2\2\u009b\u009c"+
		"\5\26\f\2\u009c\u009d\7\36\2\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2"+
		"\u009e\u009a\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a4\5\f\7\2\u00a1\u00a4"+
		"\5\36\20\2\u00a2\u00a4\5\22\n\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a7\7\27\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00b1\3\2\2\2\u00aa\u00ac\5\60\31\2\u00ab\u00ad\7\27\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\37\3\2\2"+
		"\2\u00b2\u00b3\7\13\2\2\u00b3\u00b6\7\35\2\2\u00b4\u00b7\5.\30\2\u00b5"+
		"\u00b7\5\f\7\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb\5\4\3\2\u00bb"+
		"\u00bf\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\7\25\2\2\u00be\u00c0\5"+
		"\4\3\2\u00bf\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2"+
		"\7\r\2\2\u00c2\u00c5\7\35\2\2\u00c3\u00c6\5\f\7\2\u00c4\u00c6\5\36\20"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\7\36\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00cc\7\35\2\2\u00ca\u00cd\5\f\7"+
		"\2\u00cb\u00cd\5\36\20\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\5"+
		"\36\20\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\5\4\3\2\u00d3#\3\2\2\2\u00d4"+
		"\u00d5\7\20\2\2\u00d5\u00d6\7#\2\2\u00d6\u00da\7\35\2\2\u00d7\u00d9\5"+
		"&\24\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5("+
		"\25\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\36\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3\5\4\3\2\u00e3%\3\2\2"+
		"\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\7#\2\2\u00e7"+
		"\'\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb\7#\2"+
		"\2\u00eb)\3\2\2\2\u00ec\u00f0\7\23\2\2\u00ed\u00f1\5\f\7\2\u00ee\u00f1"+
		"\5\22\n\2\u00ef\u00f1\5\36\20\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f5\7"+
		"\35\2\2\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00fb\3\2\2\2\u00f7\u00f8\7!\2\2\u00f8\u00fa\5\f\7\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\36\2\2\u00ff-\3\2\2\2"+
		"\u0100\u0101\5\26\f\2\u0101\u0102\7\30\2\2\u0102\u0103\5\26\f\2\u0103"+
		"/\3\2\2\2\u0104\u0105\7\35\2\2\u0105\u0106\7\31\2\2\u0106\u010b\7\36\2"+
		"\2\u0107\u0108\7\35\2\2\u0108\u0109\7\32\2\2\u0109\u010b\7\36\2\2\u010a"+
		"\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\61\3\2\2\2\36\67CJQY_bjry\u0089"+
		"\u0090\u0097\u009e\u00a3\u00a8\u00ae\u00b0\u00b6\u00bf\u00c5\u00cc\u00da"+
		"\u00de\u00f0\u00f5\u00fb\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}