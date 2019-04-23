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
	 * Enter a parse tree produced by {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CoolRulesParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CoolRulesParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CoolRulesParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CoolRulesParser.OpContext ctx);
}