# Generated from /home/luism/PycharmProjects/COMPIWAVE/Compiwave.g4 by ANTLR 4.6
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CompiwaveParser import CompiwaveParser
else:
    from CompiwaveParser import CompiwaveParser

# This class defines a complete listener for a parse tree produced by CompiwaveParser.
class CompiwaveListener(ParseTreeListener):

    # Enter a parse tree produced by CompiwaveParser#compiwave.
    def enterCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#compiwave.
    def exitCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#var_declaration.
    def enterVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#var_declaration.
    def exitVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#list_declaration.
    def enterList_declaration(self, ctx:CompiwaveParser.List_declarationContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#list_declaration.
    def exitList_declaration(self, ctx:CompiwaveParser.List_declarationContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#function_declaration.
    def enterFunction_declaration(self, ctx:CompiwaveParser.Function_declarationContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#function_declaration.
    def exitFunction_declaration(self, ctx:CompiwaveParser.Function_declarationContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#function_params.
    def enterFunction_params(self, ctx:CompiwaveParser.Function_paramsContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#function_params.
    def exitFunction_params(self, ctx:CompiwaveParser.Function_paramsContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#function_param.
    def enterFunction_param(self, ctx:CompiwaveParser.Function_paramContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#function_param.
    def exitFunction_param(self, ctx:CompiwaveParser.Function_paramContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#cwtype.
    def enterCwtype(self, ctx:CompiwaveParser.CwtypeContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#cwtype.
    def exitCwtype(self, ctx:CompiwaveParser.CwtypeContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#list_assignment.
    def enterList_assignment(self, ctx:CompiwaveParser.List_assignmentContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#list_assignment.
    def exitList_assignment(self, ctx:CompiwaveParser.List_assignmentContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#list_push.
    def enterList_push(self, ctx:CompiwaveParser.List_pushContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#list_push.
    def exitList_push(self, ctx:CompiwaveParser.List_pushContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#list_pop.
    def enterList_pop(self, ctx:CompiwaveParser.List_popContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#list_pop.
    def exitList_pop(self, ctx:CompiwaveParser.List_popContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#var_assignment.
    def enterVar_assignment(self, ctx:CompiwaveParser.Var_assignmentContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#var_assignment.
    def exitVar_assignment(self, ctx:CompiwaveParser.Var_assignmentContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#block.
    def enterBlock(self, ctx:CompiwaveParser.BlockContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#block.
    def exitBlock(self, ctx:CompiwaveParser.BlockContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#main_function.
    def enterMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#main_function.
    def exitMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#statement.
    def enterStatement(self, ctx:CompiwaveParser.StatementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#statement.
    def exitStatement(self, ctx:CompiwaveParser.StatementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#function_statement.
    def enterFunction_statement(self, ctx:CompiwaveParser.Function_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#function_statement.
    def exitFunction_statement(self, ctx:CompiwaveParser.Function_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#arguments.
    def enterArguments(self, ctx:CompiwaveParser.ArgumentsContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#arguments.
    def exitArguments(self, ctx:CompiwaveParser.ArgumentsContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#if_statement.
    def enterIf_statement(self, ctx:CompiwaveParser.If_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#if_statement.
    def exitIf_statement(self, ctx:CompiwaveParser.If_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#else_statement.
    def enterElse_statement(self, ctx:CompiwaveParser.Else_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#else_statement.
    def exitElse_statement(self, ctx:CompiwaveParser.Else_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#while_statement.
    def enterWhile_statement(self, ctx:CompiwaveParser.While_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#while_statement.
    def exitWhile_statement(self, ctx:CompiwaveParser.While_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#do_while_statement.
    def enterDo_while_statement(self, ctx:CompiwaveParser.Do_while_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#do_while_statement.
    def exitDo_while_statement(self, ctx:CompiwaveParser.Do_while_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#if_expr.
    def enterIf_expr(self, ctx:CompiwaveParser.If_exprContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#if_expr.
    def exitIf_expr(self, ctx:CompiwaveParser.If_exprContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#do_if_expr.
    def enterDo_if_expr(self, ctx:CompiwaveParser.Do_if_exprContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#do_if_expr.
    def exitDo_if_expr(self, ctx:CompiwaveParser.Do_if_exprContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#return_statement.
    def enterReturn_statement(self, ctx:CompiwaveParser.Return_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#return_statement.
    def exitReturn_statement(self, ctx:CompiwaveParser.Return_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#print_statement.
    def enterPrint_statement(self, ctx:CompiwaveParser.Print_statementContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#print_statement.
    def exitPrint_statement(self, ctx:CompiwaveParser.Print_statementContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#ListPop.
    def enterListPop(self, ctx:CompiwaveParser.ListPopContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#ListPop.
    def exitListPop(self, ctx:CompiwaveParser.ListPopContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#StringConst.
    def enterStringConst(self, ctx:CompiwaveParser.StringConstContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#StringConst.
    def exitStringConst(self, ctx:CompiwaveParser.StringConstContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#AddSub.
    def enterAddSub(self, ctx:CompiwaveParser.AddSubContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#AddSub.
    def exitAddSub(self, ctx:CompiwaveParser.AddSubContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#EqualityNot.
    def enterEqualityNot(self, ctx:CompiwaveParser.EqualityNotContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#EqualityNot.
    def exitEqualityNot(self, ctx:CompiwaveParser.EqualityNotContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#IntConst.
    def enterIntConst(self, ctx:CompiwaveParser.IntConstContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#IntConst.
    def exitIntConst(self, ctx:CompiwaveParser.IntConstContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#FloatConst.
    def enterFloatConst(self, ctx:CompiwaveParser.FloatConstContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#FloatConst.
    def exitFloatConst(self, ctx:CompiwaveParser.FloatConstContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#MultDiv.
    def enterMultDiv(self, ctx:CompiwaveParser.MultDivContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#MultDiv.
    def exitMultDiv(self, ctx:CompiwaveParser.MultDivContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#VarReference.
    def enterVarReference(self, ctx:CompiwaveParser.VarReferenceContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#VarReference.
    def exitVarReference(self, ctx:CompiwaveParser.VarReferenceContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#BoolConst.
    def enterBoolConst(self, ctx:CompiwaveParser.BoolConstContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#BoolConst.
    def exitBoolConst(self, ctx:CompiwaveParser.BoolConstContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#LTGT.
    def enterLTGT(self, ctx:CompiwaveParser.LTGTContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#LTGT.
    def exitLTGT(self, ctx:CompiwaveParser.LTGTContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#ListIndex.
    def enterListIndex(self, ctx:CompiwaveParser.ListIndexContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#ListIndex.
    def exitListIndex(self, ctx:CompiwaveParser.ListIndexContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#FunctionCall.
    def enterFunctionCall(self, ctx:CompiwaveParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#FunctionCall.
    def exitFunctionCall(self, ctx:CompiwaveParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#AndOr.
    def enterAndOr(self, ctx:CompiwaveParser.AndOrContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#AndOr.
    def exitAndOr(self, ctx:CompiwaveParser.AndOrContext):
        pass


    # Enter a parse tree produced by CompiwaveParser#Paren.
    def enterParen(self, ctx:CompiwaveParser.ParenContext):
        pass

    # Exit a parse tree produced by CompiwaveParser#Paren.
    def exitParen(self, ctx:CompiwaveParser.ParenContext):
        pass


