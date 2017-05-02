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
    contTemp = 80000 # todas las variables temporales inician en 80000
    contParam = 90000
    cont_int = 5000
    cont_float = 10000
    cont_string = 15000
    cont_boolean = 20000
    cont_cte = 50000
    diccionario_cte = OrderedDict()
    diccionario_funciones = OrderedDict()
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
        self.cont_int = 5000
        self.cont_float = 10000
        self.cont_string = 15000
        self.cont_boolean = 20000

    def exitCompiwave(self, ctx:CompiwaveParser.CompiwaveContext):

        # print("Variables Globales y su directorio")
        # for symbol in self.symbolTable.globals.symbols:
        #     variable = self.symbolTable.globals.symbols[symbol]
        #     if isinstance(variable, MethodSymbol):
        #         print(variable.enclosedScope)
        #     else:
        #         print("{} : {}".format(variable.name, variable.dirBase))

        # print(self.diccionario_cte)
        # print(self.diccionario_funciones)
        # print("cont: {}".format(self.cont))
        # print("\n".join(str(i) for i in self.listaInstrucciones))
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
        self.contTemp = 80000
        self.cont_int = 25000
        self.cont_float = 30000
        self.cont_string = 35000
        self.cont_boolean = 40000

        if self.currentScope.resolve(ms.name) is None:
            self.currentScope.define(ms)
            self.currentScope = ms
            self.diccionario_funciones[ms.name] = self.cont
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
        self.contTemp = 80000
        self.cont_int = 25000
        self.cont_float = 30000
        self.cont_string = 35000
        self.cont_boolean = 40000
        self.listaInstrucciones[0].result = self.cont

    def exitMain_function(self, ctx:CompiwaveParser.Main_functionContext):
        # print("{} : {}".format(self.currentScope.getScopeName(), self.currentScope.enclosedScope))
        self.currentScope = self.currentScope.enclosingScope

        # Cuadruplos
        quadruple = Quadruple('HALT', '~', '~', '~')
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def enterFunction_param(self, ctx:CompiwaveParser.Function_paramContext):
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        vs.dirBase = self.contParam+1
        self.contParam += 1
        self.currentScope.define(vs)

    def exitFunction_params(self, ctx:CompiwaveParser.Function_paramsContext):
        self.contParam = 90000

    def enterVar_declaration(self, ctx:CompiwaveParser.Var_declarationContext):
        s = "def var: {} as type {}".format(ctx.ID().getText(),
                                            ctx.cwtype().getText())
        # print(s)
        vs = VariableSymbol(ctx.ID().getText(), ctx.cwtype().getText())

        if ctx.cwtype().getText() == "int":
            vs.dirBase = self.cont_int
            self.cont_int += 1
        elif ctx.cwtype().getText() == "float":
            vs.dirBase = self.cont_float
            self.cont_float += 1
        elif ctx.cwtype().getText() == "string":
            vs.dirBase = self.cont_string
            self.cont_string += 1
        elif ctx.cwtype().getText() == "boolean":
            vs.dirBase = self.cont_boolean
            self.cont_boolean += 1

        if self.currentScope.resolve(vs.name) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))

    def enterList_declaration(self, ctx:CompiwaveParser.List_declarationContext):
        ls = ListSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        if self.currentScope.resolve(ls.name) is None:
            self.currentScope.define(ls)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))

    def enterVector_declaration(self, ctx:CompiwaveParser.Vector_declarationContext):
        vs = VectorSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        vs.limSup = int(ctx.expr().getText())

        if ctx.cwtype().getText() == "int":
            vs.dirBase = self.cont_int
            self.cont_int += vs.m0
        elif ctx.cwtype().getText() == "float":
            vs.dirBase = self.cont_float
            self.cont_float += vs.m0
        elif ctx.cwtype().getText() == "string":
            vs.dirBase = self.cont_string
            self.cont_string += vs.m0
        elif ctx.cwtype().getText() == "boolean":
            vs.dirBase = self.cont_boolean
            self.cont_boolean += vs.m0

        if self.currentScope.resolve(vs.name) is None:
            self.currentScope.define(vs)
        else:
            raise Exception("Name {} already used".format(ctx.ID().getText()))

    def enterMatrix_declaration(self, ctx:CompiwaveParser.Matrix_declarationContext):
        ms = MatrixSymbol(ctx.ID().getText(), ctx.cwtype().getText())
        ms.limSup1 = int(ctx.expr(0).getText())
        ms.limSup2 = int(ctx.expr(1).getText())

        if ctx.cwtype().getText() == "int":
            ms.dirBase = self.cont_int
            self.cont_int += ms.m0
        elif ctx.cwtype().getText() == "float":
            ms.dirBase = self.cont_float
            self.cont_float += ms.m0
        elif ctx.cwtype().getText() == "string":
            ms.dirBase = self.cont_string
            self.cont_string += ms.m0
        elif ctx.cwtype().getText() == "boolean":
            ms.dirBase = self.cont_boolean
            self.cont_boolean += ms.m0

        if self.currentScope.resolve(ms.name) is None:
            self.currentScope.define(ms)
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

        # Checa si son variables
        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(rightOp):
            rightOp = self.currentScope.resolve(rightOp).dirBase

        # Checa si son temporales
        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        # Checa si son Cconstantes
        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

        if rightOp in self.diccionario_cte:
            rightOp = self.diccionario_cte[rightOp]



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

        # Checa si son variables
        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(rightOp):
            rightOp = self.currentScope.resolve(rightOp).dirBase

        # Checa si son temporales
        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        # Checa si son Cconstantes
        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

        if rightOp in self.diccionario_cte:
            rightOp = self.diccionario_cte[rightOp]

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

        # Checa si son variables
        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(rightOp):
            rightOp = self.currentScope.resolve(rightOp).dirBase

        # Checa si son temporales
        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        # Checa si son Cconstantes
        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

        if rightOp in self.diccionario_cte:
            rightOp = self.diccionario_cte[rightOp]

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

        # Checa si son variables
        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(rightOp):
            rightOp = self.currentScope.resolve(rightOp).dirBase

        # Checa si son temporales
        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        # Checa si son Cconstantes
        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

        if rightOp in self.diccionario_cte:
            rightOp = self.diccionario_cte[rightOp]

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

        # Checa si son variables
        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(rightOp):
            rightOp = self.currentScope.resolve(rightOp).dirBase

        # Checa si son temporales
        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if rightOp in self.diccionarioTemp:
            rightOp = self.diccionarioTemp[rightOp]

        # Checa si son Cconstantes
        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

        if rightOp in self.diccionario_cte:
            rightOp = self.diccionario_cte[rightOp]

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

        if self.currentScope.resolve(leftOp):
            leftOp = self.currentScope.resolve(leftOp).dirBase

        if self.currentScope.resolve(result):
            result = self.currentScope.resolve(result).dirBase

        if leftOp in self.diccionarioTemp:
            leftOp = self.diccionarioTemp[leftOp]

        if leftOp in self.diccionario_cte:
            leftOp = self.diccionario_cte[leftOp]

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

            if self.currentScope.resolve(leftOp):
                leftOp = self.currentScope.resolve(leftOp).dirBase

            if self.currentScope.resolve(result):
                result = self.currentScope.resolve(result).dirBase

            if leftOp in self.diccionarioTemp:
                leftOp = self.diccionarioTemp[leftOp]

            if leftOp in self.diccionario_cte:
                leftOp = self.diccionario_cte[leftOp]

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

            if self.currentScope.resolve(result):
                result = self.currentScope.resolve(result).dirBase

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            if result in self.diccionario_cte:
                result = self.diccionario_cte[result]

            quadruple = Quadruple('GOTOF', result, '~', self.cont)
            self.listaInstrucciones[current] = quadruple
        else:
            end = self.pilaSaltos.pop()
            current = self.pilaSaltos.pop() - 1
            result = ctx.if_expr().getText()

            if self.currentScope.resolve(result):
                result = self.currentScope.resolve(result).dirBase

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            if result in self.diccionario_cte:
                result = self.diccionario_cte[result]

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

        if self.currentScope.resolve(result):
            result = self.currentScope.resolve(result).dirBase

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        if result in self.diccionario_cte:
            result = self.diccionario_cte[result]

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

        if self.currentScope.resolve(result):
            result = self.currentScope.resolve(result).dirBase

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        if result in self.diccionario_cte:
            result = self.diccionario_cte[result]

        quadruple = Quadruple('GOTOT', result, '~', return_do)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Cuadruplos de Funciones
    # En exitFunction_declaration se genera el que termina la funcion
    # En enterFunction_statement se genera el cuadruplo ERA

    def exitReturn_statement(self, ctx:CompiwaveParser.Return_statementContext):
        result = ctx.expr().getText()

        if self.currentScope.resolve(result):
            result = self.currentScope.resolve(result).dirBase

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        if result in self.diccionario_cte:
            result = self.diccionario_cte[result]

        quadruple = Quadruple('RETURN', '~', '~', result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    def exitArguments(self, ctx:CompiwaveParser.ArgumentsContext):
        for argument in ctx.numberOfArguments:
            param = self.contParam + 1
            result = argument.getText()

            if self.currentScope.resolve(result):
                result = self.currentScope.resolve(result).dirBase

            if result in self.diccionarioTemp:
                result = self.diccionarioTemp[result]

            if result in self.diccionario_cte:
                result = self.diccionario_cte[result]

            quadruple = Quadruple('PARAM', result, '~', param)
            self.listaInstrucciones.append(quadruple)
            self.cont += 1
            self.contParam = param
        self.contParam = 90000

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

        if self.currentScope.resolve(result):
            result = self.currentScope.resolve(result).dirBase

        if result in self.diccionarioTemp:
            result = self.diccionarioTemp[result]

        if result in self.diccionario_cte:
            result = self.diccionario_cte[result]

        quadruple = Quadruple('PRINT', '~', '~', result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Cuadruplos de Vectores

    # Asignacion de Vectores
    def exitVector_assignment(self, ctx:CompiwaveParser.Vector_assignmentContext):

        # Cuadruplos para las casillas de un Vector
        vector_index = ctx.expr(0).getText()
        vector_name = ctx.ID().getText()

        if vector_index in self.diccionarioTemp:
            vector_index = self.diccionarioTemp[vector_index]

        if self.currentScope.resolve(vector_index):
            vector_index = self.currentScope.resolve(vector_index).dirBase

        if vector_index in self.diccionario_cte:
            vector_index = self.diccionario_cte[vector_index]

        current_vector = self.currentScope.resolve(vector_name)

        quadruple = Quadruple("VER", vector_index, current_vector.limInf, current_vector.limSup)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp+1
        quadruple = Quadruple("K", vector_index, current_vector.k, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp+1
        quadruple = Quadruple("DIRBASE", self.contTemp, current_vector.dirBase, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        # Cuadruplo de la asignacion
        expr = ctx.expr(1).getText()

        if expr in self.diccionarioTemp:
            expr = self.diccionarioTemp[expr]

        if self.currentScope.resolve(expr):
            expr = self.currentScope.resolve(expr).dirBase

        if expr in self.diccionario_cte:
            expr = self.diccionario_cte[expr]

        quadruple = Quadruple("ASSIGN", expr, "~", result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Vectores como expresiones
    def exitVectorIndex(self, ctx:CompiwaveParser.VectorIndexContext):
        vector_index = ctx.expr().getText()
        vector_name = ctx.ID().getText()

        if vector_index in self.diccionarioTemp:
            vector_index = self.diccionarioTemp[vector_index]

        if self.currentScope.resolve(vector_index):
            vector_index = self.currentScope.resolve(vector_index).dirBase

        if vector_index in self.diccionario_cte:
            vector_index = self.diccionario_cte[vector_index]

        current_vector = self.currentScope.resolve(vector_name)

        quadruple = Quadruple("VER", vector_index, current_vector.limInf, current_vector.limSup)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp+1
        quadruple = Quadruple("K", vector_index, current_vector.k, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp+1
        quadruple = Quadruple("DIRBASE", self.contTemp, current_vector.dirBase, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        self.diccionarioTemp[ctx.getText()] = result

        quadruple = Quadruple("ACCESS", "~", "~", "~")
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Cuadruplos de Matrices

    # Asignacion de Matrices
    def exitMatrix_assignment(self, ctx:CompiwaveParser.Matrix_assignmentContext):

        matrix_name = ctx.ID().getText()
        matrix_index1 = ctx.expr(0).getText()
        matrix_index2 = ctx.expr(1).getText()

        if matrix_index1 in self.diccionarioTemp:
            matrix_index1 = self.diccionarioTemp[matrix_index1]

        if matrix_index2 in self.diccionarioTemp:
            matrix_index2 = self.diccionarioTemp[matrix_index2]

        if self.currentScope.resolve(matrix_index1):
            matrix_index1 = self.currentScope.resolve(matrix_index1).dirBase

        if self.currentScope.resolve(matrix_index2):
            matrix_index2 = self.currentScope.resolve(matrix_index2).dirBase

        if matrix_index1 in self.diccionario_cte:
            matrix_index1 = self.diccionario_cte[matrix_index1]

        if matrix_index2 in self.diccionario_cte:
            matrix_index2 = self.diccionario_cte[matrix_index2]

        current_matrix = self.currentScope.resolve(matrix_name)

        # Indice 1
        quadruple = Quadruple("VER", matrix_index1, current_matrix.limInf1, current_matrix.limSup1)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp+1
        quadruple = Quadruple("S1M1", matrix_index1, current_matrix.m1, result) # *
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        #Indice 2
        quadruple = Quadruple("VER", matrix_index2, current_matrix.limInf2, current_matrix.limSup2)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp+1
        quadruple = Quadruple("S1M1M2", self.contTemp, matrix_index2, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp+1
        quadruple = Quadruple("K", self.contTemp, current_matrix.k, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp + 1
        quadruple = Quadruple("DIRBASE", self.contTemp, current_matrix.dirBase, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        # Cuadruplo de la asignacion
        expr = ctx.expr(2).getText()

        if expr in self.diccionarioTemp:
            expr = self.diccionarioTemp[expr]

        if self.currentScope.resolve(expr):
            expr = self.currentScope.resolve(expr).dirBase

        if expr in self.diccionario_cte:
            expr = self.diccionario_cte[expr]

        quadruple = Quadruple("ASSIGN", expr, "~", result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    # Matrices como expresiones

    def exitMatrixIndex(self, ctx:CompiwaveParser.MatrixIndexContext):
        matrix_name = ctx.ID().getText()
        matrix_index1 = ctx.expr(0).getText()
        matrix_index2 = ctx.expr(1).getText()

        if matrix_index1 in self.diccionarioTemp:
            matrix_index1 = self.diccionarioTemp[matrix_index1]

        if matrix_index2 in self.diccionarioTemp:
            matrix_index2 = self.diccionarioTemp[matrix_index2]

        if self.currentScope.resolve(matrix_index1):
            matrix_index1 = self.currentScope.resolve(matrix_index1).dirBase

        if self.currentScope.resolve(matrix_index2):
            matrix_index2 = self.currentScope.resolve(matrix_index2).dirBase

        if matrix_index1 in self.diccionario_cte:
            matrix_index1 = self.diccionario_cte[matrix_index1]

        if matrix_index2 in self.diccionario_cte:
            matrix_index2 = self.diccionario_cte[matrix_index2]

        current_matrix = self.currentScope.resolve(matrix_name)

        # Indice 1
        quadruple = Quadruple("VER", matrix_index1, current_matrix.limInf1, current_matrix.limSup1)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp + 1
        quadruple = Quadruple("S1M1", matrix_index1, current_matrix.m1, result) # *
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        # Indice 2
        quadruple = Quadruple("VER", matrix_index2, current_matrix.limInf2, current_matrix.limSup2)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

        result = self.contTemp + 1
        quadruple = Quadruple("S1M1M2", self.contTemp, matrix_index2, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp + 1
        quadruple = Quadruple("K", self.contTemp, current_matrix.k, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        result = self.contTemp + 1
        quadruple = Quadruple("DIRBASE", self.contTemp, current_matrix.dirBase, result)
        self.listaInstrucciones.append(quadruple)
        self.cont += 1
        self.contTemp = result

        self.diccionarioTemp[ctx.getText()] = result

        quadruple = Quadruple("ACCESS", "~", "~", "~")
        self.listaInstrucciones.append(quadruple)
        self.cont += 1

    ###############
    ##### CTE #####
    ###############

    def enterIntConst(self, ctx:CompiwaveParser.IntConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1

    def enterNegativeIntConst(self, ctx:CompiwaveParser.NegativeIntConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1

    def enterFloatConst(self, ctx:CompiwaveParser.FloatConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1

    def enterNegativeFloatConst(self, ctx:CompiwaveParser.NegativeFloatConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1

    def enterBoolConst(self, ctx:CompiwaveParser.BoolConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1

    def enterStringConst(self, ctx:CompiwaveParser.StringConstContext):
        cte = ctx.getText()

        if cte in self.diccionario_cte:
            pass
        else:
            self.diccionario_cte[cte] = self.cont_cte
            self.cont_cte += 1