package _2025_leetcode_contests.may_2025;

import java.util.*;

public class _Q1_Minimum_Deletions_for_At_Most_K_Distinct_Characters {
    public static void main(String[] args) {
        _Q1_Minimum_Deletions_for_At_Most_K_Distinct_Characters outer = new _Q1_Minimum_Deletions_for_At_Most_K_Distinct_Characters();
        Solution solution = outer.new Solution();
        solution.minDeletion("abc", 2);
    }

    //    correct solution
    class Solution {
        public int minDeletion(String s, int k) {
            // Count frequency of each character
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            int distinctCount = freqMap.size();
            if (distinctCount <= k) return 0;

            // Collect frequencies into a min-heap
            PriorityQueue<Integer> pq = new PriorityQueue<>(freqMap.values());

            int deletions = 0;
            int toRemove = distinctCount - k;

            while (toRemove-- > 0) {
                deletions += pq.poll(); // delete all occurrences of one character
            }

            return deletions;
        }
    }

    //    wrong solution
    class Solution1 {
        public int minDeletion(String s, int k) {
            // making a hashSet to know how many distinct characters are there
            Set<Character> set = new HashSet<>();
            for (Character ch : s.toCharArray()) {
                set.add(ch);
            }

            int diff = set.size() - k;
            return diff > 0 ? diff : 0;
        }
    }
}
