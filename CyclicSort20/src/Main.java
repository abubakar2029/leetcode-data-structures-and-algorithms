import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 3, 4, 1};
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[i] - 1;
            if (arr[correctIndex] != arr[i]) {
                swap(arr, correctIndex, i);
                i = 0;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}