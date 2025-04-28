package twoPointers;

public class _125_Valid_Palindrome {
    public static void main(String[] args) {
        Solution.isPalindrome("race a car");
    }

    static class Solution {
        static public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length()-1;

            while (left < right) {
                Character leftCharacter = s.charAt(left);
                Character rightCharacter = s.charAt(right);

                if (!Character.isLetterOrDigit(leftCharacter)) {
                    left++;
                    continue;
                } else if (!Character.isLetterOrDigit(rightCharacter)) {
                    right--;
                    continue;
                } else if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }
}
