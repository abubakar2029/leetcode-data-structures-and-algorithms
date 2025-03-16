package _2025_leetcode_contests.march_2025.contest_441;

import java.util.*;

public class Q1_Maximum_Unique_Subarray_Sum_After_Deletion {
    class Solution {
        public int maxSum(int[] nums) {

            // hashset is used to have only unique elements - it will not store one element
            // twice
            Set<Integer> uniqueNums = new HashSet();
            int maxSum = 0;

            // getting all unique elements
            for (int num : nums) {
                if (num > 0) {
                    uniqueNums.add(num);
                }
            }

            // Edge case - if all are negative
            if (uniqueNums.size() == 0) {
                int smallest = nums[0];
                for (int num : nums) {
                    smallest = Math.max(smallest, num);
                }
                return smallest;
            }
            // calculating sum of unique element sub-array
            for (int num : uniqueNums) {
                maxSum += num;
            }

            return maxSum;

        }
    }
}
