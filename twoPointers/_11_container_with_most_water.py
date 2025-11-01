class Solution:
    def maxArea(self, height: List[int]) -> int:
        # initialize two pointers
        s, e = 0, len(height) - 1

        max_amount = 0

        while s < e:
            if height[s] == height[e] or height[s] < height[e]:
                capacity = height[s] * (e - s)
                s += 1
            else:
                capacity = height[e] * (e - s)
                e -= 1

            max_amount = max(capacity, max_amount)

        return max_amount
