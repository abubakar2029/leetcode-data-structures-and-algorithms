package slidingWindow.algorithm;

// this technique helps us to reduce the time complexity from O(n²) or O(n³) to O(n).
public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 90};

        //    Fixed Sized Example
        fixedSizeWindow window1 = new fixedSizeWindow(arr, 3);
        System.out.println(window1.maxSum);

//        Dynamic sized window example
        dynamicWindow window2 = new dynamicWindow(arr, 15);
        System.out.println(window2.getMinLength());
    }
}
