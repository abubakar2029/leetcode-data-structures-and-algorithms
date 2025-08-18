

public class _62_Unique_Paths {
    public static void main(String[] args) {

    }

    //    Submitted - I approach by dynamic programming
    class Solution {
        int rows;
        int cols;
        int dp[][];

        public int uniquePaths(int m, int n) {
            rows = m;
            cols = n;
            dp = new int[m + 1][n + 1];
            return helper(1, 1);
        }

        public int helper(int m, int n) {
            // I return when it is last col or row
            if (m == rows || n == cols)
                return 1;

            if (dp[m][n] != 0)
                return dp[m][n];
            dp[m][n] = helper(m + 1, n) + helper(m, n + 1);

            return dp[m][n];
        }

    }

    //    Correct solution - time limit exceeded
    class Solution1 {
        int rows;
        int cols;

        public int uniquePaths(int m, int n) {
            rows = m;
            cols = n;

            return helper(1, 1);
        }

        public int helper(int m, int n) {
            // I return when it is last col or row
            if (m == rows || n == cols)
                return 1;

            return helper(m + 1, n) + helper(m, n + 1);
        }

    }
}