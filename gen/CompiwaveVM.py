from helpClasess import *
import re

class VirtualMachine:
    def __init__(self, code, function_ref, cte_ref):
        self.code = code
        self.function_ref = function_ref
        self.cte_ref = cte_ref
        self.ip = 0
        self.global_memory = OrderedDict()
        self.function_call = []
        self.fp = 0

    def assign_cte(self, cte):
        cte = list(self.cte_ref.keys())[list(self.cte_ref.values()).index(cte)]
        int_match = re.compile('[0-9]+$')
        float_match = re.compile('[0-9]+\\.[0-9]+')
        boolean_match = re.compile('[True|False]')

        if int_match.match(cte):
            return int(cte)
        elif float_match.match(cte):
            return float(cte)
        elif boolean_match.match(cte):
            return True if cte == 'True' else False
        else:
            return cte

    def cpu(self):
        current_quad = self.code[self.ip]
        while current_quad.operand != "HALT" and self.ip < len(self.code):
            self.ip += 1
            if current_quad.operand == "=":
                value = current_quad.leftOp
                if value >= 50000 and value < 80000:
                    value = self.assign_cte(value)
                elif value in self.global_memory:
                    value = self.global_memory[value]
                key = current_quad.result
                self.global_memory[key] = value

            elif current_quad.operand == "*":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp >= 50000 and leftOp < 80000:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP >= 50000 and rightOP < 80000:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp * rightOP
            elif current_quad.operand == "/":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp >= 50000 and leftOp < 80000:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP >= 50000 and rightOP < 80000:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp / rightOP
            elif current_quad.operand == "+":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp >= 50000 and leftOp < 80000:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP >= 50000 and rightOP < 80000:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp + rightOP
            elif current_quad.operand == "-":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp >= 50000 and leftOp < 80000:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP >= 50000 and rightOP < 80000:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp - rightOP
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
