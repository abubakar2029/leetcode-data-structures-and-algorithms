package _2025_leetcode_contests.may_2025;

import java.util.*;

//  Accepted 812 test cases passed
public class _Q1_Find_Most_Frequent_Vowel_and_Consonant {

    class Solution {
        public int maxFreqSum(String s) {
            int f1 = 0; // frequency of vowels
            int f2 = 0; // frequency of constants

            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            // table for vowels
            Map<Character, Integer> vowelsTable = new HashMap();
            // table for constants
            Map<Character, Integer> constansTable = new HashMap();

            // scanning the string
            for (Character ch : s.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (vowels.contains((ch))) {
                        vowelsTable.put(ch, vowelsTable.getOrDefault(ch, 0) + 1);
                    } else {
                        constansTable.put(ch, constansTable.getOrDefault(ch, 0) + 1);
                    }
                }
            }

            // getting higher freq
            for (Integer freq : vowelsTable.values()) {
                f1 = Math.max(f1, freq);
            }
            for (Integer freq : constansTable.values()) {
                f2 = Math.max(f2, freq);
            }

            return f1 + f2;
        }
    }
}
