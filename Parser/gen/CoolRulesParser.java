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
		SL_COMMENT=45, ML_COMMENT=46, OTHER=47, STRING=48;
	public static final int
		RULE_ruleset = 0, RULE_classes = 1, RULE_body = 2, RULE_attr = 3, RULE_methods = 4, 
		RULE_parameter = 5, RULE_stmt = 6, RULE_op = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"ruleset", "classes", "body", "attr", "methods", "parameter", "stmt", 
			"op"
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
			"OTHER", "STRING"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				classes();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(21);
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
			setState(23);
			match(CLASS);
			setState(24);
			match(TYPEID);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(25);
				match(INHERITS);
				setState(26);
				match(TYPEID);
				}
			}

			setState(29);
			match(LBRACE);
			setState(30);
			body();
			setState(31);
			match(RBRACE);
			setState(32);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					methods();
					}
					break;
				case 2:
					{
					setState(35);
					attr();
					}
					break;
				}
				}
				setState(40);
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
			setState(41);
			match(OBJECTID);
			setState(42);
			match(COLON);
			setState(43);
			match(TYPEID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(44);
				match(ASSIGN);
				setState(45);
				stmt(0);
				}
			}

			setState(48);
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
			setState(50);
			match(OBJECTID);
			setState(51);
			match(LPAREN);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(52);
				parameter();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(53);
					match(COMMA);
					setState(54);
					parameter();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			match(RPAREN);
			setState(63);
			match(COLON);
			setState(64);
			match(TYPEID);
			setState(65);
			match(LBRACE);
			setState(66);
			stmt(0);
			setState(67);
			match(RBRACE);
			setState(68);
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
			setState(70);
			match(OBJECTID);
			setState(71);
			match(COLON);
			setState(72);
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
		public TerminalNode BOOL_CONST() { return getToken(CoolRulesParser.BOOL_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(CoolRulesParser.INT_CONST, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(CoolRulesParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(CoolRulesParser.OBJECTID, i);
		}
		public TerminalNode STRING() { return getToken(CoolRulesParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(CoolRulesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CoolRulesParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(CoolRulesParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolRulesParser.THEN, 0); }
		public TerminalNode FI() { return getToken(CoolRulesParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(CoolRulesParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CoolRulesParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolRulesParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolRulesParser.POOL, 0); }
		public TerminalNode TILDE() { return getToken(CoolRulesParser.TILDE, 0); }
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public TerminalNode LET() { return getToken(CoolRulesParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolRulesParser.IN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CoolRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolRulesParser.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(CoolRulesParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolRulesParser.TYPEID, i);
		}
		public TerminalNode NEW() { return getToken(CoolRulesParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(CoolRulesParser.ISVOID, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CoolRulesParser.DOT, 0); }
		public TerminalNode ATSYM() { return getToken(CoolRulesParser.ATSYM, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitStmt(this);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(75);
				match(BOOL_CONST);
				}
				break;
			case 2:
				{
				setState(76);
				match(INT_CONST);
				}
				break;
			case 3:
				{
				setState(77);
				match(OBJECTID);
				}
				break;
			case 4:
				{
				setState(78);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(79);
				match(LPAREN);
				setState(80);
				stmt(0);
				setState(81);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(83);
				match(OBJECTID);
				setState(84);
				match(ASSIGN);
				setState(85);
				stmt(11);
				}
				break;
			case 7:
				{
				setState(86);
				match(OBJECTID);
				setState(87);
				match(LPAREN);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
					{
					setState(88);
					stmt(0);
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(89);
						match(COMMA);
						setState(90);
						stmt(0);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(98);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(99);
				match(IF);
				setState(100);
				stmt(0);
				setState(101);
				match(THEN);
				setState(102);
				stmt(0);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(103);
					match(ELSE);
					setState(104);
					stmt(0);
					}
				}

				setState(107);
				match(FI);
				}
				break;
			case 9:
				{
				setState(109);
				match(WHILE);
				setState(110);
				stmt(0);
				setState(111);
				match(LOOP);
				setState(112);
				stmt(0);
				setState(113);
				match(POOL);
				}
				break;
			case 10:
				{
				setState(115);
				match(TILDE);
				setState(116);
				stmt(5);
				}
				break;
			case 11:
				{
				setState(117);
				match(LBRACE);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					stmt(0);
					setState(119);
					match(SEMICOLON);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING))) != 0) );
				setState(125);
				match(RBRACE);
				}
				break;
			case 12:
				{
				setState(127);
				match(LET);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(OBJECTID);
					setState(129);
					match(COLON);
					setState(130);
					match(TYPEID);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(131);
						match(ASSIGN);
						setState(132);
						stmt(0);
						}
					}

					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(139);
				match(IN);
				setState(140);
				stmt(3);
				}
				break;
			case 13:
				{
				setState(141);
				match(NEW);
				setState(142);
				match(TYPEID);
				}
				break;
			case 14:
				{
				setState(143);
				match(ISVOID);
				setState(144);
				stmt(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						op();
						setState(149);
						stmt(7);
						}
						break;
					case 2:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(151);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(152);
							match(ATSYM);
							setState(153);
							match(TYPEID);
							}
						}

						setState(156);
						match(DOT);
						setState(157);
						match(OBJECTID);
						setState(158);
						match(LPAREN);
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
							{
							setState(159);
							stmt(0);
							setState(164);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(160);
								match(COMMA);
								setState(161);
								stmt(0);
								}
								}
								setState(166);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(169);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(174);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CoolRulesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolRulesParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(CoolRulesParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoolRulesParser.SLASH, 0); }
		public TerminalNode LT() { return getToken(CoolRulesParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolRulesParser.LE, 0); }
		public TerminalNode EQUALS() { return getToken(CoolRulesParser.EQUALS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << LT) | (1L << LE) | (1L << EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\5\6?\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\5\bc\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0088\n\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0094\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\5\b\u00aa\n\b\3\b\7\b\u00ad"+
		"\n\b\f\b\16\b\u00b0\13\b\3\t\3\t\3\t\2\3\16\n\2\4\6\b\n\f\16\20\2\3\4"+
		"\2\31\34\36 \2\u00ca\2\23\3\2\2\2\4\31\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n"+
		"\64\3\2\2\2\fH\3\2\2\2\16\u0093\3\2\2\2\20\u00b1\3\2\2\2\22\24\5\4\3\2"+
		"\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2"+
		"\27\30\7\2\2\3\30\3\3\2\2\2\31\32\7\f\2\2\32\35\7)\2\2\33\34\7\16\2\2"+
		"\34\36\7)\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7!\2\2 !\5"+
		"\6\4\2!\"\7\"\2\2\"#\7\24\2\2#\5\3\2\2\2$\'\5\n\6\2%\'\5\b\5\2&$\3\2\2"+
		"\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2+,\7*"+
		"\2\2,-\7&\2\2-\60\7)\2\2./\7$\2\2/\61\5\16\b\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\3\2\2\2\62\63\7\24\2\2\63\t\3\2\2\2\64\65\7*\2\2\65>\7\26\2\2"+
		"\66;\5\f\7\2\678\7\30\2\28:\5\f\7\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2>\66\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\27\2"+
		"\2AB\7&\2\2BC\7)\2\2CD\7!\2\2DE\5\16\b\2EF\7\"\2\2FG\7\24\2\2G\13\3\2"+
		"\2\2HI\7*\2\2IJ\7&\2\2JK\7)\2\2K\r\3\2\2\2LM\b\b\1\2M\u0094\7\'\2\2N\u0094"+
		"\7(\2\2O\u0094\7*\2\2P\u0094\7\62\2\2QR\7\26\2\2RS\5\16\b\2ST\7\27\2\2"+
		"T\u0094\3\2\2\2UV\7*\2\2VW\7$\2\2W\u0094\5\16\b\rXY\7*\2\2Yb\7\26\2\2"+
		"Z_\5\16\b\2[\\\7\30\2\2\\^\5\16\b\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3\2\2\2bc\3\2\2\2cd\3\2\2\2d\u0094\7\27\2"+
		"\2ef\7\5\2\2fg\5\16\b\2gh\7\b\2\2hk\5\16\b\2ij\7\t\2\2jl\5\16\b\2ki\3"+
		"\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\6\2\2n\u0094\3\2\2\2op\7\7\2\2pq\5\16\b"+
		"\2qr\7\n\2\2rs\5\16\b\2st\7\13\2\2t\u0094\3\2\2\2uv\7\35\2\2v\u0094\5"+
		"\16\b\7w{\7!\2\2xy\5\16\b\2yz\7\24\2\2z|\3\2\2\2{x\3\2\2\2|}\3\2\2\2}"+
		"{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\"\2\2\u0080\u0094\3\2\2\2"+
		"\u0081\u0089\7\20\2\2\u0082\u0083\7*\2\2\u0083\u0084\7&\2\2\u0084\u0087"+
		"\7)\2\2\u0085\u0086\7$\2\2\u0086\u0088\5\16\b\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0082\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\r\2\2\u008e\u0094\5\16\b\5\u008f\u0090\7\21\2\2\u0090\u0094\7"+
		")\2\2\u0091\u0092\7\22\2\2\u0092\u0094\5\16\b\3\u0093L\3\2\2\2\u0093N"+
		"\3\2\2\2\u0093O\3\2\2\2\u0093P\3\2\2\2\u0093Q\3\2\2\2\u0093U\3\2\2\2\u0093"+
		"X\3\2\2\2\u0093e\3\2\2\2\u0093o\3\2\2\2\u0093u\3\2\2\2\u0093w\3\2\2\2"+
		"\u0093\u0081\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u00ae"+
		"\3\2\2\2\u0095\u0096\f\b\2\2\u0096\u0097\5\20\t\2\u0097\u0098\5\16\b\t"+
		"\u0098\u00ad\3\2\2\2\u0099\u009c\f\f\2\2\u009a\u009b\7%\2\2\u009b\u009d"+
		"\7)\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7#\2\2\u009f\u00a0\7*\2\2\u00a0\u00a9\7\26\2\2\u00a1\u00a6\5\16"+
		"\b\2\u00a2\u00a3\7\30\2\2\u00a3\u00a5\5\16\b\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\7\27\2\2\u00ac\u0095\3\2\2\2\u00ac\u0099\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\17\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2\21\3\2\2\2\25"+
		"\25\35&(\60;>_bk}\u0087\u008b\u0093\u009c\u00a6\u00a9\u00ac\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}