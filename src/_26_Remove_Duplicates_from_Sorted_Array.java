public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(Solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

//    Time O(n), Space O(1)
    class Solution {
       static public int removeDuplicates(int[] nums) {
            int unique = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[unique]) {
                    unique++;
                    nums[unique] = nums[i];
                }
            }
            return ++unique;
        }
    }


    //    wrong solution
    class Solution1 {
        static public int removeDuplicates(int[] nums) {
            int n = nums.length;
            int j = 1;
            int i = 0;
            for (i = 0; i < n - 1; i++) {
                if (nums[i] == nums[j]) {
                    while (j < n - 1) {
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                        j++;
                    }
                    j = i + 2;
                    continue;
                }
                if (nums[i] > nums[i + 1])
                    return i;
            }
            return i;
        }
    }

    //    wrong solution
    class Solution2 {
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
