package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 2, 2, 2, 3};
        System.out.println(binarySearch(arr, 1, 0, 4));
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
        return binarySearch(arr, target, mid + 1, end);
    }
}
