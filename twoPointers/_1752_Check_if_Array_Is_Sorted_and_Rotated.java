package twoPointers;

public class _1752_Check_if_Array_Is_Sorted_and_Rotated {
    class Solution {
        public boolean check(int[] nums) {
            int count = 0; // Count the number of decreases
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
                if (count > 1) {
                    return false; // More than one decrease means it's not a rotated sorted array
                }
            }

            return true;
        }
    }

}
