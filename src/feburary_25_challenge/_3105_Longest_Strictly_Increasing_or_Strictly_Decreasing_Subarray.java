package feburary_25_challenge;

import java.util.*;

public class _3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public static void main(String[] args) {
        System.out.println(Solution.longestMonotonicSubarray(new int[]{3, 2, 1}));
    }

    class Solution {
        static public int longestMonotonicSubarray(int[] nums) {
            int n = nums.length;
            int longest = 0;

            // check for strictly increasing
            for (int i = 0; i < n; i++) {
                int j = i;
                while (j < n - 1) {
                    if (!(nums[j] < nums[j + 1])) break;
                    j++;
                }
                longest = Math.max(longest, j - i + 1);
            }

            // check for strictly decreasing
            for (int i = 0; i < n; i++) {
                int j = i;
                while (j < n-1) {
                    if (!(nums[j] > nums[j + 1])) break;
                    j++;
                }
                longest = Math.max(longest, j - i + 1);
            }
            return longest;
        }
    }
}
