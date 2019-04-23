// Generated from C:/Users/Aliaa/IdeaProjects/cool_project/src\CoolRules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(CoolRulesParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(CoolRulesParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CoolRulesParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(CoolRulesParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(CoolRulesParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CoolRulesParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CoolRulesParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolRulesParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(CoolRulesParser.OpContext ctx);
}