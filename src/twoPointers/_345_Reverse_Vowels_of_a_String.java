package twoPointers;

import java.util.*;

public class _345_Reverse_Vowels_of_a_String {
    public static void main(String[] args) {

    }

    class Solution {
        public String reverseVowels(String s) {
            if (s == null || s.length() == 0) return s;

            Set<Character> vowels = new HashSet<>(
                    Arrays.asList('a', 'e', 'i', 'o', 'u',
                            'A', 'E', 'I', 'O', 'U'));

            char[] chars = s.toCharArray();
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                while (left < right && !vowels.contains(chars[left])) {
                    left++;
                }

                while (left < right && !vowels.contains(chars[right])) {
                    right--;
                }

                // Swap the vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            return new String(chars);
        }
    }
}
