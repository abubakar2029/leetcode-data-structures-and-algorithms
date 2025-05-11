package _2025_leetcode_contests.may_2025;


// wrong solution
public class _Q2_Minimum_Operations_to_Convert_All_Elements_to_Zero {

    public static void main(String[] args) {
        _Q2_Minimum_Operations_to_Convert_All_Elements_to_Zero outer = new _Q2_Minimum_Operations_to_Convert_All_Elements_to_Zero();
        Solution solution = outer.new Solution();
        solution.minOperations(new int[]{3, 1, 2, 1});
    }

    class Solution {
        public int minOperations(int[] nums) {

            // taking two pointers
            int i = 0;
            int j = nums.length - 1;

            int operations = 0;
            int minimum = nums[j];
            while (i < j) {
                // taking 1st pointer to the minimum positive
                while (nums[i] == 0 || (nums[i] > minimum && i <= j))
                    i++;

                // taking 2nd pointer to the minimum positive
                while (nums[j] == 0 || (nums[j] > minimum && i <= j))
                    j--;

                // got the subarray here
                if (nums[i] != 0) {
                    int pointer = i;
                    operations++;
                    while (pointer <= j) {
                        if (nums[pointer] == nums[i]) {
                            nums[pointer] = 0;
                        }

                        pointer++;
                    }
                }

            }

            return operations;
        }
    }
}
