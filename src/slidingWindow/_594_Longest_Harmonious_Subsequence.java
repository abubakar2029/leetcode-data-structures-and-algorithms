package slidingWindow;

import java.util.Arrays;

public class _594_Longest_Harmonious_Subsequence {
    public static void main(String[] args) {
        System.out.println(Solution.findLHS(new int[]{1, 2, 3, 4}));
    }


    static class Solution {
        static public int findLHS(int[] nums) {
            Arrays.sort(nums);
            int result = 0;
            int start = 0;
            int n = nums.length;
            for (int end = 1; end < n; end++) {
                int diff = nums[end] - nums[start];
                if (diff == 1) {
                    result = Math.max(result, end - start + 1);
                } else {
                    start++;
                }
            }
            return result;
        }
    }
}
