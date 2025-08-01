package slidingWindow.algorithm;

//  returning smallest array whose sum is greater than equal to the target
public class dynamicWindow {
    //    a starting variable
    private int left = 0;
    private int minLength = Integer.MAX_VALUE;
    private int sum = 0;

    public dynamicWindow(int[] arr, int target) {

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        minLength = minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    //    getter
    public int getMinLength() {
        return minLength;
    }

}
