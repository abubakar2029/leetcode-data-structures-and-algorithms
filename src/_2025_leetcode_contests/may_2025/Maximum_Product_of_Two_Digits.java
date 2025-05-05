package _2025_leetcode_contests.may_2025;

// wrong solution - sliding window approach is not enough

public class Maximum_Product_of_Two_Digits {
    public static void main(String[] args) {
        Maximum_Product_of_Two_Digits parent = new Maximum_Product_of_Two_Digits();
        Solution1 solution1 = parent.new Solution1();
        solution1.maxProduct(437);
    }

    // sliding window
    class Solution1 {
        public int maxProduct(int n) {

            // as constraint is 10 <= n <= 10^9, minProduct can be 1
            int maxProduct = 1;

            // converting number into the string
            String numStr = String.valueOf(n);
            int[] digits = new int[numStr.length()];

            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = numStr.charAt(i) - '0';
            }

            // Initialize the window with the product of first 2 digits
            int currentProduct = digits[0] * digits[1];
            maxProduct = currentProduct;

            for (int i = 2; i < digits.length; i++) {
                currentProduct = maxProduct / digits[i - 2];
                currentProduct = currentProduct * digits[i];
                maxProduct = Math.max(currentProduct, maxProduct);
            }

            return maxProduct;
        }
    }


    //    nested loops also a wrong approach
    class Solution2 {
        public int maxProduct(int n) {
            int currentProduct = 1;
            int maxProduct = 1;

            // converting number into the string
            String numStr = String.valueOf(n);
            int[] digits = new int[numStr.length()];

            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = numStr.charAt(i) - '0';
            }


            // nested for loop to get all the arrays
            for (int i = 0; i < digits.length; i++) {


                for (int j = i + 1; j < digits.length; j++) {

                }
            }

            return maxProduct;
        }
    }
}
