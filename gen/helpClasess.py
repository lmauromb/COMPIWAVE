from collections import OrderedDict

class Symbol:
    def __init__(self, name, cwtype=None):
        self.name = name
        self.cwtype = cwtype
        self.scope = None


class BuiltInTypeSymbol(Symbol):
    def __init__(self, name):
        super(BuiltInTypeSymbol, self).__init__(name)

    def __str__(self):
        return self.name

    __repr__ = __str__


class VariableSymbol(Symbol):
    def __init__(self, name, cwtype):
        super(VariableSymbol, self).__init__(name, cwtype)

    def __str__(self):
        return '<{name}:{cwtype}>'.format(name=self.name, cwtype=self.cwtype)

    __repr__ = __str__

class ListSymbol(Symbol):
    def __init__(self, name, cwtype):
        super(ListSymbol, self).__init__(name, cwtype)
        self.m0 = 0
        self.m1 = 0
        self.limInf = 1
        self._limSup = 1
        self.sum = 0
        self.k = 0

    @property
    def limSup(self):
        return self._limSup

    @limSup.setter
    def limSup(self, limSup):
        self._limSup = limSup
        self.m0 = 1 * (self._limSup - self.limInf + 1)
        self.m1 = int(self.m0 / (self._limSup - self.limInf + 1))
        self.sum = self.m1 * self.limInf
        self.k = -self.sum

    def __str__(self):
        return '<{name}:{cwtype}>'.format(name=self.name, cwtype=self.cwtype)

    __repr__ = __str__

class VectorSymbol(Symbol):
    def __init__(self, name, cwtype):
        super(VectorSymbol, self).__init__(name, cwtype)
        self.m0 = 0
        self.m1 = 0
        self.limInf = 0
        self._limSup = 0
        self.sum = 0
        self.k = 0
        self.dirBase = 5000

    @property
    def limSup(self):
        return self._limSup

    @limSup.setter
    def limSup(self, limSup):
        self._limSup = limSup-1
        self.m0 = 1 * (self._limSup - self.limInf + 1)
        self.m1 = int(self.m0 / (self._limSup - self.limInf + 1))
        self.sum = self.m1 * self.limInf
        self.k = -self.sum

    def __str__(self):
        return '<{name}:{cwtype}>'.format(name=self.name, cwtype=self.cwtype)

    __repr__ = __str__

class MethodSymbol(Symbol):
    def __init__(self, name, cwtype, enclosingScope):
        super(MethodSymbol, self).__init__(name, cwtype)
        self.enclosingScope = enclosingScope
        self.orderedArgs = OrderedDict()
        self.enclosedScope = None

    def resolve(self, name):
        s = self.orderedArgs.get(name)
        if s is not None:
            return s
        # if not here, check any enclosing scope
        if self.enclosingScope is not None:
            return self.enclosingScope.resolve(name)
        # not found
        return None

    def define(self, sym):
        self.orderedArgs[sym.name] = sym
        sym.scope = self # track the scope for each symbol

    def getScopeName(self):
        return "{}".format(self.name)

    def __str__(self):
        s = '<<fun {name}:{cwtype} = {args}>>'.format(
            name=self.name,
            cwtype=self.cwtype,
            args=[value for value in self.orderedArgs.values()]
        )
        return s

    __repr__ = __str__


class BaseScope:
    def __init__(self, enclosingScope=None):
        self.enclosingScope = enclosingScope
        self.symbols = OrderedDict()

    def resolve(self, name):
        s = self.symbols.get(name)
        if s is not None:
            return s
        # if not here, check any enclosing scope
        if self.enclosingScope is not None:
            return self.enclosingScope.resolve(name)
        #not found
        return None

    def define(self, sym):
        self.symbols[sym.name] = sym
        sym.scope = self # track the scope for each symbol

    def __str__(self):
        s = 'Symbols: {sym}'.format(
            sym=[value for value in self.symbols.values()]
        )
        return s

    __repr__ = __str__


class GlobalScope(BaseScope):
    def __init__(self):
        super(GlobalScope, self).__init__()

    def getScopeName(self):
        return "global"


class LocalScope(BaseScope):
    def __init__(self, parentScope):
        super(LocalScope, self).__init__(parentScope)

    def getScopeName(self):
        return "local"


class SymbolTable():
    def __init__(self):
        self.globals = GlobalScope()
        self.globals.define(BuiltInTypeSymbol("int"))
        self.globals.define(BuiltInTypeSymbol("float"))
        self.globals.define(BuiltInTypeSymbol("boolean"))
        self.globals.define(BuiltInTypeSymbol("string"))

    def __str__(self):
        return self.globals.__str__()

    __repr__ = __str__


class Quadruple():
    def __init__(self, operand, leftOp, rightOp, result):
        self.operand = operand
        self.leftOp = leftOp
        self.rightOp = rightOp
        self. result = result

    def __str__(self):
        return "{} {} {} {}".format(
            self.operand, self.leftOp,
            self.rightOp, self.result)
