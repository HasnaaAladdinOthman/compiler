// Generated from C:/Users/Aliaa/IdeaProjects/cool_project/src\CoolRules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, ESAC=2, IF=3, FI=4, WHILE=5, THEN=6, ELSE=7, LOOP=8, POOL=9, CLASS=10, 
		IN=11, INHERITS=12, OF=13, LET=14, NEW=15, ISVOID=16, NOT=17, SEMICOLON=18, 
		DARROW=19, LPAREN=20, RPAREN=21, COMMA=22, PLUS=23, MINUS=24, STAR=25, 
		SLASH=26, TILDE=27, LT=28, LE=29, EQUALS=30, LBRACE=31, RBRACE=32, DOT=33, 
		ASSIGN=34, ATSYM=35, COLON=36, BOOL_CONST=37, INT_CONST=38, TYPEID=39, 
		OBJECTID=40, WHITESPACE=41, EOF_STRING=42, SINGLE_BACKSLASH=43, STR_CONST=44, 
		SL_COMMENT=45, ML_COMMENT=46, OTHER=47;
	public static final int
		RULE_ruleset = 0, RULE_classes = 1, RULE_body = 2, RULE_attr = 3, RULE_methods = 4, 
		RULE_parameter = 5, RULE_stmt = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"ruleset", "classes", "body", "attr", "methods", "parameter", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "';'", "'=>'", "'('", "')'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'{'", "'}'", 
			"'.'", "'<-'", "'@'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", 
			"CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "SEMICOLON", 
			"DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", 
			"TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", "ASSIGN", "ATSYM", 
			"COLON", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", "WHITESPACE", 
			"EOF_STRING", "SINGLE_BACKSLASH", "STR_CONST", "SL_COMMENT", "ML_COMMENT", 
			"OTHER"
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
	public String getGrammarFileName() { return "CoolRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RulesetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolRulesParser.EOF, 0); }
		public List<ClassesContext> classes() {
			return getRuleContexts(ClassesContext.class);
		}
		public ClassesContext classes(int i) {
			return getRuleContext(ClassesContext.class,i);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				classes();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(19);
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

	public static class ClassesContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolRulesParser.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(CoolRulesParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolRulesParser.TYPEID, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(CoolRulesParser.INHERITS, 0); }
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CLASS);
			setState(22);
			match(TYPEID);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				match(TYPEID);
				}
			}

			setState(27);
			match(LBRACE);
			setState(28);
			body();
			setState(29);
			match(RBRACE);
			setState(30);
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

	public static class BodyContext extends ParserRuleContext {
		public List<MethodsContext> methods() {
			return getRuleContexts(MethodsContext.class);
		}
		public MethodsContext methods(int i) {
			return getRuleContext(MethodsContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(32);
					methods();
					}
					break;
				case 2:
					{
					setState(33);
					attr();
					}
					break;
				}
				}
				setState(38);
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolRulesParser.TYPEID, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolRulesParser.ASSIGN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(OBJECTID);
			setState(40);
			match(COLON);
			setState(41);
			match(TYPEID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(42);
				match(ASSIGN);
				setState(43);
				stmt(0);
				}
			}

			setState(46);
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

	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolRulesParser.TYPEID, 0); }
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(OBJECTID);
			setState(49);
			match(LPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(50);
				parameter();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(51);
					match(COMMA);
					setState(52);
					parameter();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(60);
			match(RPAREN);
			setState(61);
			match(COLON);
			setState(62);
			match(TYPEID);
			setState(63);
			match(LBRACE);
			setState(64);
			stmt(0);
			setState(65);
			match(RBRACE);
			setState(66);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolRulesParser.TYPEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OBJECTID);
			setState(69);
			match(COLON);
			setState(70);
			match(TYPEID);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends StmtContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public IdentifierContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewstmtContext extends StmtContext {
		public TerminalNode NEW() { return getToken(CoolRulesParser.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(CoolRulesParser.TYPEID, 0); }
		public NewstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterNewstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitNewstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitNewstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolconstContext extends StmtContext {
		public TerminalNode BOOL_CONST() { return getToken(CoolRulesParser.BOOL_CONST, 0); }
		public BoolconstContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBoolconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBoolconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBoolconst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringconstContext extends StmtContext {
		public TerminalNode STR_CONST() { return getToken(CoolRulesParser.STR_CONST, 0); }
		public StringconstContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterStringconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitStringconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitStringconst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StmtContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolRulesParser.ASSIGN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AssignmentContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DipatchingContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CoolRulesParser.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public TerminalNode ATSYM() { return getToken(CoolRulesParser.ATSYM, 0); }
		public TerminalNode TYPEID() { return getToken(CoolRulesParser.TYPEID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public DipatchingContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterDipatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitDipatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitDipatching(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopsContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(CoolRulesParser.WHILE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(CoolRulesParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolRulesParser.POOL, 0); }
		public LoopsContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionsContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode STAR() { return getToken(CoolRulesParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoolRulesParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(CoolRulesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolRulesParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(CoolRulesParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolRulesParser.LE, 0); }
		public TerminalNode EQUALS() { return getToken(CoolRulesParser.EQUALS, 0); }
		public ExpressionsContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetstmtContext extends StmtContext {
		public TerminalNode LET() { return getToken(CoolRulesParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolRulesParser.IN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> OBJECTID() { return getTokens(CoolRulesParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(CoolRulesParser.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolRulesParser.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(CoolRulesParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolRulesParser.TYPEID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CoolRulesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CoolRulesParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public LetstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterLetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitLetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitLetstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolComplemContext extends StmtContext {
		public TerminalNode NOT() { return getToken(CoolRulesParser.NOT, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BoolComplemContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBoolComplem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBoolComplem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBoolComplem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntconstContext extends StmtContext {
		public TerminalNode INT_CONST() { return getToken(CoolRulesParser.INT_CONST, 0); }
		public IntconstContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIntconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIntconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIntconst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends StmtContext {
		public TerminalNode OBJECTID() { return getToken(CoolRulesParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public FunctionCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntComplemContext extends StmtContext {
		public TerminalNode TILDE() { return getToken(CoolRulesParser.TILDE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IntComplemContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIntComplem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIntComplem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIntComplem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidstmtContext extends StmtContext {
		public TerminalNode ISVOID() { return getToken(CoolRulesParser.ISVOID, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IsvoidstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIsvoidstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIsvoidstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIsvoidstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParnstmtContext extends StmtContext {
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public ParnstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterParnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitParnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitParnstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StmtContext {
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public BlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionsContext extends StmtContext {
		public TerminalNode IF() { return getToken(CoolRulesParser.IF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode THEN() { return getToken(CoolRulesParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolRulesParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolRulesParser.FI, 0); }
		public ConditionsContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends StmtContext {
		public TerminalNode CASE() { return getToken(CoolRulesParser.CASE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode OF() { return getToken(CoolRulesParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolRulesParser.ESAC, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(CoolRulesParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(CoolRulesParser.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolRulesParser.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(CoolRulesParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolRulesParser.TYPEID, i);
		}
		public List<TerminalNode> DARROW() { return getTokens(CoolRulesParser.DARROW); }
		public TerminalNode DARROW(int i) {
			return getToken(CoolRulesParser.DARROW, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public CaseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new BoolconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(BOOL_CONST);
				}
				break;
			case 2:
				{
				_localctx = new IntconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(INT_CONST);
				}
				break;
			case 3:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(OBJECTID);
				}
				break;
			case 4:
				{
				_localctx = new StringconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(STR_CONST);
				}
				break;
			case 5:
				{
				_localctx = new NewstmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(NEW);
				setState(78);
				match(TYPEID);
				}
				break;
			case 6:
				{
				_localctx = new IntComplemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(TILDE);
				setState(80);
				stmt(18);
				}
				break;
			case 7:
				{
				_localctx = new IsvoidstmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(ISVOID);
				setState(82);
				stmt(17);
				}
				break;
			case 8:
				{
				_localctx = new BoolComplemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(NOT);
				setState(84);
				stmt(9);
				}
				break;
			case 9:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(OBJECTID);
				setState(86);
				match(ASSIGN);
				setState(87);
				stmt(8);
				}
				break;
			case 10:
				{
				_localctx = new LetstmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LET);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(OBJECTID);
					setState(90);
					match(COLON);
					setState(91);
					match(TYPEID);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(92);
						match(ASSIGN);
						setState(93);
						stmt(0);
						}
					}

					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(96);
						match(COMMA);
						}
					}

					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(103);
				match(IN);
				setState(104);
				stmt(7);
				}
				break;
			case 11:
				{
				_localctx = new ParnstmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(LPAREN);
				setState(106);
				stmt(0);
				setState(107);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(LBRACE);
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					stmt(0);
					setState(111);
					match(SEMICOLON);
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STR_CONST))) != 0) );
				setState(117);
				match(RBRACE);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(OBJECTID);
				setState(120);
				match(LPAREN);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STR_CONST))) != 0)) {
					{
					setState(121);
					stmt(0);
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(122);
						match(COMMA);
						setState(123);
						stmt(0);
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(131);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new ConditionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(IF);
				setState(133);
				stmt(0);
				setState(134);
				match(THEN);
				setState(135);
				stmt(0);
				setState(136);
				match(ELSE);
				setState(137);
				stmt(0);
				setState(138);
				match(FI);
				}
				break;
			case 15:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(CASE);
				setState(141);
				stmt(0);
				setState(142);
				match(OF);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(OBJECTID);
					setState(144);
					match(COLON);
					setState(145);
					match(TYPEID);
					setState(146);
					match(DARROW);
					setState(147);
					stmt(0);
					setState(148);
					match(SEMICOLON);
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(154);
				match(ESAC);
				}
				break;
			case 16:
				{
				_localctx = new LoopsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(WHILE);
				setState(157);
				stmt(0);
				setState(158);
				match(LOOP);
				setState(159);
				stmt(0);
				setState(160);
				match(POOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(164);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(165);
						match(STAR);
						setState(166);
						stmt(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(167);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(168);
						match(SLASH);
						setState(169);
						stmt(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(170);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(171);
						match(PLUS);
						setState(172);
						stmt(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(173);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(174);
						match(MINUS);
						setState(175);
						stmt(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(176);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(177);
						match(LT);
						setState(178);
						stmt(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(179);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(180);
						match(LE);
						setState(181);
						stmt(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionsContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						match(EQUALS);
						setState(184);
						stmt(11);
						}
						break;
					case 8:
						{
						_localctx = new DipatchingContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(185);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(186);
							match(ATSYM);
							setState(187);
							match(TYPEID);
							}
						}

						setState(190);
						match(DOT);
						setState(191);
						match(OBJECTID);
						setState(192);
						match(LPAREN);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STR_CONST))) != 0)) {
							{
							setState(193);
							stmt(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(194);
								match(COMMA);
								setState(195);
								stmt(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 6:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\5\6=\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\5\bd\n\b\6\bf\n"+
		"\b\r\b\16\bg\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\bt\n\b\r\b\16\b"+
		"u\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\5\b\u0084"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\5\b\u00cc\n\b\3\b\7\b\u00cf"+
		"\n\b\f\b\16\b\u00d2\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\2\2\u00f4\2\21"+
		"\3\2\2\2\4\27\3\2\2\2\6&\3\2\2\2\b)\3\2\2\2\n\62\3\2\2\2\fF\3\2\2\2\16"+
		"\u00a4\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2"+
		"\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\f\2\2"+
		"\30\33\7)\2\2\31\32\7\16\2\2\32\34\7)\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\35\3\2\2\2\35\36\7!\2\2\36\37\5\6\4\2\37 \7\"\2\2 !\7\24\2\2!\5\3"+
		"\2\2\2\"%\5\n\6\2#%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&"+
		"\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2)*\7*\2\2*+\7&\2\2+.\7)\2\2,-\7$\2\2-"+
		"/\5\16\b\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\24\2\2\61\t\3\2\2\2"+
		"\62\63\7*\2\2\63<\7\26\2\2\649\5\f\7\2\65\66\7\30\2\2\668\5\f\7\2\67\65"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<\64\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>?\7\27\2\2?@\7&\2\2@A\7)\2\2AB\7!\2\2BC\5\16\b"+
		"\2CD\7\"\2\2DE\7\24\2\2E\13\3\2\2\2FG\7*\2\2GH\7&\2\2HI\7)\2\2I\r\3\2"+
		"\2\2JK\b\b\1\2K\u00a5\7\'\2\2L\u00a5\7(\2\2M\u00a5\7*\2\2N\u00a5\7.\2"+
		"\2OP\7\21\2\2P\u00a5\7)\2\2QR\7\35\2\2R\u00a5\5\16\b\24ST\7\22\2\2T\u00a5"+
		"\5\16\b\23UV\7\23\2\2V\u00a5\5\16\b\13WX\7*\2\2XY\7$\2\2Y\u00a5\5\16\b"+
		"\nZe\7\20\2\2[\\\7*\2\2\\]\7&\2\2]`\7)\2\2^_\7$\2\2_a\5\16\b\2`^\3\2\2"+
		"\2`a\3\2\2\2ac\3\2\2\2bd\7\30\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e[\3\2"+
		"\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\r\2\2j\u00a5\5\16\b\t"+
		"kl\7\26\2\2lm\5\16\b\2mn\7\27\2\2n\u00a5\3\2\2\2os\7!\2\2pq\5\16\b\2q"+
		"r\7\24\2\2rt\3\2\2\2sp\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2"+
		"wx\7\"\2\2x\u00a5\3\2\2\2yz\7*\2\2z\u0083\7\26\2\2{\u0080\5\16\b\2|}\7"+
		"\30\2\2}\177\5\16\b\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u00a5\7\27\2\2\u0086\u0087"+
		"\7\5\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7\b\2\2\u0089\u008a\5\16\b\2"+
		"\u008a\u008b\7\t\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\6\2\2\u008d\u00a5"+
		"\3\2\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\16\b\2\u0090\u0098\7\17\2\2"+
		"\u0091\u0092\7*\2\2\u0092\u0093\7&\2\2\u0093\u0094\7)\2\2\u0094\u0095"+
		"\7\25\2\2\u0095\u0096\5\16\b\2\u0096\u0097\7\24\2\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0091\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u00a5\3\2\2\2\u009e"+
		"\u009f\7\7\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\5"+
		"\16\b\2\u00a2\u00a3\7\13\2\2\u00a3\u00a5\3\2\2\2\u00a4J\3\2\2\2\u00a4"+
		"L\3\2\2\2\u00a4M\3\2\2\2\u00a4N\3\2\2\2\u00a4O\3\2\2\2\u00a4Q\3\2\2\2"+
		"\u00a4S\3\2\2\2\u00a4U\3\2\2\2\u00a4W\3\2\2\2\u00a4Z\3\2\2\2\u00a4k\3"+
		"\2\2\2\u00a4o\3\2\2\2\u00a4y\3\2\2\2\u00a4\u0086\3\2\2\2\u00a4\u008e\3"+
		"\2\2\2\u00a4\u009e\3\2\2\2\u00a5\u00d0\3\2\2\2\u00a6\u00a7\f\22\2\2\u00a7"+
		"\u00a8\7\33\2\2\u00a8\u00cf\5\16\b\23\u00a9\u00aa\f\21\2\2\u00aa\u00ab"+
		"\7\34\2\2\u00ab\u00cf\5\16\b\22\u00ac\u00ad\f\20\2\2\u00ad\u00ae\7\31"+
		"\2\2\u00ae\u00cf\5\16\b\21\u00af\u00b0\f\17\2\2\u00b0\u00b1\7\32\2\2\u00b1"+
		"\u00cf\5\16\b\20\u00b2\u00b3\f\16\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00cf"+
		"\5\16\b\17\u00b5\u00b6\f\r\2\2\u00b6\u00b7\7\37\2\2\u00b7\u00cf\5\16\b"+
		"\16\u00b8\u00b9\f\f\2\2\u00b9\u00ba\7 \2\2\u00ba\u00cf\5\16\b\r\u00bb"+
		"\u00be\f\25\2\2\u00bc\u00bd\7%\2\2\u00bd\u00bf\7)\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1"+
		"\u00c2\7*\2\2\u00c2\u00cb\7\26\2\2\u00c3\u00c8\5\16\b\2\u00c4\u00c5\7"+
		"\30\2\2\u00c5\u00c7\5\16\b\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\7\27\2\2\u00ce\u00a6\3\2\2\2\u00ce\u00a9\3\2\2\2\u00ce\u00ac\3"+
		"\2\2\2\u00ce\u00af\3\2\2\2\u00ce\u00b2\3\2\2\2\u00ce\u00b5\3\2\2\2\u00ce"+
		"\u00b8\3\2\2\2\u00ce\u00bb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\17\3\2\2\2\u00d2\u00d0\3\2\2\2\26\23\33"+
		"$&.9<`cgu\u0080\u0083\u009a\u00a4\u00be\u00c8\u00cb\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}