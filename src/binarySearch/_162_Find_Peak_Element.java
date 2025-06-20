package binarySearch;

public class _162_Find_Peak_Element {
    public static void main(String[] args) {
        _162_Find_Peak_Element parent = new _162_Find_Peak_Element();
        Solution solution = parent.new Solution();
        solution.findPeakElement(new int[]{-2147483648, -2147483647});
    }

    class Solution {
        public int findPeakElement(int[] nums) {
            if (nums.length == 1)
                return 0;
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                int leftNeighbour = mid - 1 >= 0 ? nums[mid - 1] : Integer.MIN_VALUE;
                int rightNeighbour = mid + 1 <= nums.length - 1 ? nums[mid + 1] : Integer.MIN_VALUE;

                if (nums[mid] > leftNeighbour && nums[mid] > rightNeighbour)
                    return mid;

                else if (nums[mid+1] >= nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            return -1;
        }
    }
}
