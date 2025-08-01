public class _441_Arranging_Coins {
    public static void main(String[] args) {
        Solution.arrangeCoins(6);
    }

    static class Solution {
        static public int arrangeCoins(int n) {
            int i = 1; // which row we are on
            while (n >= i) { // checking to see if we have used all our coins
                n = n - i; // adding coins to our row
                i++; // increasing our row
            }
            return i - 1;
        }
    }

    //    Time limit exceeded - Naive approach
    class Solution1 {
        public int arrangeCoins(int n) {
            int elements = n;
            for (int rows = 1; rows <= n; rows++) {
                elements -= rows;
                System.out.println(elements);
                if (elements == 0) {
                    return rows;
                } else if (elements < 0) {
                    return rows - 1;
                }
            }
            return -1;
        }
    }
}
