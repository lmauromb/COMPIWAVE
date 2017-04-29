import sys

from CompiwaveBaseListener import *
from CompiwaveLexer import *
from CompiwaveVM import *

def main(argv):
    input = FileStream(argv[1])
    lexer = CompiwaveLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CompiwaveParser(stream)
    tree = parser.compiwave()
    quadruplator = CompiwaveBaseListener()
    walker = ParseTreeWalker()
    walker.walk(quadruplator, tree)

    # print("### CUADRUPLOS ###")
    # print("\n".join(str(i) for i in quadruplator.listaInstrucciones))
    # print("### FuNCIONES ###")
    # print(quadruplator.diccionario_funciones)
    # print("### CONSTANTES ###")
    # print(quadruplator.diccionario_cte)

    virtual_machine = VirtualMachine(quadruplator.listaInstrucciones,
                                     quadruplator.diccionario_funciones,
                                     quadruplator.diccionario_cte)

    virtual_machine.cpu()

if __name__ == '__main__':
    main(sys.argv)