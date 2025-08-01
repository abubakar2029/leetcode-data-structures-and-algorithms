package dynamicProgramming;

public class _509_Fibonacci_Number {
    public static void main(String[] args) {
        _509_Fibonacci_Number outer = new _509_Fibonacci_Number();
        Solution1 solution1 = outer.new Solution1();
        solution1.fib(3);
    }

    // bottom-up approach tabulation
    class Solution1 {
        public int fib(int n) {
            // edge cases
            if (n == 0 || n == 1) return n;

            int[] table = new int[n + 1];

            table[0] = 0;
            table[1] = 1;
            // making the table
            for (int i = 2; i <= n; i++) {
                table[i] = table[i - 1] + table[i - 2];
            }
            return table[n];
        }
    }
}
