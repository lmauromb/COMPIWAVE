import sys
from antlr4 import *
from CompiwaveLexer import *
from CompiwaveParser import *


def main(argv):
    input = FileStream(argv[1])
    lexer = CompiwaveLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CompiwaveParser(stream)
    tree = parser.compiwave()

if __name__ == '__main__':
    main(sys.argv)