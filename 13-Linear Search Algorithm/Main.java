public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 22, 34, 54, 43, 25, 56, 76, 98 };
        int result = linerSearch(a, 54);

        System.out.println(result);
    }

    static int linerSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        // using a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // not found Oki return it
        return -1;
    }
}
