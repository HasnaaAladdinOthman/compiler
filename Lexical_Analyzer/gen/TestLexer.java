
import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestLexer {
    static String fileContent="";
    static String[] TOKENS = {"CASE","ESAC","IF","FI","WHILE","THEN","ELSE","LOOP","POOL","CLASS","IN","INHERITS","OF","LET","NEW","ISVOID","NOT","SEMICOLON","DARROW","LPAREN","RPAREN","COMMA","PLUS","MINUS","STAR",
            "SLASH","TILDE","LT","LE","EQUALS","LBRACE","RBRACE","DOT","ASSIGN","ATSYM","COLON","BOOL_CONST","INT_CONST","TYPEID","OBJECTID","WHITESPACE","EOF_STRING","SINGLE_BACKSLASH","STR_CONST","SL_COMMENT","ML_COMMENT","OTHER",
            ";", "=>", "(",")",",","+","-","*","/","~","<","<=","=","{","}",".","<-","@",":"};

    public static void main(String[] args) throws Exception {
        //System.out.println("Parsing: " + args[0]);
        int c=0;
        String inputFile = "bad.cl";
        // FileInputStream is =new FileInputStream(inputFile);
        FileInputStream fis = new FileInputStream(new File(inputFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);
        Token token = lexer.nextToken();
        while (token.getType() != CoolLexer.EOF) {

            fileContent += lexer.getLine()+"\n"+TOKENS[token.getType()-1] + "\n" + token.getText()+"\n";
           // System.out.println(token.getText());
            if(token.getType() == CoolLexer.OTHER){
                c=1;
             //   System.out.println(token.getText());
                System.out.println("ERROR: "+lexer.getLine()+":Lexer: Invalid Token generated : "+token.getText()+"\n");
                break;
            };
            token = lexer.nextToken();
        }
        if(c==0){
        BufferedWriter writer = new BufferedWriter(new FileWriter("test1.cl-lex"));
        writer.write(fileContent);
        writer.close();}
    }
}