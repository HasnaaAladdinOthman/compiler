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
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CoolRulesParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewstmt(CoolRulesParser.NewstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolconst(CoolRulesParser.BoolconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringconst(CoolRulesParser.StringconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CoolRulesParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dipatching}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDipatching(CoolRulesParser.DipatchingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loops}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(CoolRulesParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(CoolRulesParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetstmt(CoolRulesParser.LetstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolComplem(CoolRulesParser.BoolComplemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intconst}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntconst(CoolRulesParser.IntconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CoolRulesParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intComplem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntComplem(CoolRulesParser.IntComplemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoidstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidstmt(CoolRulesParser.IsvoidstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parnstmt}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParnstmt(CoolRulesParser.ParnstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolRulesParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditions}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(CoolRulesParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(CoolRulesParser.CaseContext ctx);
}