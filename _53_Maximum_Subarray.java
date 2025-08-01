public class _53_Maximum_Subarray {
    public static void main(String[] args) {


//        naive approach
        int[] arr = {-1};
//        int[] arr = {2, -3, 4, 3};
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                System.out.print(currentSum + " ");
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println("==========");
        }
        System.out.println(maxSum);

//        kadane's algorithm
        int sum = 0;
        maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            sum += arr[i];
            maxSum += arr[i];
            if (maxSum < 0) maxSum = 0;
        }
        System.out.println(maxSum);

    }

    //    first attempt
    class Solution1 {
        public int maxSubArray(int[] nums) {
            int maxSum = 0;
            int currentSum = 0;
            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];
                if (currentSum < 0) currentSum = 0;
                maxSum = Math.max(currentSum, maxSum);
            }
            return maxSum;
        }
    }

    //    solved
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (currentSum < 0) {
                    currentSum = 0;
                }
                currentSum += nums[i];
                maxSum = Math.max(currentSum, maxSum);
                // System.out.println(maxSum);
            }
            return maxSum;
        }
    }
}
