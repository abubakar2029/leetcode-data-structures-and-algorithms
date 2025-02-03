public class _189_Rotate_Array {
    //    Time limit exceeded
    class Solution2 {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                int temp = nums[n - 1];
                for (int j = n - 1; j >= 1; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
        }
    }
}
