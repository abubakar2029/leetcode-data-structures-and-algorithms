public class CheckPalindrome_With_Recursion {
    public static void main(String[] args) {
        System.out.println(palindrome(070));
    }

    static int reverseHelper(int integer, int reversed) {
        if (integer == 0) return reversed;
        int remainder = integer % 10;
        reversed = reversed * 10 + remainder;
        return reverseHelper(integer / 10, reversed);
    }

    static boolean palindrome(int n) {
        return reverseHelper(n, 0)==n;
    }
}
