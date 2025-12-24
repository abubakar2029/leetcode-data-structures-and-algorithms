# First Approach Wrong
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # convert both into freq. dict
        # iterate and match over both

        if len(s) != len(t):
            return False

        s_counter = Counter(s)
        t_counter = Counter(t)

        for i in range(len(s)):
            if s_counter.get(s[i]) != t_counter.get(t[i]):
                return False

        return True

# Second Solution Correct