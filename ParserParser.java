// Generated from Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, SINGLECOMMENT=3, MULTICOMMENT=4, INHERITS=5, CLASS=6, 
		TYPE=7, INT=8, SEMICOLON=9, TRUE=10, FALSE=11, FI=12, IF=13, IN=14, ISVOID=15, 
		LET=16, LOOP=17, POOL=18, THEN=19, ELSE=20, WHILE=21, CASE=22, ESAC=23, 
		NEW=24, OF=25, NOT=26, ID=27, LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, 
		COLON=32, ASSIGN=33, DARROW=34, NEG=35, COMMA=36, PERIOD=37, AT=38, MUL=39, 
		ADD=40, MINUS=41, DIV=42, LT=43, LEQUALS=44, EQUALS=45, ERROR=46, STRING=47;
	public static final int
		RULE_program = 0, RULE_class = 1, RULE_feature = 2, RULE_param = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class", "feature", "param", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "';'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'('", "')'", "'{'", "'}'", "':'", "'<-'", "'=>'", 
			"'~'", "','", "'.'", "'@'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "SINGLECOMMENT", "MULTICOMMENT", "INHERITS", "CLASS", 
			"TYPE", "INT", "SEMICOLON", "TRUE", "FALSE", "FI", "IF", "IN", "ISVOID", 
			"LET", "LOOP", "POOL", "THEN", "ELSE", "WHILE", "CASE", "ESAC", "NEW", 
			"OF", "NOT", "ID", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COLON", "ASSIGN", 
			"DARROW", "NEG", "COMMA", "PERIOD", "AT", "MUL", "ADD", "MINUS", "DIV", 
			"LT", "LEQUALS", "EQUALS", "ERROR", "STRING"
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserParser.EOF, 0); }
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(15);
			match(EOF);
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

	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDecContext extends ClassContext {
		public Token name;
		public Token inherits;
		public TerminalNode CLASS() { return getToken(ParserParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(ParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserParser.SEMICOLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(ParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParserParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(ParserParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassDecContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassDec(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		int _la;
		try {
			_localctx = new ClassDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS);
			setState(18);
			((ClassDecContext)_localctx).name = match(TYPE);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				((ClassDecContext)_localctx).inherits = match(TYPE);
				}
			}

			setState(23);
			match(LBRACE);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(24);
				feature();
				setState(25);
				match(SEMICOLON);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RBRACE);
			setState(33);
			match(SEMICOLON);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignFeatureContext extends FeatureContext {
		public Token left;
		public ExprContext right;
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParserParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignFeatureContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignFeature(this);
		}
	}
	public static class MethodFeatureContext extends FeatureContext {
		public Token name;
		public ParamContext parameter;
		public ExprContext right;
		public TerminalNode LPAREN() { return getToken(ParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(ParserParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParserParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(ParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserParser.COMMA, i);
		}
		public MethodFeatureContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMethodFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMethodFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodFeatureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((MethodFeatureContext)_localctx).name = match(ID);
				setState(36);
				match(LPAREN);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(37);
					((MethodFeatureContext)_localctx).parameter = param();
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(38);
						match(COMMA);
						setState(39);
						param();
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(RPAREN);
				setState(51);
				match(COLON);
				setState(52);
				match(TYPE);
				setState(53);
				match(LBRACE);
				setState(54);
				((MethodFeatureContext)_localctx).right = expr(0);
				setState(55);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new AssignFeatureContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(ID);
				setState(58);
				match(COLON);
				setState(59);
				((AssignFeatureContext)_localctx).left = match(TYPE);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(60);
					match(ASSIGN);
					setState(61);
					((AssignFeatureContext)_localctx).right = expr(0);
					}
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(ParserParser.TYPE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(COLON);
			setState(68);
			match(TYPE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode WHILE() { return getToken(ParserParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(ParserParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(ParserParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhileExpr(this);
		}
	}
	public static class MulExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode MUL() { return getToken(ParserParser.MUL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMulExpr(this);
		}
	}
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ParserParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStringExpr(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(ParserParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTrueExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdExpr(this);
		}
	}
	public static class IfThenExprContext extends ExprContext {
		public ExprContext first;
		public ExprContext second;
		public ExprContext third;
		public TerminalNode IF() { return getToken(ParserParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ParserParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ParserParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(ParserParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfThenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfThenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfThenExpr(this);
		}
	}
	public static class LetExprContext extends ExprContext {
		public ExprContext first;
		public ExprContext second;
		public ExprContext third;
		public TerminalNode LET() { return getToken(ParserParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ParserParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParserParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(ParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParserParser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(ParserParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ParserParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ParserParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserParser.COMMA, i);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLetExpr(this);
		}
	}
	public static class NegExprContext extends ExprContext {
		public ExprContext right;
		public TerminalNode NEG() { return getToken(ParserParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNegExpr(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode LT() { return getToken(ParserParser.LT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLtExpr(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode ADD() { return getToken(ParserParser.ADD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAddExpr(this);
		}
	}
	public static class BraceExprContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(ParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserParser.SEMICOLON, i);
		}
		public BraceExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBraceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBraceExpr(this);
		}
	}
	public static class IsvoidExprContext extends ExprContext {
		public ExprContext right;
		public TerminalNode ISVOID() { return getToken(ParserParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIsvoidExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIsvoidExpr(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(ParserParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFalseExpr(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token left;
		public ExprContext right;
		public TerminalNode ASSIGN() { return getToken(ParserParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignExpr(this);
		}
	}
	public static class MethodDotExprContext extends ExprContext {
		public ExprContext left;
		public Token name;
		public ExprContext first;
		public ExprContext second;
		public TerminalNode PERIOD() { return getToken(ParserParser.PERIOD, 0); }
		public TerminalNode LPAREN() { return getToken(ParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode AT() { return getToken(ParserParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(ParserParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserParser.COMMA, i);
		}
		public MethodDotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMethodDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMethodDotExpr(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode DIV() { return getToken(ParserParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDivExpr(this);
		}
	}
	public static class EqualsExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode EQUALS() { return getToken(ParserParser.EQUALS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEqualsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEqualsExpr(this);
		}
	}
	public static class NewExprContext extends ExprContext {
		public Token right;
		public TerminalNode NEW() { return getToken(ParserParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(ParserParser.TYPE, 0); }
		public NewExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNewExpr(this);
		}
	}
	public static class MethodParenExprContext extends ExprContext {
		public Token name;
		public ExprContext first;
		public ExprContext second;
		public TerminalNode LPAREN() { return getToken(ParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserParser.COMMA, i);
		}
		public MethodParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMethodParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMethodParenExpr(this);
		}
	}
	public static class LequalExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode LEQUALS() { return getToken(ParserParser.LEQUALS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LequalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLequalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLequalExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext right;
		public TerminalNode NOT() { return getToken(ParserParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNotExpr(this);
		}
	}
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(ParserParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIntExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext right;
		public TerminalNode LPAREN() { return getToken(ParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParenExpr(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode MINUS() { return getToken(ParserParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMinusExpr(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new MethodParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				((MethodParenExprContext)_localctx).name = match(ID);
				setState(72);
				match(LPAREN);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << NEG) | (1L << STRING))) != 0)) {
					{
					{
					setState(73);
					((MethodParenExprContext)_localctx).first = expr(0);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(74);
						match(COMMA);
						setState(75);
						((MethodParenExprContext)_localctx).second = expr(0);
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfThenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(IF);
				setState(88);
				((IfThenExprContext)_localctx).first = expr(0);
				setState(89);
				match(THEN);
				setState(90);
				((IfThenExprContext)_localctx).second = expr(0);
				setState(91);
				match(ELSE);
				setState(92);
				((IfThenExprContext)_localctx).third = expr(0);
				setState(93);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(WHILE);
				setState(96);
				((WhileExprContext)_localctx).left = expr(0);
				setState(97);
				match(LOOP);
				setState(98);
				((WhileExprContext)_localctx).right = expr(0);
				setState(99);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BraceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(LBRACE);
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					expr(0);
					setState(103);
					match(SEMICOLON);
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << NEG) | (1L << STRING))) != 0) );
				setState(109);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new LetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(LET);
				setState(112);
				match(ID);
				setState(113);
				match(COLON);
				setState(114);
				match(TYPE);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(115);
					match(ASSIGN);
					setState(116);
					((LetExprContext)_localctx).first = expr(0);
					}
				}

				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					match(ID);
					setState(121);
					match(COLON);
					setState(122);
					match(TYPE);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(123);
						match(ASSIGN);
						setState(124);
						((LetExprContext)_localctx).second = expr(0);
						}
					}

					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(IN);
				setState(133);
				((LetExprContext)_localctx).third = expr(19);
				}
				break;
			case 6:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(NEW);
				setState(135);
				((NewExprContext)_localctx).right = match(TYPE);
				}
				break;
			case 7:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(NEG);
				setState(137);
				((NegExprContext)_localctx).right = expr(17);
				}
				break;
			case 8:
				{
				_localctx = new IsvoidExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ISVOID);
				setState(139);
				((IsvoidExprContext)_localctx).right = expr(16);
				}
				break;
			case 9:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(LPAREN);
				setState(141);
				((ParenExprContext)_localctx).right = expr(0);
				setState(142);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NOT);
				setState(145);
				((NotExprContext)_localctx).right = expr(7);
				}
				break;
			case 11:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(INT);
				}
				break;
			case 12:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(STRING);
				}
				break;
			case 13:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(TRUE);
				}
				break;
			case 14:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(FALSE);
				}
				break;
			case 15:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ID);
				}
				break;
			case 16:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				((AssignExprContext)_localctx).left = match(ID);
				setState(152);
				match(ASSIGN);
				setState(153);
				((AssignExprContext)_localctx).right = expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(157);
						match(MUL);
						setState(158);
						((MulExprContext)_localctx).right = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						((DivExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(160);
						match(DIV);
						setState(161);
						((DivExprContext)_localctx).right = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(163);
						match(ADD);
						setState(164);
						((AddExprContext)_localctx).right = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new MinusExprContext(new ExprContext(_parentctx, _parentState));
						((MinusExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(166);
						match(MINUS);
						setState(167);
						((MinusExprContext)_localctx).right = expr(12);
						}
						break;
					case 5:
						{
						_localctx = new LequalExprContext(new ExprContext(_parentctx, _parentState));
						((LequalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(169);
						match(LEQUALS);
						setState(170);
						((LequalExprContext)_localctx).right = expr(11);
						}
						break;
					case 6:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState));
						((LtExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						match(LT);
						setState(173);
						((LtExprContext)_localctx).right = expr(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						((EqualsExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						match(EQUALS);
						setState(176);
						((EqualsExprContext)_localctx).right = expr(9);
						}
						break;
					case 8:
						{
						_localctx = new MethodDotExprContext(new ExprContext(_parentctx, _parentState));
						((MethodDotExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(178);
							match(AT);
							setState(179);
							match(TYPE);
							}
						}

						setState(182);
						match(PERIOD);
						setState(183);
						((MethodDotExprContext)_localctx).name = match(ID);
						setState(184);
						match(LPAREN);
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << NEG) | (1L << STRING))) != 0)) {
							{
							{
							setState(185);
							((MethodDotExprContext)_localctx).first = expr(0);
							setState(190);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(186);
								match(COMMA);
								setState(187);
								((MethodDotExprContext)_localctx).second = expr(0);
								}
								}
								setState(192);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(197);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(198);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b"+
		"\u0002\n\u0002\f\u0002,\t\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002?\b\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004"+
		"\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"j\b\u0004\u000b\u0004\f\u0004k\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004~\b\u0004\u0005\u0004\u0080\b\u0004\n\u0004\f\u0004"+
		"\u0083\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00bd\b\u0004\n\u0004"+
		"\f\u0004\u00c0\t\u0004\u0005\u0004\u00c2\b\u0004\n\u0004\f\u0004\u00c5"+
		"\t\u0004\u0001\u0004\u0005\u0004\u00c8\b\u0004\n\u0004\f\u0004\u00cb\t"+
		"\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000\u00ee\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000"+
		"\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000"+
		"\b\u009a\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u0015\u0005\u0007\u0000\u0000"+
		"\u0013\u0014\u0005\u0005\u0000\u0000\u0014\u0016\u0005\u0007\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u001d\u0005\u001e\u0000\u0000"+
		"\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\t\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0005\u001f\u0000\u0000!\"\u0005\t\u0000\u0000"+
		"\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u001b\u0000\u0000$/\u0005\u001c"+
		"\u0000\u0000%*\u0003\u0006\u0003\u0000&\'\u0005$\u0000\u0000\')\u0003"+
		"\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-%\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u001d\u0000\u0000"+
		"34\u0005 \u0000\u000045\u0005\u0007\u0000\u000056\u0005\u001e\u0000\u0000"+
		"67\u0003\b\u0004\u000078\u0005\u001f\u0000\u00008A\u0001\u0000\u0000\u0000"+
		"9:\u0005\u001b\u0000\u0000:;\u0005 \u0000\u0000;>\u0005\u0007\u0000\u0000"+
		"<=\u0005!\u0000\u0000=?\u0003\b\u0004\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@#\u0001\u0000\u0000"+
		"\u0000@9\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005"+
		"\u001b\u0000\u0000CD\u0005 \u0000\u0000DE\u0005\u0007\u0000\u0000E\u0007"+
		"\u0001\u0000\u0000\u0000FG\u0006\u0004\uffff\uffff\u0000GH\u0005\u001b"+
		"\u0000\u0000HS\u0005\u001c\u0000\u0000IN\u0003\b\u0004\u0000JK\u0005$"+
		"\u0000\u0000KM\u0003\b\u0004\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\u009b\u0005"+
		"\u001d\u0000\u0000WX\u0005\r\u0000\u0000XY\u0003\b\u0004\u0000YZ\u0005"+
		"\u0013\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005\u0014\u0000\u0000\\"+
		"]\u0003\b\u0004\u0000]^\u0005\f\u0000\u0000^\u009b\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0015\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005\u0011\u0000\u0000"+
		"bc\u0003\b\u0004\u0000cd\u0005\u0012\u0000\u0000d\u009b\u0001\u0000\u0000"+
		"\u0000ei\u0005\u001e\u0000\u0000fg\u0003\b\u0004\u0000gh\u0005\t\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0005\u001f\u0000\u0000n\u009b\u0001\u0000\u0000"+
		"\u0000op\u0005\u0010\u0000\u0000pq\u0005\u001b\u0000\u0000qr\u0005 \u0000"+
		"\u0000ru\u0005\u0007\u0000\u0000st\u0005!\u0000\u0000tv\u0003\b\u0004"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0081\u0001"+
		"\u0000\u0000\u0000wx\u0005$\u0000\u0000xy\u0005\u001b\u0000\u0000yz\u0005"+
		" \u0000\u0000z}\u0005\u0007\u0000\u0000{|\u0005!\u0000\u0000|~\u0003\b"+
		"\u0004\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007fw\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u000e\u0000\u0000\u0085\u009b\u0003"+
		"\b\u0004\u0013\u0086\u0087\u0005\u0018\u0000\u0000\u0087\u009b\u0005\u0007"+
		"\u0000\u0000\u0088\u0089\u0005#\u0000\u0000\u0089\u009b\u0003\b\u0004"+
		"\u0011\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u009b\u0003\b\u0004\u0010"+
		"\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u008e\u0003\b\u0004\u0000\u008e"+
		"\u008f\u0005\u001d\u0000\u0000\u008f\u009b\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u001a\u0000\u0000\u0091\u009b\u0003\b\u0004\u0007\u0092\u009b"+
		"\u0005\b\u0000\u0000\u0093\u009b\u0005/\u0000\u0000\u0094\u009b\u0005"+
		"\n\u0000\u0000\u0095\u009b\u0005\u000b\u0000\u0000\u0096\u009b\u0005\u001b"+
		"\u0000\u0000\u0097\u0098\u0005\u001b\u0000\u0000\u0098\u0099\u0005!\u0000"+
		"\u0000\u0099\u009b\u0003\b\u0004\u0001\u009aF\u0001\u0000\u0000\u0000"+
		"\u009aW\u0001\u0000\u0000\u0000\u009a_\u0001\u0000\u0000\u0000\u009ae"+
		"\u0001\u0000\u0000\u0000\u009ao\u0001\u0000\u0000\u0000\u009a\u0086\u0001"+
		"\u0000\u0000\u0000\u009a\u0088\u0001\u0000\u0000\u0000\u009a\u008a\u0001"+
		"\u0000\u0000\u0000\u009a\u008c\u0001\u0000\u0000\u0000\u009a\u0090\u0001"+
		"\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0093\u0001"+
		"\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0095\u0001"+
		"\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001"+
		"\u0000\u0000\u0000\u009b\u00c9\u0001\u0000\u0000\u0000\u009c\u009d\n\u000e"+
		"\u0000\u0000\u009d\u009e\u0005\'\u0000\u0000\u009e\u00c8\u0003\b\u0004"+
		"\u000f\u009f\u00a0\n\r\u0000\u0000\u00a0\u00a1\u0005*\u0000\u0000\u00a1"+
		"\u00c8\u0003\b\u0004\u000e\u00a2\u00a3\n\f\u0000\u0000\u00a3\u00a4\u0005"+
		"(\u0000\u0000\u00a4\u00c8\u0003\b\u0004\r\u00a5\u00a6\n\u000b\u0000\u0000"+
		"\u00a6\u00a7\u0005)\u0000\u0000\u00a7\u00c8\u0003\b\u0004\f\u00a8\u00a9"+
		"\n\n\u0000\u0000\u00a9\u00aa\u0005,\u0000\u0000\u00aa\u00c8\u0003\b\u0004"+
		"\u000b\u00ab\u00ac\n\t\u0000\u0000\u00ac\u00ad\u0005+\u0000\u0000\u00ad"+
		"\u00c8\u0003\b\u0004\n\u00ae\u00af\n\b\u0000\u0000\u00af\u00b0\u0005-"+
		"\u0000\u0000\u00b0\u00c8\u0003\b\u0004\t\u00b1\u00b4\n\u0017\u0000\u0000"+
		"\u00b2\u00b3\u0005&\u0000\u0000\u00b3\u00b5\u0005\u0007\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005%\u0000\u0000\u00b7\u00b8"+
		"\u0005\u001b\u0000\u0000\u00b8\u00c3\u0005\u001c\u0000\u0000\u00b9\u00be"+
		"\u0003\b\u0004\u0000\u00ba\u00bb\u0005$\u0000\u0000\u00bb\u00bd\u0003"+
		"\b\u0004\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0005\u001d\u0000\u0000\u00c7\u009c\u0001\u0000"+
		"\u0000\u0000\u00c7\u009f\u0001\u0000\u0000\u0000\u00c7\u00a2\u0001\u0000"+
		"\u0000\u0000\u00c7\u00a5\u0001\u0000\u0000\u0000\u00c7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ab\u0001\u0000\u0000\u0000\u00c7\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c7\u00b1\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\t\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u0013\r\u0015\u001d*/>@NSku}\u0081\u009a\u00b4\u00be\u00c3\u00c7"+
		"\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}