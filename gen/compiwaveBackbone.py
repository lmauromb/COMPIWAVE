import sys

from CompiwaveBaseListener import *
from CompiwaveLexer import *


def main(argv):
    input = FileStream(argv[1])
    lexer = CompiwaveLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CompiwaveParser(stream)
    tree = parser.compiwave()
    printer = CompiwaveBaseListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main(sys.argv)