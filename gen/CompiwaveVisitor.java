// Generated from /home/luism/PycharmProjects/COMPIWAVE/Compiwave.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompiwaveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompiwaveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#compiwave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiwave(CompiwaveParser.CompiwaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(CompiwaveParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#list_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_declaration(CompiwaveParser.List_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(CompiwaveParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(CompiwaveParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(CompiwaveParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CompiwaveParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#list_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_assignment(CompiwaveParser.List_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#list_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_push(CompiwaveParser.List_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#list_pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_pop(CompiwaveParser.List_popContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#var_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment(CompiwaveParser.Var_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CompiwaveParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(CompiwaveParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CompiwaveParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(CompiwaveParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CompiwaveParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CompiwaveParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(CompiwaveParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CompiwaveParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(CompiwaveParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(CompiwaveParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#do_if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_if_expr(CompiwaveParser.Do_if_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiwaveParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CompiwaveParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListPop}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPop(CompiwaveParser.ListPopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(CompiwaveParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CompiwaveParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityNot}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityNot(CompiwaveParser.EqualityNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(CompiwaveParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(CompiwaveParser.FloatConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(CompiwaveParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(CompiwaveParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(CompiwaveParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LTGT}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLTGT(CompiwaveParser.LTGTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndex(CompiwaveParser.ListIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CompiwaveParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(CompiwaveParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(CompiwaveParser.ParenContext ctx);
}