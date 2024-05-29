//package BinarySearch14.Main;

public class BinarySearch14 {
    public static void main(String[] args) {

        int[] sortedArr={-80,-19,0,2,33,55,66,88,98};

       int result= search(sortedArr,888);
        System.out.println("Result answer : "+result);
    }

    // return -1 if it is not found
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // a recursive loop
        while (start <= end) {
            int midIndex = start + (end - start) / 2;
            if (target > arr[midIndex])
                start = midIndex + 1;
            else if (target < arr[midIndex])
                end = midIndex - 1;
            else
                return midIndex;
        }
        return -1;
    }
}
