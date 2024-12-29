public class _26_Remove_Duplicates_from_Sorted_Array {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0;
            int first = nums[0];

            // Loop to make array unique
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    nums[i] = i;
                    first++;
                } else {
                    first++;
                }
            }

            first = nums[0];

            // Loop to calculate unique elements
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    k++;
                }
            }

            return k;
        }
    }

}
