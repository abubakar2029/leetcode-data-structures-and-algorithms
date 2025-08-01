import java.util.Arrays;

public class _2171_Removing_Minimum_Number_Magic_Beans {
    public static void main(String[] args) {
        Solution.minimumRemoval(new int[]{4, 1, 6, 5});
    }

    static class Solution {

        //        Brute Force Solution
        static public long minimumRemoval1(int[] beans) {
            int n = beans.length;

            int[] prefixSum = new int[n];
            prefixSum[0] = beans[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + beans[i];
            }
            long netRemoval = Integer.MAX_VALUE;
            // solution
            for (int i = 0; i < n; i++) {
                int currentRemoval = 0;

//                left removal
                int left = 0;
                for (int j = 0; j < i; j++) {
                    if (beans[j] < beans[i]) left += beans[j];
                    else if (beans[j] > beans[i]) left += beans[j] - beans[i];
                }
//                right removal
                int right = 0;
                for (int j = i + 1; j < n; j++) {
                    if (beans[j] < beans[i]) right += beans[j];
                    else if (beans[j] > beans[i]) right += beans[j] - beans[i];
                }
                netRemoval = Math.min(netRemoval, right + left);
            }
            return netRemoval;
        }

        //             Optimized Solution
        public static long minimumRemoval(int[] beans) {
            int n = beans.length;
            Arrays.sort(beans);

            long totalSum = 0;
            for (int b : beans) totalSum += b;

            long minRemoval = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long target = beans[i];
                long currentRemoval = totalSum - target * (n - i);
                minRemoval = Math.min(minRemoval, currentRemoval);
            }

            return minRemoval;
        }
    }
}
