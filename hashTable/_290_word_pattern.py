class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(pattern) != len(s):
            return False
        mp = {}
        for w1, e1 in zip(s, pattern):
            if e1 in mp:
                if mp[e1] != w1:
                    return False
            else:
                if w1 in mp.values():
                    return False
                mp[e1] = w1
        return True
