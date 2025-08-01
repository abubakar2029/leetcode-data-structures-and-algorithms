package weeklyContest._02_Feburary_2025;

import java.util.*;

public class _Q1_Maximum_Difference_Between_Even_and_Odd_Frequency_I {
    public static void main(String[] args) {
        System.out.println(Solution.maxDifference("zgzaaa"));
    }

//    Correct Solution 1
    class Solution {
        static public int maxDifference(String s) {
            int even = 0;
            int odd = 0;
            Map<Character, Integer> map = new HashMap();
            int n = s.length();
            // pehla loop pre-processing
            for (int i = 0; i < n; i++) {
                int value = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : 0;
                map.put(s.charAt(i), value + 1);
            }

            boolean firstEven = true;
            // second even count nikal lia
            for (int i = 0; i < n; i++) {
                if (map.get(s.charAt(i)) % 2 == 0) {
                    if (firstEven) {
                        even = map.get(s.charAt(i));
                        firstEven = false;
                    } else if (map.get(s.charAt(i)) < even) {
                        even = map.get(s.charAt(i));
                    }
                }
            }

            // second odd count nikal lia
            for (int i = 0; i < n; i++) {
                if (map.get(s.charAt(i)) % 2 == 1 && map.get(s.charAt(i)) > odd) {
                    odd = map.get(s.charAt(i));
                }
            }
            return odd - even;
        }
    }

//    An optimized solution

    class Solution2 {
        public static int maxDifference(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int n = s.length();

            // Count character frequencies
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int maxOdd = Integer.MIN_VALUE;
            int minEven = Integer.MAX_VALUE;

            // Find the max odd and min even frequencies
            for (int freq : map.values()) {
                if (freq % 2 == 1) {
                    maxOdd = Math.max(maxOdd, freq);
                } else {
                    minEven = Math.min(minEven, freq);
                }
            }

            // Return the difference
            return maxOdd - minEven;
        }

        // Example test cases
        public static void main(String[] args) {
            System.out.println(maxDifference("aaaaabbc"));  // Output: 3
            System.out.println(maxDifference("abcabcab")); // Output: 1
        }
    }

}
