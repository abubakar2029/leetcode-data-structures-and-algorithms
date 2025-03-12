public class _53_Maximum_Subarray {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum =0;
            int currentSum =0;
            for(int i=0; i<nums.length;i++){
                currentSum+=nums[i];
                if(currentSum<0)currentSum=0;
                maxSum=Math.max(currentSum,maxSum);
            }
            return maxSum;
        }
    }
}
