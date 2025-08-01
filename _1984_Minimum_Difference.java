import java.util.*;

public class _1984_Minimum_Difference {
    public static void main(String[] args) {
        _1984_Minimum_Difference parent = new _1984_Minimum_Difference();
        Solution1 solution1 = parent.new Solution1();
        solution1.minimumDifference(new int[]{9, 4, 1, 7}, 2);
    }

    //    optimized solution
    class Solution {
        public int minimumDifference(int[] nums, int k) {
            if (nums.length == 1)
                return 0;

            Arrays.sort(nums);

            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i <= nums.length - k; i++) {
                minValue = Math.min(minValue, nums[i + k - 1] - nums[i]);
                System.out.println(minValue);

            }

            return minValue;
        }
    }

    //    naive approach
    class Solution1 {
        public int minimumDifference(int[] nums, int k) {
            if (nums.length == 1)
                return 0;

            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length - k; i++) {

                for (int j = i + 1; j < i + k; j++) {
                    int diff = Math.abs(nums[j] - nums[i]);
                    if (diff < minValue)
                        minValue = diff;
                }
            }

            return minValue;
        }
    }
}
