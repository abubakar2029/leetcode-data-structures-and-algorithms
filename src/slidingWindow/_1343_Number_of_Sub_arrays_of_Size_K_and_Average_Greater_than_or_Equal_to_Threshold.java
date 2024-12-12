package slidingWindow;

public class _1343_Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, avg = 0, count = 0;

        // first iteration
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        // avergae value of first slide
        avg = sum / k;
        count += check(avg, threshold);

        // sliding the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            avg = sum / k;
            count += check(avg, threshold);

        }
        return count;
    }

    // function to compare average to the threshold
    private int check(int a, int b) {
        return (a >= b) ? 1 : 0;
    }
}
