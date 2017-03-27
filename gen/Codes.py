from enum import Enum

class CWType(Enum):
    Integer = 0
    Float = 1
    String = 2
    Void = 3
    Error = 4

    @staticmethod
    def getDefault(cwtype):
        if cwtype == CWType.Integer:
            return 0
        elif cwtype == CWType.Float:
            return 0.0
        elif cwtype == CWType.String:
            return ""
        return None

class CWOperator:
    _operators = {
        '+': 0,
        '-': 1,
        '*': 2,
        '/': 3,
        '%': 4,
        '<': 5,
        '>': 6,
        '<=': 7,
        '>=': 8,
        '!=': 9,
        '==': 10,
        '&&': 11,
        '||': 12,
        '=': 13
    }

    @staticmethod
    def getId(op):
        return CWOperator._operators[op]
