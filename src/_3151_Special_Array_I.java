public class _3151_Special_Array_I {
    public static void main(String[] args) {
        System.out.println(Solution.isArraySpecial(new int[]{1, 5}));
    }

    class Solution {
        static public boolean isArraySpecial(int[] nums) {
            int j = 1;
            for (int i = 0; i <= nums.length - 2; i++) {
                if (nums[i] % 2 == 0) {
                    if ((nums[j] % 2 == 0))
                        return false;
                } else {
                    if (!(nums[j] % 2 == 0))
                        return false;
                }
                j++;
            }
            return true;
        }
    }
}
