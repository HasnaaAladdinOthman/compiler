grammar CoolRules;
import CoolLexer;

ruleset: (classes)+EOF;

classes: CLASS TYPEID (INHERITS TYPEID)? LBRACE body RBRACE SEMICOLON;
body: (methods  | attr )*  ;

attr: OBJECTID COLON TYPEID ( ASSIGN stmt)? SEMICOLON;
methods: OBJECTID LPAREN (parameter (COMMA parameter)* )? RPAREN COLON TYPEID LBRACE stmt RBRACE SEMICOLON;
parameter: OBJECTID COLON TYPEID;

stmt: BOOL_CONST                                  //    # boolconst
    |INT_CONST                                      //  # intconst
    |OBJECTID                                     //    # identifier
    |STRING                                    //     #stringconst
    |LPAREN stmt RPAREN                                  //         # parnstmt
    |OBJECTID ASSIGN stmt                        //     # assignment
    |stmt (ATSYM TYPEID)? DOT OBJECTID LPAREN (stmt (COMMA stmt)* )? RPAREN   //#dipatching
    |OBJECTID LPAREN (stmt (COMMA stmt)* )? RPAREN    //   #dispatching2
    |IF stmt THEN  stmt (ELSE stmt)? FI           //    # conditions
    |WHILE stmt LOOP stmt POOL                  //      # loops
    |stmt op stmt                               //      # expressions
    |TILDE stmt                                  //     # expression_
    |LBRACE (stmt SEMICOLON)+ RBRACE             //    # block
    |LET (OBJECTID COLON TYPEID (ASSIGN stmt)?)+ IN stmt  //    # letstmt
    |NEW TYPEID                                    //   # newstmt
    |ISVOID stmt                                    //  # isvoidstmt
    ;

op: PLUS |MINUS |STAR| SLASH|LT|LE|EQUALS;






