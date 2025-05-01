package twoPointers;

public class _283_Move_Zeroes {

    public static void main(String[] args) {
        Solution2.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    //    an efficient approach found online
    static class Solution2 {
        static public void moveZeroes(int[] nums) {
            int insertPos = 0;

            for (int num : nums) {
                if (num != 0) {
                    nums[insertPos++] = num;
                }
            }

            while (insertPos < nums.length) {
                nums[insertPos++] = 0;
            }
        }
    }


    //    naive approach - my solution
    static class Solution {
        static public void moveZeroes(int[] nums) {
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    int j = i + 1;
                    while (j < n) {
                        if (nums[j] > 0) {
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                        j++;
                    }
                }
            }
        }
    }
}
