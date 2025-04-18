package slidingWindow;

public class _209_Minimum_Size_Subarray_Sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0, sum = 0;
            int minSize = Integer.MAX_VALUE;
            int right = 0;

            while (right < nums.length) {
                sum += nums[right];
                while (sum >= target) {
                    minSize = Math.min(minSize, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }
            return minSize == Integer.MAX_VALUE ? 0 : minSize;
        }
    }
}
