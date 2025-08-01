package prefixSum;

public class _528_Random_Pick_with_Weight {
    class Solution {

        int[] prefix;

        public Solution(int[] w) {
            prefix = new int[w.length];
            // calculate range - prefix sum
            prefix[0] = w[0];
            for (int i = 1; i < w.length; i++) {
                prefix[i] = prefix[i - 1] + w[i];
            }

        }

        public int pickIndex() {
            int random = (int) (Math.random() * prefix[prefix.length - 1]) + 1;

            int left = 0, right = prefix.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (random > prefix[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }

    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
}
