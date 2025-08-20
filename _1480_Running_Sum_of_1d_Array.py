class Solution(object):
    def runningSum(self, nums):
        # nums[i] except 0 index
        # apna ma previous ko add kr la ga
        # at the end hmm osa return krwa dan gan updated list ko

        for i in range(1,len(nums)): # 0 1 2 3 -> 1 2 3
            nums[i]=nums[i]+nums[i-1]
        #  nums[1] = 2 +1 => 3
        # nums[2] = 3 + 3 => 6
        # nums[3] = 4 + 6 => 10
        return nums