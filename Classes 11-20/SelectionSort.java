import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 89, 11, -8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] a, int maxIndex, int end) {
        int temp = a[maxIndex];
        a[maxIndex] = a[end];
        a[end] = temp;
    }

    static void sort(int[] a) {

        for (int i = a.length; i > 0; i--) {
            // taking an element as max at star
            int maxIndex = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[maxIndex])
                    maxIndex = j;
            }
            swap(a, maxIndex, i - 1);
        }

    }
}