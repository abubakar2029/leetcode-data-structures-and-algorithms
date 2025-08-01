package binarySearch;

public class _852_Peak_Index {
    public static void main(String[] args) {
        _852_Peak_Index parent = new _852_Peak_Index();
        Solution solution = parent.new Solution();
        solution.peakIndexInMountainArray(new int[]{3, 5, 3, 2, 0});
    }

    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int left = 0;
            int right = arr.length - 1;


            while (left <= right) {
                int mid = left + (right - left) / 2;

                int leftIndex = mid - 1 >= 0 ? arr[mid - 1] : Integer.MIN_VALUE;
                int rightIndex = mid + 1 <= arr.length - 1 ? arr[mid + 1] : Integer.MIN_VALUE;
                if (arr[mid] > leftIndex && arr[mid] > rightIndex)
                    return mid;
                else if (arr[mid + 1] > arr[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            return -1;
        }
    }
}
