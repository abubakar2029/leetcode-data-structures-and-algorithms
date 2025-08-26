package arrays;

public class _1920_Build_Array_from_Permutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] res = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                res[i] = nums[nums[i]];
            }

            return res;
        }
    }
}
