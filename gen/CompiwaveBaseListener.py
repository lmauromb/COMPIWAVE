from CompiwaveListener import *
from helpClasess import *

class CompiwaveBaseListener(CompiwaveListener):
    currentScope = None
    symbolTable = SymbolTable()
    cont = 0
    contTemp = 0
    diccionarioTemp = OrderedDict()
    listaInstrucciones = []

    def enterCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        self.currentScope = GlobalScope()
        self.symbolTable.globals = self.currentScope
        self.cont += 1

    def exitCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        # print(self.symbolTable)
        print("cont: {}".format(self.cont))
        print("\n".join(str(i) for i in self.listaInstrucciones))
        pass

    def enterBlock(self, ctx:CompiwaveParser.BlockContext):
        self.currentScope = LocalScope(self.currentScope)
        # print("cont: {}".format(self.cont))
        # self.cont += 1

    def exitBlock(self, ctx:CompiwaveParser.BlockContext):
        s = "{}: {}".format(self.currentScope.enclosingScope.getScopeName(), self.currentScope)
        # print(s)

        if isinstance(self.currentScope.enclosingScope, MethodSymbol):
            self.currentScope.enclosingScope.enclosedScope = self.currentScope

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
        if self.currentScope.resolve(ms.name) is None:
            self.currentScope.define(ms)
            self.currentScope = ms
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))

    def exitFunction_declaration(self, ctx:CompiwaveParser.Function_declarationContext):
        s = "args: {}".format(self.currentScope)
        # print(s)
        # print("{} : {}".format(self.currentScope.getScopeName(), self.currentScope.enclosedScope))
        self.currentScope = self.currentScope.enclosingScope


    def enterMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        ms = MethodSymbol("main", "void", self.currentScope)
        self.currentScope.define(ms)
        self.currentScope = ms

    def exitMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        # print("{} : {}".format(self.currentScope.getScopeName(), self.currentScope.enclosedScope))
        self.currentScope = self.currentScope.enclosingScope


    def enterFunction_param(self, ctx:CompiwaveParser.Function_paramContext):
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        self.currentScope.define(vs)


    def enterVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        s = "def var: {} as type {}".format(ctx.ID().getText(),
                                            ctx.cwtype().getText())
        # print(s)
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        if self.currentScope.resolve(vs.name) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))


    def enterList_declaration(self, ctx:CompiwaveParser.List_declarationContext):
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        if self.currentScope.resolve(vs.name) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))


    # Semantics

    # Checar que la variable exista
    def enterVarReference(self, ctx:CompiwaveParser.VarReferenceContext):
        vr = self.currentScope.resolve(ctx.getText())
        if vr is None:
            raise Exception("Variable {} is not defined".format(ctx.getText()))
        # print(vr.cwtype)

    # Checar que funcion exista
    def enterFunctionCall(self, ctx:CompiwaveParser.FunctionCallContext):
        functionCalled = self.symbolTable.globals.resolve(
            ctx.function_statement().ID().getText()
        )
        if functionCalled is not None:
            print(functionCalled.cwtype)

    def enterFunction_statement(self, ctx:CompiwaveParser.Function_statementContext):
        functionName = ctx.ID().getText()
        if self.symbolTable.globals.resolve(functionName) is None:
            raise Exception("Funcion {} is not defined".format(functionName))


        # Checar Argumentos
        # functionCalled = self.symbolTable.globals.resolve(functionName)
        # functionArguments = functionCalled.orderedArgs.values()
        # for val in functionArguments:
        #     print(val.cwtype)

    # Generacion de Cuadruplos

    def exitMultDiv(self, ctx:CompiwaveParser.MultDivContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(0).getText()
        rightOp = ctx.getChild(2).getText()
        result =self.contTemp+1

        key = leftOp + operand + rightOp

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]


        self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

    def exitAddSub(self, ctx:CompiwaveParser.AddSubContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(0).getText()
        rightOp = ctx.getChild(2).getText()
        result =self.contTemp+1

        key = leftOp+operand+rightOp

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result


    def exitLTGT(self, ctx:CompiwaveParser.LTGTContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(0).getText()
        rightOp = ctx.getChild(2).getText()
        result =self.contTemp+1

        key = leftOp + operand + rightOp

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

    def exitEqualityNot(self, ctx:CompiwaveParser.EqualityNotContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(0).getText()
        rightOp = ctx.getChild(2).getText()
        result =self.contTemp+1

        key = leftOp + operand + rightOp

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]


        self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

    def exitAndOr(self, ctx:CompiwaveParser.AndOrContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(0).getText()
        rightOp = ctx.getChild(2).getText()
        result = self.contTemp+1

        key = leftOp + operand + rightOp

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]


        self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

    def exitVar_assignment(self, ctx:CompiwaveParser.Var_assignmentContext):
        operand = ctx.getChild(1).getText()
        leftOp = ctx.getChild(2).getText()
        rightOp = "~"
        result = ctx.getChild(0).getText()


        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        # key = leftOp + operand + rightOp
        #
        # self.diccionarioTemp[key] = result

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
