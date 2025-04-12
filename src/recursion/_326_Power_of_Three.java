package recursion;

public class _326_Power_of_Three {

//    Correct Solution
    class Solution3 {
        public boolean isPowerOfThree(int n) {
            if (n < 1) return false;
            return helper(n);
        }

        boolean helper(int n) {
            if (n == 1) return true;
            if (n % 3 != 0) return false;

            return helper(n / 3);
        }
    }

    //    Approach 2 - Incorrect
    class Solution2 {
        public boolean isPowerOfThree(int n) {

            return helper(n) == 1;
        }

        float helper(float n) {
            if (n < 3)
                return n;

            return helper(n / 3);
        }
    }

    //    Approach 1 - Incorrect
    class Solution1 {
        public boolean isPowerOfThree(int n) {
            return helper(n, 0) >= 1;
        }

        public int helper(int n, int x) {
            System.out.println(x);
            if (n <= 0)
                return x;
            return helper(n / 3, ++x);
        }
    }
}
