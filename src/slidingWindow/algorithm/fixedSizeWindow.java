package slidingWindow.algorithm;

public class fixedSizeWindow {
    public int maxSum = 0;
    public int currentSum = 0;

    public fixedSizeWindow(int arr[], int K) {
//        initializing the first window
        for (int i = 0; i < K; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;
//        sliding the window across the array
        for (int i = K; i < arr.length; i++) {
            currentSum += -arr[i - K] + arr[i];
//            maxSum = Math.max(maxSum, currentSum);
            maxSum = max(maxSum, currentSum);
        }
    }

    private int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
