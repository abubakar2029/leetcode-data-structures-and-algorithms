package binarySearch;

public class _704_Binary_Search {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int center = (left + right) / 2;
                if (nums[center] == target) {
                    return center;
                }
                if (nums[center] > target) {
                    right = center - 1;
                } else {
                    left = center + 1;
                }
            }
            return -1;
        }
    }
}
