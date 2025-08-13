class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        # nums ka list given ha
        # unique elements ka sum return krna ha

        # Algorithm
        # unique_sum = 0
        # nums sa iterate kr lo
        # agar wo element unique ha to osa unique_sum ma add kr lo
        # return the unique sum
        unique_sum = 0

        for num in nums:
            # print(num)
            # print("Count of given element : ",nums.count(num))

            if nums.count(num) == 1: # tb chla ga jb wo element unique ho ga
                unique_sum += num  # unique_sum ki value ma os unique number ko add kr dia


        return unique_sum

