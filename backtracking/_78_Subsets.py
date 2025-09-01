class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.set = set()
        # self.set.add([])

        self.nums = nums
        self.helper([],0)

        print(self.set)
        return [list(x) for x in self.set]

    def helper(self,current, i):
        if (i>=len(self.nums)):
            self.set.add(tuple(current))
            return

        current.append(self.nums[i])
        self.helper(current,i+1)
        current.pop()
        self.helper(current,i+1)