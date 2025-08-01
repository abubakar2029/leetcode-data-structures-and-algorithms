import java.util.*;

public class _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves {
    public static void main(String[] args) {
        _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves parent = new _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves();
        Solution solution = parent.new Solution();
        solution.minDifference(new int[]{5, 3, 4, 2});
    }

    class Solution {
        public int minDifference(int[] nums) {
            int n = nums.length;
            if (n <= 3)
                return 0;

            Arrays.sort(nums);

            int option1 = nums[n - 4] - nums[0]; // remove max 3
            int option2 = nums[n - 1] - nums[3];  // remove smallest 3
            int option3 = nums[n - 3] - nums[1]; // remove 2 max and 1 small
            int option4 = nums[n - 2] - nums[2]; // remove 1 max and 2 small

            System.out.println(option1 + " _ " + option2 + " _ " + option3 + " _ " + option4);
            return Math.min(Math.min(option1, option2), Math.min(option3, option4));
        }
    }
}
