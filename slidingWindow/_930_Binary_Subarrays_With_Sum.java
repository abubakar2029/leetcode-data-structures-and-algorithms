package slidingWindow;

import java.util.*;

public class _930_Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        Solution1.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0);
    }


    //    Adjustment in Sliding window - TC O(N)
    class Solution2 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int res = 0;

            return helper(nums, goal) - helper(nums, goal - 1);
        }

        public int helper(int[] nums, int goal) {
            if (goal < 0) {
                return 0;
            }
            int count = 0;

            int left = 0;
            int sum = 0;
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum > goal) {
                    sum -= nums[left];
                    left++;
                }
                count += (right - left + 1);
            }
            return count;
        }
    }

    //    Prefix Sum approach
    class Solution3 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            Map<Integer, Integer> prefixCount = new HashMap<>();
            prefixCount.put(0, 1);  // important: one way to have sum 0 before start

            int sum = 0, count = 0;

            for (int num : nums) {
                sum += num;

                // if sum - goal seen before, we can form a subarray ending here
                count += prefixCount.getOrDefault(sum - goal, 0);

                // store this prefix sum for future
                prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }


    //    naive approach
    static class Solution1 {
        static public int numSubarraysWithSum(int[] nums, int goal) {
            int res = 0;

            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum += nums[j];
                    if (sum == goal) res++;
                    else if (sum > goal) break;
                }
            }

            System.out.println(res);
            return res;
        }
    }
}
