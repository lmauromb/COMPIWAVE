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
        self.range_cte = range(50000, 80000)
        self.range_global_int = range(5000, 10000)
        self.range_global_float = range(10000, 15000)
        self.range_global_string = range(15000, 20000)
        self.range_global_boolean = range(20000, 25000)
        self.range_local_int = range(25000, 30000)
        self.range_local_float = range(30000, 35000)
        self.range_local_string = range(35000, 40000)
        self.range_local_boolean = range(40000, 45000)

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
            return cte.replace("\"","")

    def cpu(self):
        current_quad = self.code[self.ip]
        while current_quad.operand != "HALT" and self.ip < len(self.code):
            self.ip += 1
            if current_quad.operand == "=":
                value = current_quad.leftOp
                if value in self.range_cte:
                    value = self.assign_cte(value)
                elif value in self.global_memory:
                    value = self.global_memory[value]
                else:
                    raise Exception("Variable is not initialized")

                key = current_quad.result

                if key in self.range_global_int or key in self.range_local_int:
                    value = int(value)
                elif key in self.range_global_float or key in self.range_local_float:
                    value = float(value)
                elif key in self.range_global_string or key in self.range_local_string:
                    value = str(value)
                elif key in self.range_global_boolean or key in self.range_local_boolean:
                    value = bool(value)

                self.global_memory[key] = value

            elif current_quad.operand == "*":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp * rightOP
            elif current_quad.operand == "/":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp / rightOP
            elif current_quad.operand == "+":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp + rightOP
            elif current_quad.operand == "-":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp - rightOP
            elif current_quad.operand == "==":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp == rightOP

            elif current_quad.operand == "!=":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp != rightOP

            elif current_quad.operand == "&&":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp and rightOP

            elif current_quad.operand == "||":
                leftOp = current_quad.leftOp
                rightOP = current_quad.rightOp

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if rightOP in self.range_cte:
                    rightOP = self.assign_cte(rightOP)
                elif rightOP in self.global_memory:
                    rightOP = self.global_memory[rightOP]

                key = current_quad.result
                self.global_memory[key] = leftOp or rightOP

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
