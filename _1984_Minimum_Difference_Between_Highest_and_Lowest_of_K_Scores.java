public class _1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores {

    class Solution1 {
        public int minimumDifference(int[] nums, int k) {
            if (nums.length == 1)
                return 0;

            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {
                    int diff = Math.abs(nums[j] - nums[i]);
                    if (diff < minValue)
                        minValue = diff;
                }
            }

            return minValue;
        }
    }
}
