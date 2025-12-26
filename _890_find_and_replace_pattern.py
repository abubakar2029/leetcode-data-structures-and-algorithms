
from typing import List
class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        answer = []
        for word in words:
            mp = {}
            i = 0
            for e1, e2 in zip(word, pattern):
                if e1 in mp:
                    if mp[e1] != e2:
                        break
                else:
                    if e2 in mp.values():
                        break
                    mp[e1] = e2
                i += 1
            if i == len(pattern) - 1:
                answer.append(word)
        print(answer)
        return answer

sol = Solution()
sol.findAndReplacePattern(["abc","deq","mee","aqq","dkd","ccc"], "abb")