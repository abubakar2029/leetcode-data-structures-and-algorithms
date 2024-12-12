package slidingWindow;

public class _643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg = 0;
        double t_avg = 0;
        // first iteration
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // avergae value of first slide
        avg = sum / k;

        // sliding the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            t_avg = sum / k;
            // using my own Max function
            avg = Max(avg, t_avg);
        }
        return avg;
    }

    private double Max(double a, double b) {
        return a > b ? a : b;
    }
}
