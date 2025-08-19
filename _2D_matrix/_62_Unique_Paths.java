

public class _62_Unique_Paths {
    public static void main(String[] args) {

    }

    //    DP - I approach by summing up and left value
    class Solution3 {
        int[][] dp;
        int rows;
        int cols;

        public int uniquePaths(int m, int n) {
            rows = m;
            cols = n;
            dp = new int[m + 1][n + 1];

            dp[0][0] = 1;
            // I return last index that is requirement
            return helper(m - 1, n - 1);
        }

        public int helper(int m, int n) {
            if (m == rows || n == cols || m < 0 || n < 0)
                return 0;

            if (dp[m][n] == 0) {
                int val = helper(m - 1, n) + helper(m, n - 1);
                //  val = upper_row    +  left_col
                dp[m][n] = val;
                return val;
            }

            return dp[m][n];
        }
    }

    //    DP - I approach by going right and down
    class Solution2 {
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