package slidingWindow;

import java.util.HashMap;

public class _567_Permutation_in_String {
    public static void main(String[] args) {
        Solution1.checkInclusion("ab", "eiboa");
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
