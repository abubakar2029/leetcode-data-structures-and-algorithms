class Solution:
    def addBinary(self, a: str, b: str) -> str:
        carry = 0
        result = ""

        i = 1
        while i <= len(a) and i <= len(b):
            s = int(a[-i]) + int(b[-i]) + carry
            if s > 1:
                result = str(s % 2) + result
                carry = s // 2
            else:
                result = str(s) + result
                carry = 0
            i += 1

        while i <= len(a):
            s = int(a[-i]) + carry
            if s > 1:
                result = str(s % 2) + result
                carry = s // 2
            else:
                result = str(s) + result
                carry = 0
            i += 1

        while i <= len(b):
            s = int(b[-i]) + carry
            if s > 1:
                result = str(s % 2) + result
                carry = s // 2
            else:
                result = str(s) + result
                carry = 0
            i += 1

        return str(carry) + result if carry else result
