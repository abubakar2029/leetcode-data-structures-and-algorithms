class Solution:

    def combinationSum2(self, candidates, target: int):
        self.my_set = set()
        candidates.sort()
        self.helper(0, target, [], candidates)
        return list(self.my_set)

    def helper(self, index, target, current, arr):
        if target == 0:
            self.my_set.add(tuple(current))
            return

        if target < 0 or index >= len(arr):
            return

        current.append(arr[index])
        self.helper(index + 1, target - arr[index], current, arr)
        current.pop()
        self.helper(index + 1, target, current, arr)

a = Solution()
ab=a.combinationSum2([2,5,2,1,2],5)
print(ab)