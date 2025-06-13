import java.util.Arrays;

public class _2171_Removing_Minimum_Number_Magic_Beans {
    public static void main(String[] args) {
        Solution.minimumRemoval(new int[] {4,1,6,5});
    }
    static class Solution {
        static public long minimumRemoval(int[] beans) {
            int n = beans.length;

            Arrays.sort(beans);

            // calculating prefix sum
            int[] prefixSum = new int[n];
            prefixSum[0] = beans[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + beans[i];
            }

            long netRemoval = Integer.MAX_VALUE;
            // solution
            for (int i = 0; i < n; i++) {
                // left-removal
                int leftRemoval;
                if (i > 1) {
                    leftRemoval = prefixSum[i - 1];
                } else {
                    leftRemoval = 0;
                }
                // right-removal
                int rightRemoval = 0;
                if (i < n - 1) {
                    for (int j = i + 1; j < n; j++) {
                        if(beans[j] > beans[i])
                        rightRemoval += beans[j] - beans[i];
                        else
                        rightRemoval += beans[j];
                    }
                } else {
                    rightRemoval = 0;
                }
                netRemoval = Math.min(netRemoval, leftRemoval + rightRemoval);
            }
            return netRemoval;
        }
    }
}
