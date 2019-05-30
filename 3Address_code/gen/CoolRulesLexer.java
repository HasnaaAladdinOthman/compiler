// Generated from C:/Users/Aliaa/IdeaProjects/cool_project/src\CoolRules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolRulesLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", 
			"CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "SEMICOLON", 
			"DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", 
			"TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", "ASSIGN", "ATSYM", 
			"COLON", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", "FALSE", "BOOL_CONST", 
			"INT_CONST", "TYPEID", "OBJECTID", "WHITESPACE", "EOF_STRING", "SINGLE_BACKSLASH", 
			"STR_CONST", "OPEN", "CLOSE", "SL_COMMENT", "ML_COMMENT", "OTHER"
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


	public CoolRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3,\3,\5,\u0102\n,\3-\6-\u0105\n-\r-\16-\u0106\3.\3.\3.\3.\7"+
		".\u010d\n.\f.\16.\u0110\13.\3/\3/\3/\3/\7/\u0116\n/\f/\16/\u0119\13/\3"+
		"\60\6\60\u011c\n\60\r\60\16\60\u011d\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0126\n\61\f\61\16\61\u0129\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0135\n\63\f\63\16\63\u0138\13\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0144\n\66\f\66\16\66\u0147\13"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u0152\n\67\f\67"+
		"\16\67\u0155\13\67\3\67\3\67\3\67\3\67\3\67\38\38\4\u0145\u0153\29\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\2M\2O\2Q\2S\2U\2W\'Y([)]*_+a,c-e.g\2i\2k/m\60o\61\3\2\35"+
		"\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2N"+
		"Nnn\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2XXxx\4\2FFff\3\2\62;\3"+
		"\2c|\3\2C\\\4\2C\\c|\4\2WWww\5\2\13\f\16\17\"\"\4\2$$^^\4\2\f\f$$\5\2"+
		"$$**,,\4\2$$+,\4\2\f\f\17\17\2\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5v\3\2\2\2\7{\3\2\2\2\t~\3\2"+
		"\2\2\13\u0081\3\2\2\2\r\u0087\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2\2"+
		"\2\23\u0096\3\2\2\2\25\u009b\3\2\2\2\27\u00a1\3\2\2\2\31\u00a4\3\2\2\2"+
		"\33\u00ad\3\2\2\2\35\u00b0\3\2\2\2\37\u00b4\3\2\2\2!\u00b8\3\2\2\2#\u00bf"+
		"\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c8\3\2\2\2+\u00ca\3\2\2\2"+
		"-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4"+
		"\3\2\2\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2"+
		"?\u00df\3\2\2\2A\u00e1\3\2\2\2C\u00e3\3\2\2\2E\u00e5\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2\2\2Q\u00f2"+
		"\3\2\2\2S\u00f4\3\2\2\2U\u00f9\3\2\2\2W\u0101\3\2\2\2Y\u0104\3\2\2\2["+
		"\u0108\3\2\2\2]\u0111\3\2\2\2_\u011b\3\2\2\2a\u0121\3\2\2\2c\u012c\3\2"+
		"\2\2e\u0130\3\2\2\2g\u013b\3\2\2\2i\u013d\3\2\2\2k\u013f\3\2\2\2m\u014c"+
		"\3\2\2\2o\u015b\3\2\2\2qr\t\2\2\2rs\t\3\2\2st\t\4\2\2tu\t\5\2\2u\4\3\2"+
		"\2\2vw\t\5\2\2wx\t\4\2\2xy\t\3\2\2yz\t\2\2\2z\6\3\2\2\2{|\t\6\2\2|}\t"+
		"\7\2\2}\b\3\2\2\2~\177\t\7\2\2\177\u0080\t\6\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\t\b\2\2\u0082\u0083\t\t\2\2\u0083\u0084\t\6\2\2\u0084\u0085\t\n"+
		"\2\2\u0085\u0086\t\5\2\2\u0086\f\3\2\2\2\u0087\u0088\t\13\2\2\u0088\u0089"+
		"\t\t\2\2\u0089\u008a\t\5\2\2\u008a\u008b\t\f\2\2\u008b\16\3\2\2\2\u008c"+
		"\u008d\t\5\2\2\u008d\u008e\t\n\2\2\u008e\u008f\t\4\2\2\u008f\u0090\t\5"+
		"\2\2\u0090\20\3\2\2\2\u0091\u0092\t\n\2\2\u0092\u0093\t\r\2\2\u0093\u0094"+
		"\t\r\2\2\u0094\u0095\t\16\2\2\u0095\22\3\2\2\2\u0096\u0097\t\16\2\2\u0097"+
		"\u0098\t\r\2\2\u0098\u0099\t\r\2\2\u0099\u009a\t\n\2\2\u009a\24\3\2\2"+
		"\2\u009b\u009c\t\2\2\2\u009c\u009d\t\n\2\2\u009d\u009e\t\3\2\2\u009e\u009f"+
		"\t\4\2\2\u009f\u00a0\t\4\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2"+
		"\u00a3\t\f\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00a6\t\f\2"+
		"\2\u00a6\u00a7\t\t\2\2\u00a7\u00a8\t\5\2\2\u00a8\u00a9\t\17\2\2\u00a9"+
		"\u00aa\t\6\2\2\u00aa\u00ab\t\13\2\2\u00ab\u00ac\t\4\2\2\u00ac\32\3\2\2"+
		"\2\u00ad\u00ae\t\r\2\2\u00ae\u00af\t\7\2\2\u00af\34\3\2\2\2\u00b0\u00b1"+
		"\t\n\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3\t\13\2\2\u00b3\36\3\2\2\2\u00b4"+
		"\u00b5\t\f\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00b7\t\b\2\2\u00b7 \3\2\2\2"+
		"\u00b8\u00b9\t\6\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bb\t\20\2\2\u00bb\u00bc"+
		"\t\r\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\t\21\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\t\f\2\2\u00c0\u00c1\t\r\2\2\u00c1\u00c2\t\13\2\2\u00c2$\3\2\2\2"+
		"\u00c3\u00c4\7=\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7\7@\2"+
		"\2\u00c7(\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7+\2\2"+
		"\u00cb,\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3"+
		"\64\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7\u0080"+
		"\2\2\u00d78\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9:\3\2\2\2\u00da\u00db\7>\2"+
		"\2\u00db\u00dc\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7?\2\2\u00de>\3\2\2\2"+
		"\u00df\u00e0\7}\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2B\3\2\2"+
		"\2\u00e3\u00e4\7\60\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7"+
		"\7/\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7B\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7"+
		"<\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\t\22\2\2\u00edL\3\2\2\2\u00ee\u00ef\t"+
		"\23\2\2\u00efN\3\2\2\2\u00f0\u00f1\t\24\2\2\u00f1P\3\2\2\2\u00f2\u00f3"+
		"\t\25\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\t\17\2\2\u00f6"+
		"\u00f7\t\26\2\2\u00f7\u00f8\t\5\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7h\2\2"+
		"\u00fa\u00fb\t\3\2\2\u00fb\u00fc\t\n\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe"+
		"\t\5\2\2\u00feV\3\2\2\2\u00ff\u0102\5S*\2\u0100\u0102\5U+\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102X\3\2\2\2\u0103\u0105\5K&\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"Z\3\2\2\2\u0108\u010e\5O(\2\u0109\u010d\7a\2\2\u010a\u010d\5Q)\2\u010b"+
		"\u010d\5K&\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2"+
		"\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\\"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0117\5M\'\2\u0112\u0116\7a\2\2\u0113"+
		"\u0116\5Q)\2\u0114\u0116\5K&\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118^\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\t\27\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\60\2\2\u0120`\3\2\2\2\u0121\u0127"+
		"\7$\2\2\u0122\u0126\7^\2\2\u0123\u0126\5_\60\2\u0124\u0126\n\30\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7\2\2\3\u012bb\3\2\2\2\u012c\u012d\7$\2\2\u012d"+
		"\u012e\7^\2\2\u012e\u012f\7$\2\2\u012fd\3\2\2\2\u0130\u0136\7$\2\2\u0131"+
		"\u0135\7^\2\2\u0132\u0135\n\31\2\2\u0133\u0135\5_\60\2\u0134\u0131\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013a\7$\2\2\u013af\3\2\2\2\u013b\u013c\n\32\2\2\u013ch\3\2"+
		"\2\2\u013d\u013e\n\33\2\2\u013ej\3\2\2\2\u013f\u0140\7/\2\2\u0140\u0141"+
		"\7/\2\2\u0141\u0145\3\2\2\2\u0142\u0144\13\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u0149\t\34\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\b\66\2\2\u014bl\3\2\2\2\u014c\u014d\7*\2\2\u014d\u014e\7,\2\2\u014e"+
		"\u0153\3\2\2\2\u014f\u0152\5m\67\2\u0150\u0152\13\2\2\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7,"+
		"\2\2\u0157\u0158\7+\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b\67\2\2\u015a"+
		"n\3\2\2\2\u015b\u015c\13\2\2\2\u015cp\3\2\2\2\21\2\u0101\u0106\u010c\u010e"+
		"\u0115\u0117\u011d\u0125\u0127\u0134\u0136\u0145\u0151\u0153\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}