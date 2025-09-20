# from typing import String
class Solution:
    def removeDuplicates(self, st: str, k: int) -> str:
        stack = []

        for ch in st:
            if stack and stack[-1][0]==ch:
                stack[-1][1]+=1
                stack.pop() if stack[-1][1]==k else None
            else:
                stack.append([ch,1])


        return ''.join([ch*c for ch,c in stack])

print(Solution().removeDuplicates("deeedbbcccbdaa", 3))