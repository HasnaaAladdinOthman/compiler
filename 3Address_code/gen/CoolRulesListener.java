// Generated from C:/Users/Aliaa/IdeaProjects/cool_project/src\CoolRules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolRulesParser}.
 */
public interface CoolRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(CoolRulesParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(CoolRulesParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(CoolRulesParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(CoolRulesParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CoolRulesParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CoolRulesParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(CoolRulesParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(CoolRulesParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(CoolRulesParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(CoolRulesParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CoolRulesParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CoolRulesParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CoolRulesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CoolRulesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNewstmt(CoolRulesParser.NewstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNewstmt(CoolRulesParser.NewstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolconst(CoolRulesParser.BoolconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolconst(CoolRulesParser.BoolconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStringconst(CoolRulesParser.StringconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStringconst(CoolRulesParser.StringconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CoolRulesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CoolRulesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dipatching}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDipatching(CoolRulesParser.DipatchingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dipatching}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDipatching(CoolRulesParser.DipatchingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loops}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoops(CoolRulesParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loops}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoops(CoolRulesParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(CoolRulesParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(CoolRulesParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLetstmt(CoolRulesParser.LetstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLetstmt(CoolRulesParser.LetstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolComplem(CoolRulesParser.BoolComplemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolComplem(CoolRulesParser.BoolComplemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIntconst(CoolRulesParser.IntconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIntconst(CoolRulesParser.IntconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CoolRulesParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CoolRulesParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIntComplem(CoolRulesParser.IntComplemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIntComplem(CoolRulesParser.IntComplemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoidstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidstmt(CoolRulesParser.IsvoidstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoidstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidstmt(CoolRulesParser.IsvoidstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parnstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterParnstmt(CoolRulesParser.ParnstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parnstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitParnstmt(CoolRulesParser.ParnstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolRulesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolRulesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterConditions(CoolRulesParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitConditions(CoolRulesParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase(CoolRulesParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase(CoolRulesParser.CaseContext ctx);
}