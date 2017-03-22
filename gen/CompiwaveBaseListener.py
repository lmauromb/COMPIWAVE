from CompiwaveListener import *
from helpClasess import *

class CompiwaveBaseListener(CompiwaveListener):
    currentScope = None
    symbolTable = SymbolTable()

    def enterCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        self.currentScope = GlobalScope()
        self.symbolTable.globals = self.currentScope

    def exitCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        print(self.symbolTable)


    def enterBlock(self, ctx:CompiwaveParser.BlockContext):
        self.currentScope = LocalScope(self.currentScope)

    def exitBlock(self, ctx:CompiwaveParser.BlockContext):
        s = "{}: {}".format(self.currentScope.enclosingScope.getScopeName(), self.currentScope)
        print(s)
        # print(self.currentScope.enclosingScope.getScopeName())
        self.currentScope = self.currentScope.enclosingScope


    def enterFunction_declaration(self, ctx:CompiwaveParser.Function_declarationContext):
        if ctx.cwtype() is None:
            t = "void"
        else:
            t = ctx.cwtype().getText()

        s = "def fun {} as type {}".format(
            ctx.ID().getText(), t
        )
        # print(s)
        returnType = t
        ms = MethodSymbol(ctx.ID().getText(), returnType, self.currentScope)
        if self.currentScope.resolve(ms) is None:
            self.currentScope.define(ms)
            self.currentScope = ms
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))

    def exitFunction_declaration(self, ctx:CompiwaveParser.Function_declarationContext):
        s = "args: {}".format(self.currentScope)
        # print(s)
        self.currentScope = self.currentScope.enclosingScope


    def enterMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        ms = MethodSymbol("main", "void", self.currentScope)
        self.currentScope.define(ms)
        self.currentScope = ms

    def exitMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        self.currentScope = self.currentScope.enclosingScope


    def enterFunction_param(self, ctx:CompiwaveParser.Function_paramContext):
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        self.currentScope.define(vs)


    def enterVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        s = "def var: {} as type {}".format(ctx.ID().getText(),
                                            ctx.cwtype().getText())
        # print(s)
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        if self.currentScope.resolve(vs) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))


    def enterList_declaration(self, ctx:CompiwaveParser.List_declarationContext):
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        if self.currentScope.resolve(vs) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))


