package twoPointers;

import java.util.*;

public class _821_Shortest_Distance_to_a_Character {
    public static void main(String[] args) {
        _821_Shortest_Distance_to_a_Character outer = new _821_Shortest_Distance_to_a_Character();

        Solution2 Solution2 = outer.new Solution2();
        Solution2.shortestToChar("loveleetcode", 'e');

//        Solution1 solution1 = outer.new Solution1();
//        solution1.shortestToChar("loveleetcode", 'e');
    }

    //   scanning the string 2 times
    class Solution2 {
        public int[] shortestToChar(String s, char c) {
            int n = s.length();
            int[] answer = new int[n];
            int position = -s.length();
//            scan 1 - left to right
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) position = i;

                answer[i] = i - position;
            }

//            scan 2 - right to left
            for (int i = position - 1; i > 0; i--) {
                if (s.charAt(i) == c) position = i;

                answer[i] = Math.min(answer[i], position - i);

            }
            return answer;
        }
    }

    //    wrong solution - 1 scan isn't enough
    class Solution1 {
        public int[] shortestToChar(String s, char c) {
            int[] answer = new int[s.length()];

            // two pointers approach - right pointer will indicate the 'c'
            int right = 0;
            for (int left = 0; left < answer.length; left++) {
                // moving right pointer to the 'c'
                while (right < answer.length && s.charAt(right) != c) {
                    right++;
                }

                // this loop will calculate the differences till that index
                while (left < right) {
                    answer[left] = Math.abs(right - left);
                    left++;
                }
                right++;
            }

            return answer;
        }
    }
}
