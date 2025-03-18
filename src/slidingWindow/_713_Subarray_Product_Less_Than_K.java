package slidingWindow;

public class _713_Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        System.out.println(Solution1.numSubarrayProductLessThanK(new int[]{10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3}, 19));
    }


//    Time Limit Exceeded
    static class Solution1 {
        public static int numSubarrayProductLessThanK(int[] nums, int k) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                int product = 1;
                for (int j = i; j < nums.length; j++) {
                    product = nums[j] * product;
                    if (product >= k) {
                        break;
                    }
                    System.out.println(product);
                    count++;
                }
            }
            return count;
        }
    }
}
