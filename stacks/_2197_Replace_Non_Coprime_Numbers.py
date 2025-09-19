from typing import List
from math import gcd

# My approach
class Solution:
    def replaceNonCoprimes(self, nums: List[int]) -> List[int]:
        i = 0
        while i < len(nums) - 1:
            g = gcd(nums[i], nums[i+1])
            if g > 1:
                nums[i] = (nums[i] * nums[i+1]) // g
                nums.pop(i+1)   
                if i > 0:       
                    i -= 1
            else:
                i += 1
        return nums

# Optimize Solution
class Solution:
    def replaceNonCoprimes(self, nums: List[int]) -> List[int]:

        stack = []

        for i in range(len(nums)):

            b = nums[i]
            while stack:
                a = stack[-1]
                gcd_val = gcd(a, b)

                if gcd_val > 1:
                    stack.pop()
                    b = (a * b) // gcd_val
                else:
                    break

            stack.append(b)

        return stack

print(Solution().replaceNonCoprimes([287,41,49,287,899,23,23,20677,5,825]))