package prefixSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int n = arr.length;
        int[] prefix = new int[n];

// Build the prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

// Example query: sum from index 1 to 3 (i.e., 1 + 4 + 2 = 7)
        int l = 1, r = 3;
        int rangeSum = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        System.out.println("Sum from index " + l + " to " + r + " is: " + rangeSum);

    }
}
