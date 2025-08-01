package twoPointers;

import java.util.Arrays;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution.removeElement(nums, 2);
    }

    class Solution {
        static public int removeElement(int[] nums, int val) {
            int x = 0;
            int y = nums.length - 1;
            while (x <= y) {
                if (nums[x] == val) {
                    nums[x] = nums[y];
                    y--;
                } else {
                    x++;
                }
            }
            return x;
        }
    }
}
