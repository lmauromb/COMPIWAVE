from CompiwaveListener import *
from helpClasess import *

class CompiwaveBaseListener(CompiwaveListener):
    """Grammar rules listener
    
    Clase para caminar por el AST y realizar acciones correspondientes.
    
    Variables de clase:
        currentScope: Muestra cual es el Scope actual al entrar a la regla.
        symbolTable: Table de Simbolos, globals muestra el arbol de scopes.
        cont: Contador para los cuadruplos.
        contTemp: Muestra la direccion en donde comienzan los valores
            temporales de los cuadruplos.
        diccionarioTemp: Diccionario para guardar la relacion de valores
            temporales con su operacion correpondiente.
                Ej. A+2 puede ser 8001
        listaIntrucciones: Lista que contiene los cuadruplos generados.
    
    """

    currentScope = None
    symbolTable = SymbolTable()
    cont = 1
    contTemp = 8000 # todas las variables temporales inician en 8000
    contParam = 9000
    diccionarioTemp = OrderedDict()
    listaInstrucciones = []
    pilaSaltos = []

    def enterCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):
        """Se entra al programa de forma topdown.
        
        Se entra a la regla Compiwave, que define el programa completo,
        y se inicializan las variables de clase.
        
        :param ctx: 
            Contexto del programa, contiene todas las demas relgas.
        :return: 
            Se asigna el currentScope como Global y se liga a la 
            tabla de simbolos.
            El contador se le suma 1, los cuadruplos inician en 1.
        """
        self.currentScope = GlobalScope()
        self.symbolTable.globals = self.currentScope
        quadruple = Quadruple('GOTO', '~', '~', '~')
        self.listaInstrucciones.append(quadruple)
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
        self.contTemp = 8000

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

        # Cuadruplos
        quadruple = Quadruple('ENDFUNC', '~', '~', '~')
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def enterMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        ms = MethodSymbol("main", "void", self.currentScope)
        self.currentScope.define(ms)
        self.currentScope = ms
        self.contTemp = 8000
        self.listaInstrucciones[0].result = self.cont

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

        if functionCalled is None:
            raise Exception("Function {} is not defined".format(functionCalled))

    def enterFunction_statement(self, ctx:CompiwaveParser.Function_statementContext):
        functionName = ctx.ID().getText()

        if self.symbolTable.globals.resolve(functionName) is None:
            raise Exception("Function {} is not defined".format(functionName))

        quadruple = Quadruple('ERA', functionName, '~', '~')
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        # Checar Argumentos
        # functionCalled = self.symbolTable.globals.resolve(functionName)
        # functionArguments = functionCalled.orderedArgs.values()
        # for val in functionArguments:
        #     print(val.cwtype)

    # /////////////////////////////////////////////////////
    # ////////// GENERACION DE CUADRUPLOS /////////////////
    # /////////////////////////////////////////////////////


    # CUADRUPLOS ARITMETICOS
    # Parentesis
    # Multiplicacion, Division
    # Suma, Resta
    # Mayor que, Menor que, Mayor o igual, Menor o igual
    # Igual a, Diferente de
    # And, Or
    # Asignacion
    # Asignacion en declaracion

    def exitParen(self, ctx:CompiwaveParser.ParenContext):
        leftParen = ctx.getChild(0).getText()
        expr = ctx.getChild(1).getText()
        rightParen = ctx.getChild(2).getText()
        key = leftParen + expr + rightParen

        if expr in self.diccionarioTemp:
            self.diccionarioTemp[key] = self.diccionarioTemp[expr]

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

        quadruple = Quadruple(operand, leftOp, rightOp, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        if ctx.ASSIGN() is None:
            pass
        else:
            result = ctx.ID().getText()
            operand = ctx.ASSIGN().getText()
            leftOp = ctx.expr().getText()
            rightOp = "~"

            if leftOp in self.diccionarioTemp:
                leftOp = self.diccionarioTemp[leftOp]

            quadruple = Quadruple(operand, leftOp, rightOp, result)
            self.listaInstrucciones.append(quadruple)
            self.cont += 1

    # CUADRUPLOS CONDICIONALES
    # If else
    # While, Do while

    def exitIf_expr(self, ctx:CompiwaveParser.If_statementContext):
        self.pilaSaltos.append(self.cont)
        quadruple = Quadruple('~', '~', '~', '~')
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitIf_statement(self, ctx:CompiwaveParser.If_statementContext):
        if ctx.else_statement() is None: # Caso sin else
            current = self.pilaSaltos.pop() - 1
            result = ctx.if_expr().getText()

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            quadruple = Quadruple('GOTOF', result, '~', self.cont)
            self.listaInstrucciones[current] = quadruple
        else:
            end = self.pilaSaltos.pop()
            current = self.pilaSaltos.pop() - 1
            result = ctx.if_expr().getText()

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            quadruple = Quadruple('GOTOF', result, '~', end)
            self.listaInstrucciones[current] = quadruple

    def enterElse_statement(self, ctx:CompiwaveParser.Else_statementContext):
        self.pilaSaltos.append(self.cont+1) # valor del GotoF
        self.pilaSaltos.append(self.cont) # valor del Goto
        quadruple = Quadruple('*', '*', '*', '*')
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitElse_statement(self, ctx:CompiwaveParser.Else_statementContext):
        current = self.pilaSaltos.pop() - 1
        quadruple = Quadruple('GOTO', '~', '~', self.cont)
        self.listaInstrucciones[current] = quadruple

    def enterWhile_statement(self, ctx:CompiwaveParser.While_statementContext):
        self.pilaSaltos.append(self.cont) # valor del Goto

    def exitWhile_statement(self, ctx:CompiwaveParser.While_statementContext):
        current = self.pilaSaltos.pop() - 1
        return_while = self.pilaSaltos.pop() # a donde quiero regresar
        result = ctx.if_expr().getText()

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        quadruple = Quadruple('GOTOF', result, '~', self.cont+1)
        self.listaInstrucciones[current] = quadruple
        # Regreso
        quadruple = Quadruple('GOTO', '~', '~', return_while)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def enterDo_while_statement(self, ctx:CompiwaveParser.Do_while_statementContext):
        self.pilaSaltos.append(self.cont)

    def exitDo_while_statement(self, ctx:CompiwaveParser.Do_while_statementContext):
        return_do = self.pilaSaltos.pop()
        result = ctx.do_if_expr().getText()

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        quadruple = Quadruple('GOTOT', result, '~', return_do)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Cuadruplos de Funciones
    # En exitFunction_declaration se genera el que termina la funcion
    # En enterFunction_statement se genera el cuadruplo ERA

    def exitReturn_statement(self, ctx:CompiwaveParser.Return_statementContext):
        result = ctx.expr().getText()

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        quadruple = Quadruple('RETURN', '~', '~', result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitArguments(self, ctx:CompiwaveParser.ArgumentsContext):
        for argument in ctx.numberOfArguments:
            param = self.contParam + 1
            result = argument.getText()

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            quadruple = Quadruple('PARAM', result, '~', param)
            self.listaInstrucciones.append(quadruple)
            self.cont += 1
            self.contParam = param
        self.contParam = 9000

    def exitFunction_statement(self, ctx:CompiwaveParser.Function_statementContext):
        function_name = ctx.ID().getText()
        quadruple = Quadruple('GOSUB', '~', '~', function_name)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitFunctionCall(self, ctx:CompiwaveParser.FunctionCallContext):
        function_statement = ctx.function_statement()
        function_name = function_statement.ID().getText()
        key = ctx.getChild(0).getText()
        result = self.contTemp + 1
        self.diccionarioTemp[key] = result
        quadruple = Quadruple('=', function_name, '~', result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

    def exitPrint_statement(self, ctx:CompiwaveParser.Print_statementContext):
        result = ctx.expr().getText()

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        quadruple = Quadruple('PRINT', '~', '~', result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1