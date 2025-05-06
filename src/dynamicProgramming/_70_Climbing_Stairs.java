package dynamicProgramming;

public class _70_Climbing_Stairs {
    public static void main(String[] args) {

    }

    // bottom-up approach tabulation
    class Solution {
        public int climbStairs(int n) {
            // edge cases
            if (n == 0 || n == 1) return n;
            int[] table = new int[n + 1];

            table[1] = 1;
            table[2] = 2;
            // making the table
            for (int i = 3; i <= n; i++) {
                table[i] = table[i - 1] + table[i - 2];
            }
            return table[n];
        }
    }
}
