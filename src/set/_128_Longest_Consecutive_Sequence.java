package set;

import java.util.*;

public class _128_Longest_Consecutive_Sequence {
    class Solution {
        public int longestConsecutive(int[] nums) {

            // edge case
            if (nums.length == 0) {
                return 0;
            }

            Set<Integer> list = new HashSet<>();

            // adding all elements in the set
            for (int num : nums) {
                list.add(num);
            }

            int longestStreak = 0;
            for (int num : list) {
                if (list.contains(num + 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (list.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }
    }
}
