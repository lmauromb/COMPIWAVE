// Generated from /home/luism/PycharmProjects/COMPIWAVE/Compiwave.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompiwaveParser}.
 */
public interface CompiwaveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#compiwave}.
	 * @param ctx the parse tree
	 */
	void enterCompiwave(CompiwaveParser.CompiwaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#compiwave}.
	 * @param ctx the parse tree
	 */
	void exitCompiwave(CompiwaveParser.CompiwaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CompiwaveParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CompiwaveParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void enterList_declaration(CompiwaveParser.List_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void exitList_declaration(CompiwaveParser.List_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CompiwaveParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CompiwaveParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(CompiwaveParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(CompiwaveParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(CompiwaveParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(CompiwaveParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CompiwaveParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CompiwaveParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#list_assignment}.
	 * @param ctx the parse tree
	 */
	void enterList_assignment(CompiwaveParser.List_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#list_assignment}.
	 * @param ctx the parse tree
	 */
	void exitList_assignment(CompiwaveParser.List_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#list_push}.
	 * @param ctx the parse tree
	 */
	void enterList_push(CompiwaveParser.List_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#list_push}.
	 * @param ctx the parse tree
	 */
	void exitList_push(CompiwaveParser.List_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#list_pop}.
	 * @param ctx the parse tree
	 */
	void enterList_pop(CompiwaveParser.List_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#list_pop}.
	 * @param ctx the parse tree
	 */
	void exitList_pop(CompiwaveParser.List_popContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment(CompiwaveParser.Var_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment(CompiwaveParser.Var_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CompiwaveParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CompiwaveParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(CompiwaveParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(CompiwaveParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CompiwaveParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CompiwaveParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(CompiwaveParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(CompiwaveParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CompiwaveParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CompiwaveParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CompiwaveParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CompiwaveParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(CompiwaveParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(CompiwaveParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CompiwaveParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CompiwaveParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(CompiwaveParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(CompiwaveParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(CompiwaveParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(CompiwaveParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#do_if_expr}.
	 * @param ctx the parse tree
	 */
	void enterDo_if_expr(CompiwaveParser.Do_if_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#do_if_expr}.
	 * @param ctx the parse tree
	 */
	void exitDo_if_expr(CompiwaveParser.Do_if_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CompiwaveParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CompiwaveParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiwaveParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(CompiwaveParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiwaveParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(CompiwaveParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPop}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPop(CompiwaveParser.ListPopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPop}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPop(CompiwaveParser.ListPopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(CompiwaveParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(CompiwaveParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CompiwaveParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CompiwaveParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityNot}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityNot(CompiwaveParser.EqualityNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityNot}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityNot(CompiwaveParser.EqualityNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(CompiwaveParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(CompiwaveParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(CompiwaveParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(CompiwaveParser.FloatConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CompiwaveParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CompiwaveParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(CompiwaveParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(CompiwaveParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(CompiwaveParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(CompiwaveParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTGT}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLTGT(CompiwaveParser.LTGTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTGT}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLTGT(CompiwaveParser.LTGTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListIndex(CompiwaveParser.ListIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListIndex(CompiwaveParser.ListIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CompiwaveParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CompiwaveParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(CompiwaveParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(CompiwaveParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(CompiwaveParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link CompiwaveParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(CompiwaveParser.ParenContext ctx);
}