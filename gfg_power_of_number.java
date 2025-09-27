public class gfg_power_of_number {
    public static void main(String[] args) {
        gfg_power_of_number parent = new gfg_power_of_number();
        Solution1 sol = parent.new Solution1();
        System.out.println(sol.reverseExponentiation(10));
    }

    //  Approach 1 -  by remainder and division
    class Solution1 {
        public int reverseExponentiation(int n) {
            // code here
            int reverse = 0;
            int copy = n;

            while (copy > 0) {
                int remainder = copy % 10;
                reverse = reverse * 10 + remainder;
                copy = copy / 10;
            }

            return (int) Math.pow(n, reverse);
        }
    }

    //    Approach 2 - by strings
    class Solution2 {
        public int reverseExponentiation(int n) {

            String copy = Integer.toString(n);

            String reverse_str = new StringBuilder(copy).reverse().toString();

            int reverse = Integer.parseInt(reverse_str);

            return (int) Math.pow(n, reverse);
        }
    }

}
