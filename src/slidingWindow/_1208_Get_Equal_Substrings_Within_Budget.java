package slidingWindow;

public class _1208_Get_Equal_Substrings_Within_Budget {
    public static void main(String[] args) {
        Solution.equalSubstring("abcd", "bcdf", 3);
    }

    static class Solution {
        public static int equalSubstring(String s, String t, int maxCost) {
            int window = 0, left = 0, right = 0, maxSize = 0, maxWindow = 0;
            while (right < s.length()) {
                window += Math.abs(s.charAt(right) - t.charAt(right));
                while (window > maxCost) {
                    window -= Math.abs(s.charAt(left) - t.charAt(left));
                    left++;
                }
                maxWindow = Math.max(maxWindow, right - left + 1);
                right++;
            }
            return maxWindow;
        }
    }
}
