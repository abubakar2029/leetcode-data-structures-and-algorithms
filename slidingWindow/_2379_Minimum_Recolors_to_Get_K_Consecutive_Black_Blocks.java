package slidingWindow;

public class _2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static void main(String[] args) {
        // Test cases
        // String blocks = "WBWBBBW";
        // String blocks = "WBBWWBBWBW";
        String blocks = "BWBBWWBBBWBWWWBWWBBWBWBBWBB";
        System.out.println(Solution.minimumRecolors(blocks, 11));
    }

    class Solution {
        public static int minimumRecolors(String blocks, int k) {
            int operations = 0;

            // iterating the first window
            for (int i = 0; i < k; i++) {
                if (blocks.charAt(i) == 'W') {
                    operations++;
                }
            }

            int minOperations = operations; // Initialize the minimum operations

            // Sliding the window
            for (int i = k; i < blocks.length(); i++) {
                if (blocks.charAt(i) == 'W') {
                    operations++;
                }
                if (blocks.charAt(i - k) == 'W') {
                    operations--;
                }
                minOperations = Math.min(minOperations, operations);
            }

            return minOperations;
        }
    }
}
