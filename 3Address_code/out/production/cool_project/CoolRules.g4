grammar CoolRules;
import CoolLexer;

ruleset: (classes)+ EOF;

classes: CLASS TYPEID (INHERITS TYPEID)? LBRACE body RBRACE SEMICOLON;
body: (methods  | attr )*  ;

attr: OBJECTID COLON TYPEID ( ASSIGN stmt)? SEMICOLON;
methods: OBJECTID LPAREN (parameter (COMMA parameter)* )? RPAREN COLON TYPEID LBRACE stmt RBRACE SEMICOLON;
parameter: OBJECTID COLON TYPEID;

stmt: BOOL_CONST                                             # boolconst
      |INT_CONST                                              # intconst
      |OBJECTID                                               # identifier
      |STR_CONST                                              # stringconst
      |NEW TYPEID                                                               # newstmt
      |stmt (ATSYM TYPEID)? DOT OBJECTID LPAREN (stmt (COMMA stmt)* )? RPAREN   # dipatching
      |TILDE stmt                                             # intComplem
      |ISVOID stmt                                            # isvoidstmt
      |stmt STAR stmt                                         # expressions
      |stmt SLASH stmt                                        # expressions
      |stmt PLUS stmt                                         # expressions
      |stmt MINUS stmt                                        # expressions
      |stmt LT stmt                                           # expressions
      |stmt LE stmt                                           # expressions
      |stmt EQUALS stmt                                       # expressions
      |NOT stmt                                               # boolComplem
      |OBJECTID ASSIGN stmt                                   # assignment
      |LET (OBJECTID COLON TYPEID (ASSIGN stmt)? (COMMA)?)+ IN stmt             # letstmt
      |LPAREN stmt RPAREN                                     # parnstmt
      |LBRACE (stmt SEMICOLON)+ RBRACE                        # block
      |OBJECTID LPAREN (stmt (COMMA stmt)* )? RPAREN          # functionCall
      |IF stmt THEN  stmt ELSE stmt FI                        # conditions
      |CASE stmt OF (OBJECTID COLON TYPEID DARROW stmt SEMICOLON)+ ESAC         # case
      |WHILE stmt LOOP stmt POOL                              # loops
       ;
//op: STAR |SLASH | PLUS |MINUS |LT |LE |EQUALS;






