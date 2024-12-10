package slidingWindow.algorithm;

// this technique helps us to reduce the time complexity from O(n²) or O(n³) to O(n).
public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};

        //    Fixed Sized Example
        fixedSizeWindow window1 = new fixedSizeWindow(arr, 3);
        System.out.println(window1.maxSum);
    }
}
