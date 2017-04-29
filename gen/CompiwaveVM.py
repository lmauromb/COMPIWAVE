from helpClasess import *

class VirtualMachine:
    def __init__(self, code, function_ref, cte_ref):
        self.code = code
        self.function_ref = function_ref
        self.cte_ref = cte_ref
        self.ip = 0
        self.global_memory = OrderedDict()
        self.function_call = []
        self.fp = 0

    def cpu(self):
        current_quad = self.code[self.ip]
        while current_quad.operand != "HALT" and self.ip < len(self.code):
            self.ip += 1
            if current_quad.operand == "=":
                pass
            elif current_quad.operand == "*":
                pass
            elif current_quad.operand == "/":
                pass
            elif current_quad.operand == "+":
                pass
            elif current_quad.operand == "-":
                pass
            elif current_quad.operand == "==":
                pass
            elif current_quad.operand == "!=":
                pass
            elif current_quad.operand == "&&":
                pass
            elif current_quad.operand == "||":
                pass
            elif current_quad.operand == "PRINT":
                pass
            elif current_quad.operand == "GOTO":
                pass
            elif current_quad.operand == "GOTOT":
                pass
            elif current_quad.operand == "GOTOF":
                pass
            elif current_quad.operand == "ERA":
                pass
            elif current_quad.operand == "GOSUB":
                pass
            elif current_quad.operand == "RETURN":
                pass
            elif current_quad.operand == "ENDFUNC":
                pass
            elif current_quad.operand == "VER":
                pass

            current_quad = self.code[self.ip]
