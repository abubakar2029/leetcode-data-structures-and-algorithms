class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n == 1:
            return True

        while n > 2:
            n /= 2

        return True if n == 2 else False


# Another Approach
class Solution(object):
    def isPowerOfTwo(self, n):
        if n < 1:
            return False

        s = bin(n)
        s = s[2:]
        c = s.count("1")

        return True if c == 1 else False
