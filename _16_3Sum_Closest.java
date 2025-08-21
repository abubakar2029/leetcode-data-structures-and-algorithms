import java.util.Arrays;

public class _16_3Sum_Closest {
    public static void main(String[] args) {
        Solution.threeSumClosest(new int[]{-4, 2, 2, 3, 3, 3}, 1);
    }

    static class Solution {
        static public int threeSumClosest(int[] nums, int target) {

            int closest = Integer.MAX_VALUE;
            Arrays.sort(nums);

            // I execute this loop till the last 3rd digit
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {

                    int currentSum = nums[i] + nums[left] + nums[right];
                    // closest = Math.min(closest, currentSum);
                    closest = (Math.abs(closest - target) <= Math.abs(currentSum - target)) ? closest : currentSum;

                    if (currentSum > target)
                        right--;
                    else if (currentSum < target)
                        left++;
                    else
                        return currentSum;

                }
            }

            return closest;
        }
    }
}
