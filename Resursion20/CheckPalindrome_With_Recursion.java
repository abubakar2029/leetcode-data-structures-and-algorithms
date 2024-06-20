public class CheckPalindrome_With_Recursion {
    public static void main(String[] args) {
        System.out.println(palindrome(88988));
    }

    static int reverseHelper(int integer) {
        int remainder = integer % 10;
        integer = integer / 10;
        if (integer == 0) return remainder;
        return ((reverseHelper(integer) * 10) + remainder);
    }

    static boolean palindrome(int n) {
        return reverseHelper(n) == n;
    }
}
