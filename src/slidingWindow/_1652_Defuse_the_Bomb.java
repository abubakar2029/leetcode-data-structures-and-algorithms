package slidingWindow;

public class _1652_Defuse_the_Bomb {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] decrypt = new int[n];
            if (k > 0) {
                // initialize the window
                int sum = 0;
                for (int i = 0; i < k; i++) {
                    sum += code[i];
                }

                for (int i = 0; i < n; i++) {
                    sum = sum - code[i] + code[(i + k) % n];
                    decrypt[i] = sum;
                }
            } else if (k == 0) {
                return decrypt;
            } else {
                // initialize the window
                int sum = 0;
                for (int i = n - 1; i >= -k; i--) {
                    sum += code[i];
                }

                // slide the window
                for (int i = n - 1; i >= 0; i--) {
                    decrypt[i] = sum - code[i] + code[i - k];
                }

            }
            return decrypt;
        }
    }
}
