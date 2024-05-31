public class InsertionSort19 {
    public static void main(String[] args) {
        int[] a = {2, -99, 1, 123};
        sort(a);
        System.out.println(java.util.Arrays.toString(a));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}