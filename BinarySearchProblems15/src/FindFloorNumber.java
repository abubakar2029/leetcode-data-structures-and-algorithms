public class FindFloorNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 7, 88, 99};
        int result = searchElement(arr, 2002);
        System.out.println(result);
    }

    static int searchElement(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
//        int midIndex = 0;

        // a recursive loop
        while (start <= end) {
            int midIndex = start + (end - start) / 2;
            if (target > arr[midIndex])
                start = midIndex + 1;
            else if (target < arr[midIndex])
                end = midIndex - 1;
            else
                return target;
        }
        return arr[arr.length - 1];
//        return -1;
    }
}
