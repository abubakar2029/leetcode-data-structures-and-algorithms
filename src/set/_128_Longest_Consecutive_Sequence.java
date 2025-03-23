package set;

import java.util.*;

public class _128_Longest_Consecutive_Sequence {

    //    All test cases passed
    class Solution2 {
        public int longestConsecutive(int[] nums) {

            // edge case
            if (nums.length == 0) {
                return 0;
            }

            Set<Integer> list = new HashSet<>();
            int start = Integer.MAX_VALUE;
            // adding all elements in the set
            for (int num : nums) {
                list.add(num);
                start = Math.min(start, num);
            }

            int longestStreak = 0;
            for (int num : list) {
                if (!list.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (list.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }
            // while (list.contains(start + 1)) {
            //     start++;
            //     longestStreak++;
            // }
            return longestStreak;
        }
    }

    //   Time Limit Exceeded
    class Solution1 {
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
                int currentNum = num;
                int currentStreak = 1;
                if (list.contains(num + 1)) {

                    while (list.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }

            return longestStreak;
        }
    }
}
