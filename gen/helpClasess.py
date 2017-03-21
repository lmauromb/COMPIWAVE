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


class MethodSymbol(Symbol):
    def __init__(self, name, cwtype, enclosingScope):
        super(MethodSymbol, self).__init__(name, cwtype)
        self.enclosingScope = enclosingScope
        self.orderedArgs = OrderedDict()

    def resolve(self, sym):
        s = self.orderedArgs.get(sym.name)
        if s is not None:
            return s
        # if not here, check any enclosing scope
        if self.enclosingScope is not None:
            return self.enclosingScope.resolve(sym)
        # not found
        return None

    def define(self, sym):
        self.orderedArgs[sym.name] = sym
        sym.scope = self # track the scope for each symbol

    def getScopeName(self):
        return "fun:{}".format(self.name)

    def __str__(self):
        s = 'method {name} : {args}'.format(
            name=self.name,
            args=[value for value in self.orderedArgs.values()]
        )
        return s

    __repr__ = __str__


class BaseScope:
    def __init__(self, enclosingScope=None):
        self.enclosingScope = enclosingScope
        self.symbols = OrderedDict()

    def resolve(self, sym):
        s = self.symbols.get(sym.name)
        if s is not None:
            return s
        # if not here, check any enclosing scope
        if self.enclosingScope is not None:
            return self.enclosingScope.resolve(sym)
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
