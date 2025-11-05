class Solution:
    def myPow(self, x: float, n: int) -> float:
        result = 1
        N = abs(n)

        while N:
            if N % 2:
                result *= x
            x *= x
            N //= 2

        if n > 0:
            return result
        else:
            return 1 / result
