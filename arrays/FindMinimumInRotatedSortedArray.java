package arrays;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int p1 = 0;
        int p2 = nums.length-1;
        int smallest = nums[0];

        while (p1 < p2) {
            int mid = (p2 - p1) / 2;
            if (nums[p1] <= nums[p2]) {
                smallest = Math.min(smallest, nums[p1]);
                p2 = mid - 1;
            } else {
                smallest = Math.min(smallest, nums[p2]);
                p1 = mid + 1;
            }

        }

        return smallest;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();

        int[] nums0 = { 3, 1, 2 };
        System.out.println("Minimum in rotated sorted array: " + finder.findMin(nums0)); // Output: 1

        int[] nums1 = { 3, 4, 5, 1, 2 };
        System.out.println("Minimum in rotated sorted array: " + finder.findMin(nums1)); // Output: 1

        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Minimum in rotated sorted array: " + finder.findMin(nums2)); // Output: 0

        int[] nums3 = { 11, 13, 15, 17 };
        System.out.println("Minimum in rotated sorted array: " + finder.findMin(nums3)); // Output: 11
    }
}