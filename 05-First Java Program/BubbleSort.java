/*
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 33, 4, -99, 0, -7, 1, 2, 5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr){
        boolean swap;
        // run the steps n-1 times
        for (int i = 1; i < arr.length; i++) {
            swap = false;
            // for each step, max item will come at the last respective index
            for (int j = 0; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
    }
}