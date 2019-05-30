
import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Stream;

class StringSerial implements Serializable {
    String inputStr;

    public StringSerial(String str) {
        inputStr = str ;
    }
}

public class TestLexer {
    static String fileContent="";
    static String[] TOKENS = {"CASE","ESAC","IF","FI","WHILE","THEN","ELSE","LOOP","POOL","CLASS","IN","","OF","LET","NEW","ISVOID","NOT","SEMICOLON","DARROW","LPAREN","RPAREN","COMMA","PLUS","MINUS","STAR",
            "SLASH","TILDE","LT","LE","EQUALS","LBRACE","RBRACE","DOT","ASSIGN","ATSYM","COLON","BOOL_COINHERITSNST","INT_CONST","TYPEID","OBJECTID","WHITESPACE","EOF_STRING","SINGLE_BACKSLASH","STR_CONST","SL_COMMENT","ML_COMMENT","OTHER",
            ";", "=>", "(",")",",","+","-","*","/","~","<","<=","=","{","}",".","<-","@",":"};

    public static void main(String[] args) throws Exception {
        //System.out.println("Parsing: " + args[0]);
        int c=0;
        String inputFile = "test3.cl";
        FileInputStream fis = new FileInputStream(new File(inputFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        fis.close();

        //for lexer
        CoolLexer lexer = new CoolLexer(input);
        //System.out.print(lexer._text);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        //for parser
        CoolRulesParser parser = new  CoolRulesParser(tokens);
        ParseTree tree = parser.ruleset();
        String parsTree = tree.toStringTree();

        //for visitor to create 3ADD code
        MyCoolVisitor visitor = new MyCoolVisitor();
        visitor.visit(tree);

       /* CommonTokenStream tokens = new CommonTokenStream(lexer);
        for(Object o : tokens.getTokens()) {
            Token t = (Token)o;
            System.out.println("for "+t);
        }*/


        for(Object o : tokens.getTokens() ) {
            Token token = (Token)o;
            if(token.getText() == "<EOF>")  break;
            fileContent += token.getLine()+"\n"+TOKENS[token.getType()-1] + "\n" + token.getText()+"\n";
            //System.out.println(token.getText());
            if(token.getType() == CoolLexer.OTHER){
                c=1;
                System.out.println("ERROR: "+lexer.getLine()+":Lexer: Invalid Token generated : "+token.getText()+"\n");
                break;
            }

        }

        if(c==0){
            BufferedWriter writer = new BufferedWriter(new FileWriter("test1.cl-lex"));
            writer.write(fileContent);
            writer.close();
        }



        //Serialize CST
        StringSerial serialParsTree = new StringSerial(parsTree);

        FileOutputStream outfile = new FileOutputStream(new File("test1.cl-cst"));
        ObjectOutputStream  outObj = new ObjectOutputStream(outfile);

        outObj.writeObject(serialParsTree);

        outObj.close();
        outfile.close();

        //Deserialize lex //but it's already unserialized
        /*FileInputStream inFile = new FileInputStream(new File("test1.cl-lex"));
        ObjectInputStream inObj = new ObjectInputStream(inFile);

        StringSerial lex = (StringSerial) inObj.readObject();

        System.out.print(lex);*/



/*
        String inputfile2 = "test1.cl-lex";
        FileInputStream lexs = new FileInputStream(new File(inputfile2));
        BufferedReader reader = new BufferedReader(new InputStreamReader(lexs));

        String line = reader.readLine();
        List<Token> tokensList = new ArrayList();
        //String strTokens = "";
        int count=1;
        while(line != null){
            if(count%3 == 0 )
            {
                tokensList.add((Token) line);
                //strTokens += line +" ";
                 }

            line = reader.readLine();
            count++;
        }
        System.out.println(strTokens);

        */
        //CommonTokenStream tokeeeeens = new CommonTokenStream(tokenizer);



        }
}