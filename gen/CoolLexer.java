// Generated from D:/college/compiler/cool_project/src\CoolLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u015c\b\1\4\2"+
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
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\5,\u0101\n,\3-\6-\u0104\n-\r-\16-\u0105\3.\3.\3.\3.\7.\u010c"+
		"\n.\f.\16.\u010f\13.\3/\3/\3/\3/\7/\u0115\n/\f/\16/\u0118\13/\3\60\6\60"+
		"\u011b\n\60\r\60\16\60\u011c\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0125"+
		"\n\61\f\61\16\61\u0128\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\7\63\u0134\n\63\f\63\16\63\u0137\13\63\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\7\66\u0143\n\66\f\66\16\66\u0146\13\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u0151\n\67\f\67\16\67"+
		"\u0154\13\67\3\67\3\67\3\67\3\67\3\67\38\38\4\u0144\u0152\29\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\2M\2O\2Q\2S\2U\2W\'Y([)]*_+a,c-e.g\2i\2k/m\60o\61\3\2\32\4\2"+
		"EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4"+
		"\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2XXxx\4\2FFff\4\2C\\c|\4\2WW"+
		"ww\5\2\13\f\16\17\"\"\4\2$$^^\4\2\f\f$$\5\2$$**,,\4\2$$+,\4\2\f\f\17\17"+
		"\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2"+
		"\2\2\3q\3\2\2\2\5v\3\2\2\2\7{\3\2\2\2\t~\3\2\2\2\13\u0081\3\2\2\2\r\u0087"+
		"\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2\2\2\23\u0096\3\2\2\2\25\u009b\3"+
		"\2\2\2\27\u00a1\3\2\2\2\31\u00a4\3\2\2\2\33\u00ac\3\2\2\2\35\u00af\3\2"+
		"\2\2\37\u00b3\3\2\2\2!\u00b7\3\2\2\2#\u00be\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61"+
		"\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00d9\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00e0\3\2\2\2C"+
		"\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I\u00e9\3\2\2\2K\u00eb\3\2"+
		"\2\2M\u00ed\3\2\2\2O\u00ef\3\2\2\2Q\u00f1\3\2\2\2S\u00f3\3\2\2\2U\u00f8"+
		"\3\2\2\2W\u0100\3\2\2\2Y\u0103\3\2\2\2[\u0107\3\2\2\2]\u0110\3\2\2\2_"+
		"\u011a\3\2\2\2a\u0120\3\2\2\2c\u012b\3\2\2\2e\u012f\3\2\2\2g\u013a\3\2"+
		"\2\2i\u013c\3\2\2\2k\u013e\3\2\2\2m\u014b\3\2\2\2o\u015a\3\2\2\2qr\t\2"+
		"\2\2rs\t\3\2\2st\t\4\2\2tu\t\5\2\2u\4\3\2\2\2vw\t\5\2\2wx\t\4\2\2xy\t"+
		"\3\2\2yz\t\2\2\2z\6\3\2\2\2{|\t\6\2\2|}\t\7\2\2}\b\3\2\2\2~\177\t\7\2"+
		"\2\177\u0080\t\6\2\2\u0080\n\3\2\2\2\u0081\u0082\t\b\2\2\u0082\u0083\t"+
		"\t\2\2\u0083\u0084\t\6\2\2\u0084\u0085\t\n\2\2\u0085\u0086\t\5\2\2\u0086"+
		"\f\3\2\2\2\u0087\u0088\t\13\2\2\u0088\u0089\t\t\2\2\u0089\u008a\t\5\2"+
		"\2\u008a\u008b\t\f\2\2\u008b\16\3\2\2\2\u008c\u008d\t\5\2\2\u008d\u008e"+
		"\t\n\2\2\u008e\u008f\t\4\2\2\u008f\u0090\t\5\2\2\u0090\20\3\2\2\2\u0091"+
		"\u0092\t\n\2\2\u0092\u0093\t\r\2\2\u0093\u0094\t\r\2\2\u0094\u0095\t\16"+
		"\2\2\u0095\22\3\2\2\2\u0096\u0097\t\16\2\2\u0097\u0098\t\r\2\2\u0098\u0099"+
		"\t\r\2\2\u0099\u009a\t\n\2\2\u009a\24\3\2\2\2\u009b\u009c\t\2\2\2\u009c"+
		"\u009d\t\n\2\2\u009d\u009e\t\3\2\2\u009e\u009f\t\4\2\2\u009f\u00a0\t\4"+
		"\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2\u00a3\t\f\2\2\u00a3\30"+
		"\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00a6\t\t\2\2\u00a6\u00a7\t\5\2\2\u00a7"+
		"\u00a8\t\17\2\2\u00a8\u00a9\t\6\2\2\u00a9\u00aa\t\13\2\2\u00aa\u00ab\t"+
		"\4\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\t\r\2\2\u00ad\u00ae\t\7\2\2\u00ae"+
		"\34\3\2\2\2\u00af\u00b0\t\n\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b2\t\13\2"+
		"\2\u00b2\36\3\2\2\2\u00b3\u00b4\t\f\2\2\u00b4\u00b5\t\5\2\2\u00b5\u00b6"+
		"\t\b\2\2\u00b6 \3\2\2\2\u00b7\u00b8\t\6\2\2\u00b8\u00b9\t\4\2\2\u00b9"+
		"\u00ba\t\20\2\2\u00ba\u00bb\t\r\2\2\u00bb\u00bc\t\6\2\2\u00bc\u00bd\t"+
		"\21\2\2\u00bd\"\3\2\2\2\u00be\u00bf\t\f\2\2\u00bf\u00c0\t\r\2\2\u00c0"+
		"\u00c1\t\13\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3&\3\2\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5\u00c6\7@\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8"+
		"*\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc."+
		"\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0"+
		"\62\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4"+
		"\66\3\2\2\2\u00d5\u00d6\7\u0080\2\2\u00d68\3\2\2\2\u00d7\u00d8\7>\2\2"+
		"\u00d8:\3\2\2\2\u00d9\u00da\7>\2\2\u00da\u00db\7?\2\2\u00db<\3\2\2\2\u00dc"+
		"\u00dd\7?\2\2\u00dd>\3\2\2\2\u00de\u00df\7}\2\2\u00df@\3\2\2\2\u00e0\u00e1"+
		"\7\177\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3D\3\2\2\2\u00e4\u00e5"+
		"\7>\2\2\u00e5\u00e6\7/\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7B\2\2\u00e8H\3"+
		"\2\2\2\u00e9\u00ea\7<\2\2\u00eaJ\3\2\2\2\u00eb\u00ec\4\62;\2\u00ecL\3"+
		"\2\2\2\u00ed\u00ee\4c|\2\u00eeN\3\2\2\2\u00ef\u00f0\4C\\\2\u00f0P\3\2"+
		"\2\2\u00f1\u00f2\t\22\2\2\u00f2R\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\t\17\2\2\u00f5\u00f6\t\23\2\2\u00f6\u00f7\t\5\2\2\u00f7T\3\2\2\2\u00f8"+
		"\u00f9\7h\2\2\u00f9\u00fa\t\3\2\2\u00fa\u00fb\t\n\2\2\u00fb\u00fc\t\4"+
		"\2\2\u00fc\u00fd\t\5\2\2\u00fdV\3\2\2\2\u00fe\u0101\5S*\2\u00ff\u0101"+
		"\5U+\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101X\3\2\2\2\u0102\u0104"+
		"\5K&\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106Z\3\2\2\2\u0107\u010d\5O(\2\u0108\u010c\7a\2\2\u0109"+
		"\u010c\5Q)\2\u010a\u010c\5K&\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\\\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0116\5M\'\2\u0111"+
		"\u0115\7a\2\2\u0112\u0115\5Q)\2\u0113\u0115\5K&\2\u0114\u0111\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117^\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\t\24\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\60\2\2\u011f"+
		"`\3\2\2\2\u0120\u0126\7$\2\2\u0121\u0125\7^\2\2\u0122\u0125\5_\60\2\u0123"+
		"\u0125\n\25\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\2\2\3\u012ab\3\2\2\2"+
		"\u012b\u012c\7$\2\2\u012c\u012d\7^\2\2\u012d\u012e\7$\2\2\u012ed\3\2\2"+
		"\2\u012f\u0135\7$\2\2\u0130\u0134\7^\2\2\u0131\u0134\n\26\2\2\u0132\u0134"+
		"\5_\60\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7$\2\2\u0139f\3\2\2\2\u013a\u013b"+
		"\n\27\2\2\u013bh\3\2\2\2\u013c\u013d\n\30\2\2\u013dj\3\2\2\2\u013e\u013f"+
		"\7/\2\2\u013f\u0140\7/\2\2\u0140\u0144\3\2\2\2\u0141\u0143\13\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\t\31\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\b\66\2\2\u014al\3\2\2\2\u014b\u014c\7*\2\2"+
		"\u014c\u014d\7,\2\2\u014d\u0152\3\2\2\2\u014e\u0151\5m\67\2\u014f\u0151"+
		"\13\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0156\7,\2\2\u0156\u0157\7+\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\b\67\2\2\u0159n\3\2\2\2\u015a\u015b\13\2\2\2\u015bp\3\2\2\2\21"+
		"\2\u0100\u0105\u010b\u010d\u0114\u0116\u011c\u0124\u0126\u0133\u0135\u0144"+
		"\u0150\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}