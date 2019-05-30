import org.antlr.v4.runtime.ParserRuleContext;

import java.sql.SQLOutput;

public class MyCoolVisitor extends CoolRulesBaseVisitor {

    int lcount =0, tcount=0, retFunc = 0;
    String[] ruleNames = CoolRulesParser.ruleNames;
    @Override
    public Object visitRuleset(CoolRulesParser.RulesetContext ctx) {
        return super.visitRuleset(ctx);
    }

    @Override
    public Object visitClasses(CoolRulesParser.ClassesContext ctx) {
        System.out.println();
        System.out.println("class "+ ctx.TYPEID(0) );
        return super.visitClasses(ctx);
    }

    @Override
    public Object visitBody(CoolRulesParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Object visitAttr(CoolRulesParser.AttrContext ctx) {
        String className = ctx.parent.parent.getChild(1).getText();

        if( ctx.getChildCount() > 4) {
            System.out.println(className+"."+ctx.OBJECTID() + " = " + visit(ctx.stmt()));
        }
        return "";
    }

    @Override
    public Object visitMethods(CoolRulesParser.MethodsContext ctx) {
        String className = ctx.parent.parent.getChild(1).getText();
        int temp= tcount;
        System.out.println(className+"."+ctx.OBJECTID()+":");
        System.out.println("    BeginFunc;");
        if(ctx.stmt().getChildCount() == 1) {
            System.out.println("    t" + temp + " = " + visit(ctx.stmt()));
            System.out.println("    return t"+temp);
        }
        else
            visit(ctx.stmt());
        System.out.println("    EndFunc;");
        return "";
    }

    @Override
    public Object visitParameter(CoolRulesParser.ParameterContext ctx) {

        return super.visitParameter(ctx);
    }


    @Override
    public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
        return ctx.OBJECTID() ;
    }

    @Override
    public Object visitBoolconst(CoolRulesParser.BoolconstContext ctx) {
        return ctx.BOOL_CONST();
    }

    @Override
    public Object visitStringconst(CoolRulesParser.StringconstContext ctx) {
        return ctx.STR_CONST();
    }

    @Override
    public Object visitIntconst(CoolRulesParser.IntconstContext ctx) {
        return ctx.INT_CONST();
    }

    @Override
    public Object visitParnstmt(CoolRulesParser.ParnstmtContext ctx) {
        return visit(ctx.stmt());
    }

    @Override
    public Object visitBlock(CoolRulesParser.BlockContext ctx) {
        int i=0;
        if( ctx.getChildCount() > 2  ){
            for( i=0 ;i<ctx.stmt().size()-1;i++){
                visit(ctx.stmt(i));
            }
        }
        String stmt1 = visit(ctx.stmt(i)).toString();
        if(   ! stmt1.matches("t"+(tcount) ) ){
            //tcount++;
            return stmt1;
        }else
            return "t"+(tcount-1)+" = "+stmt1+";";
    }

    @Override
    public Object visitAssignment(CoolRulesParser.AssignmentContext ctx) {
        //ctx.stmt().getChild(1);
        System.out.println("    "+ ctx.OBJECTID()+" = " + visit(ctx.stmt())+";");
        return "";
    }


    @Override
    public Object visitLoops(CoolRulesParser.LoopsContext ctx) {

        System.out.println("L"+lcount+":");
        lcount++;
        visit(ctx.stmt(0));
        System.out.println("    IfZ  " +"t"+(tcount-1)+"  Goto  "+"L"+lcount+";");
        visit(ctx.stmt(1));
        System.out.println("Goto  "+"L"+(lcount-1)+";");
        System.out.println("L"+lcount+":");

        return "";
    }

    @Override
    public Object visitConditions(CoolRulesParser.ConditionsContext ctx) {

        String stmt1 = visit(ctx.stmt(0)).toString();
        if(  ! stmt1.matches("t"+(tcount-1) ) ){
           // System.out.println("entered if ");
            System.out.println("    t"+tcount+" = "+stmt1+";");
            tcount++;
        }
//        else
//            System.out.println(stmt1);
        //System.out.println("t"+tcount+" = "+visit(ctx.stmt(0))+";");
        System.out.println("    IfZ t"+(tcount-1)+" Goto L"+lcount+";");
       // if(ctx.stmt(1).getChildCount() == 1 )
      //  System.out.println("stmt in if is  "+ctx.stmt(1).getChildCount());
        System.out.println("    "+visit(ctx.stmt(1))+";");
        lcount+=1;
        System.out.println("    Goto L"+lcount+";");
        System.out.println("L"+(lcount-1)+":");
        System.out.println(visit(ctx.stmt(2))+";");
        System.out.println("L"+lcount+":");
        lcount++;

        return "";
    }

    @Override
    public  Object visitCase(CoolRulesParser.CaseContext ctx)
    {
        int caseVar =tcount;
        String stmt1 = visit(ctx.stmt(0)).toString();
        if(   ! stmt1.matches("t"+(tcount-1) ) ){
            //System.out.println("stmt1");
            System.out.println("    t"+tcount+" = "+stmt1+";");
            tcount++;

        }
//        else
//            System.out.println(stmt1);

        //System.out.println("t"+tcount+"="+visit(ctx.stmt(0))+";");
        System.out.println("    Goto TEST;");
        int c=1;
        int size=ctx.OBJECTID().size();
        while (size>0){
            System.out.println("L"+lcount+": ");
            lcount++;
            visit(ctx.stmt(c));
            System.out.println("    Goto NEXT;");
            c+=1;
            size-=1;
        }
        int a=0;
        size=ctx.OBJECTID().size();
        System.out.println("TEST: ");
        while (size>0){
            System.out.print("  IF t"+caseVar+" == "+ ctx.OBJECTID(a) );
            System.out.println("  goto L"+(a+1)+";");
            a+=1;
            size-=1;
        }
        System.out.println("NEXT: ");
        return "";
    }
    @Override
    public Object visitExpressions(CoolRulesParser.ExpressionsContext ctx) {
        String temp = "";
        Object left = visit(ctx.stmt(0));
        Object right = visit(ctx.stmt(1));
        //System.out.println(ctx.getChild(1).getText());
        switch(ctx.getChild(1).getText()){
            case "+":
                temp = left +" + " + right ;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "-":
                temp = left + " - " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "*":
                temp = left + " * " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "/" :
                temp = left + " / " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "<":
                temp = left + " < " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "<=":
                temp = left + " <= " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "=":
                temp = left + " == " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            default:
                System.out.println("not valid operation ");

        }
        return "t"+(tcount-1) ;
    }

    @Override
    public Object visitFunctionCall(CoolRulesParser.FunctionCallContext ctx) {
        String temp = "";
//        String tempo = ctx.getParent().getChild(2).getText();
//        System.out.println(tempo);
        if( ctx.getChildCount() > 3  )
            for (int i =0 ; i< ctx.stmt().size() ; i++)
            {
                temp = "t" + tcount;
                String stmt1 = visit(ctx.stmt(i)).toString();
                if( ! stmt1.matches("t"+(tcount-1)) ){
                    System.out.println("    t"+tcount+" = "+stmt1+";");
                }
//                else
//                    System.out.println(visit(ctx.stmt(i)));

//                System.out.println("    "+temp + " = " + visit(ctx.stmt(i))+";");
                System.out.println("    Param "+ temp+";");
                tcount++;
            }
        tcount = tcount - ctx.stmt().size() ;
        System.out.println("    Call "+ ctx.OBJECTID()+", "+(ctx.stmt().size())+";");
        return "";
    }

    @Override
    public Object visitDipatching(CoolRulesParser.DipatchingContext ctx) {

        return "dispatched";
    }

    @Override
    public Object visitNewstmt(CoolRulesParser.NewstmtContext ctx) {
        //its type casting i think it doesn't indicate something in TAC
        return super.visitNewstmt(ctx);
    }

    @Override
    public Object visitLetstmt(CoolRulesParser.LetstmtContext ctx) {
        if( ctx.stmt().size()>1) {
            System.out.println(ctx.OBJECTID(0)+" = "+ visit(ctx.stmt(0))+";");

            visit(ctx.stmt(1));
        }else
             visit(ctx.stmt(0));
        return "";
    }

    @Override
    public Object visitIntComplem(CoolRulesParser.IntComplemContext ctx) {
//        System.out.println("t"+tcount+ " = " +"~ "+ visit(ctx.stmt())+";");
//        tcount++;
        return "~ "+ visit(ctx.stmt());
    }

    @Override
    public Object visitBoolComplem(CoolRulesParser.BoolComplemContext ctx) {
//        System.out.println("t"+tcount+ " = " +"! "+ visit(ctx.stmt())+";");
//        tcount++;
        return "! "+ visit(ctx.stmt());
    }
    @Override
    public Object visitIsvoidstmt(CoolRulesParser.IsvoidstmtContext ctx) {
        //Also check the type
        //System.out.println("if "+ visit(ctx.stmt()));
        return super.visitIsvoidstmt(ctx);
    }

}
