package slidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class _567_Permutation_in_String {
    public static void main(String[] args) {
        Solution2.checkInclusion("ab", "eibao");
    }


    //    correct solution
    static class Solution2 {
        static public boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length())return false;

            int[] s1Freq = new int[26];
            int[] s2Freq = new int[26];

            // storing frequencies of s1
            for (Character ch : s1.toCharArray()) {
                s1Freq[ch - 'a'] += 1;
            }

            // initializing the first window
            for (int i = 0; i < s1.length(); i++) {
                s2Freq[s2.charAt(i) - 'a'] += 1;
            }

            // checking the first window
            if (Arrays.equals(s1Freq, s2Freq))
                return true;

            // sliding the window
            for (int i = s1.length(); i < s2.length(); i++) {
                s2Freq[s2.charAt(i) - 'a'] += 1;
                s2Freq[s2.charAt(i - s1.length()) - 'a'] -= 1;

                if (Arrays.equals(s1Freq, s2Freq))
                    return true;

            }

            return false;
        }
    }


    //    incorrect solution
    static class Solution1 {
        static public boolean checkInclusion(String s1, String s2) {

            HashMap<Character, Integer> table = new HashMap<>();
//            storing frequencies of s1
            for (Character ch : s1.toCharArray()) {
                table.put(ch, table.getOrDefault(ch, 0) + 1);
            }

            int str = 0;
            for (int i = 0; i < s2.length(); i++) {
                str = 0;
                if (table.containsKey(s2.charAt(i))) {

                    for (int j = i; j < s2.length(); j++) {
                        if (table.containsKey(s2.charAt(j))) {
                            str++;
                        } else break;
                        if (str == s1.length()) return true;
                    }
                }
            }
            return false;
        }
    }
}
