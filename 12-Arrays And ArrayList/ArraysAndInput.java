import java.util.Arrays;

public class ArraysAndInput {
    public static void main(String[] args) {

        int[] rnos = new int[5];
        System.out.println(rnos[2]); // by default all values will be 0
        // in String it will be null

        // 1st method
        int[] arr = { 2, 33, 44, 55 };
        for (int num : arr) {
            System.out.print(num + " "); // here num represents element in the array
        }

        // 2nd method
        System.out.println("\ntostring() : " + java.util.Arrays.toString(arr));
    }
}
