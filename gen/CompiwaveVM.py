from helpClasess import *
import re

class VirtualMachine:
    def __init__(self, code, function_ref, cte_ref):
        self.code = code
        self.function_ref = function_ref
        self.cte_ref = cte_ref
        self.ip = 0
        self.returns = []
        self.global_memory = OrderedDict()
        self.function_call = []
        self.fp = 0
        self.range_cte = range(50000, 80000)
        self.range_param = range(90000, 95000)
        self.range_global = range(5000, 25000)
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
        float_match = re.compile('[0-9]*\\.[0-9]+')
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
                key = current_quad.result

                if value in self.range_cte:
                    value = self.assign_cte(value)
                elif value in self.global_memory:
                    value = self.global_memory[value]
                # elif value in self.function_ref: # Checar si es una funcion
                #     value = self.returns.pop()
                else:
                    raise Exception("Variable is not initialized")

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

            elif current_quad.operand == ">":
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
                self.global_memory[key] = leftOp > rightOP

            elif current_quad.operand == "<":
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
                self.global_memory[key] = leftOp < rightOP

            elif current_quad.operand == "PRINT":
                result = current_quad.result
                if result in self.range_cte:
                    result = self.assign_cte(result)
                elif result in self.global_memory:
                    result = self.global_memory[result]
                print(result)

            elif current_quad.operand == "GOTO":
                result = current_quad.result
                self.ip = result - 1

            elif current_quad.operand == "GOTOT":
                leftOp = current_quad.leftOp
                result = current_quad.result
                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if leftOp:
                    self.ip = result - 1

            elif current_quad.operand == "GOTOF":
                leftOp = current_quad.leftOp
                result = current_quad.result
                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]
                if not leftOp:
                    self.ip = result - 1

            elif current_quad.operand == "ERA":
                pass

            elif current_quad.operand == "PARAM":
                pass

            elif current_quad.operand == "GOSUB":
                pass

            elif current_quad.operand == "RETURN":
                pass

            elif current_quad.operand == "ENDFUNC":
                pass

            elif current_quad.operand == "VER":
                lim_inf = current_quad.rightOp
                lim_sup = current_quad.result + 1
                limit_range = range(lim_inf, lim_sup)
                expr = current_quad.leftOp
                if expr in self.range_cte:
                    expr = self.assign_cte(expr)
                elif expr in self.global_memory:
                    expr = self.global_memory[expr]

                if expr not in limit_range:
                    raise Exception("Index out of bounds")

            elif current_quad.operand == "K":
                leftOp = current_quad.leftOp
                rightOP = int(current_quad.rightOp)

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]

                key = current_quad.result
                self.global_memory[key] = leftOp + rightOP

            elif current_quad.operand == "DIRBASE":
                leftOp = current_quad.leftOp
                rightOP = int(current_quad.rightOp)

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]

                key = current_quad.result
                self.global_memory[key] = leftOp + rightOP

            elif current_quad.operand == "ASSIGN":
                value = current_quad.leftOp
                key = current_quad.result

                if key in self.global_memory:
                    key = self.global_memory[key]

                if value in self.range_cte:
                    value = self.assign_cte(value)
                elif value in self.global_memory:
                    value = self.global_memory[value]
                else:
                    raise Exception("Variable is not initialized")

                if key in self.range_global_int or key in self.range_local_int:
                    value = int(value)
                elif key in self.range_global_float or key in self.range_local_float:
                    value = float(value)
                elif key in self.range_global_string or key in self.range_local_string:
                    value = str(value)
                elif key in self.range_global_boolean or key in self.range_local_boolean:
                    value = bool(value)

                self.global_memory[key] = value

            elif current_quad.operand == "ACCESS":
                previous_quad = self.code[self.ip-2]
                key = self.global_memory[previous_quad.result]
                value = self.global_memory[key]
                self.global_memory[previous_quad.result] = value

            elif current_quad.operand == "S1M1":
                leftOp = current_quad.leftOp
                rightOP = int(current_quad.rightOp)

                if leftOp in self.range_cte:
                    leftOp = self.assign_cte(leftOp)
                elif leftOp in self.global_memory:
                    leftOp = self.global_memory[leftOp]

                key = current_quad.result
                self.global_memory[key] = leftOp * rightOP

            elif current_quad.operand == "S1M1M2":
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

            current_quad = self.code[self.ip]
