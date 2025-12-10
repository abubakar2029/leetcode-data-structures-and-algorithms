# Solution from online resources
class Solution:
    def intToRoman(self, num: int) -> str:
        symbol_map = {
            1000: "M",
            900: "CM",
            500: "D",
            400: "CD",
            100: "C",
            90: "XC",
            50: "L",
            40: "XL",
            10: "X",
            9: "IX",
            5: "V",
            4: "IV",
            1: "I",
        }

        result = ""
        for value, symbol in symbol_map.items():
            if num == 0:
                break

            count = num // value
            if count > 0:
                result += count * symbol
                num %= value

        return result


# 1st approach
class Solution:
    def intToRoman(self, num: int) -> str:
        symbol_map = {
            10: "X",
            100: "C",
            4: "IV",
            9: "IX",
            40: "XL",
            90: "XC",
            400: "CD",
            900: "CM",
        }
        n = len(str(num))
        m = 10 ** (n - 1)
        result = ""
        while num > 0:
            if num < 10:
                left = num
            else:
                # left = (num // m) * m
                left = num // m

            sub_str = ""
            if left * m in symbol_map:
                sub_str = symbol_map[left * m]
            elif m >= 1000:
                sub_str = "M" * left
            elif m >= 100 and left >= 5:
                sub_str = "D" + "C" * (left - 5)
            elif m >= 100:
                sub_str = "C" * (left)
            elif m >= 10 and left >= 5:
                sub_str = "L" + "I" * (left - 5)
            elif left >= 5:
                sub_str = "V" + "I" * (left - 5)
            else:
                sub_str = "I" * (left)

            result = result + sub_str
            print(sub_str)
            print(result)
            # 3000, 700, 40, 9
            num = num % m
            # 749, 49, 9
            m //= 10
            # 100, 10, 1, 0.1
            # print(num)

        return result
