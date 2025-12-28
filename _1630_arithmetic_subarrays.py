from typing import List

class Solution:
    def checkArithmeticSubarrays(
        self, nums: List[int], l: List[int], r: List[int]
    ) -> List[bool]:
        # slice the subarray, with the help of query
        # sort the subarray
        # check every two consecutive elements
        # if not put False there and break
        # if the pointer goes beyond the list length put True there

        answer = []
        for i1, i2 in zip(l, r):
            sub_arr = nums[i1 : i2 + 1]
            print(sub_arr)

            sub_arr.sort()
            diff = sub_arr[1] - sub_arr[0]
            ptr = 2
            for i3 in range(2, len(sub_arr) - 1):
                if diff != sub_arr[i3 + 1] - sub_arr[i3]:
                    answer.append(False)
                    break
                ptr += 1
            if ptr == len(sub_arr) - 1 or len(sub_arr) <= 2:
                answer.append(True)

        print(answer)
        return answer

sol = Solution()
sol.checkArithmeticSubarrays([-3,-6,-8,-4,-2,-8,-6,0,0,0,0], [5,4,3,2,4,7,6,1,7], [6,5,6,3,7,10,7,4,10])