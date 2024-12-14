package slidingWindow;

import java.util.HashSet;
import java.util.Set;


public class _3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);

            // If character already exists in the window, slide the left pointer
            while (set.contains(currentChar)) {
                set.remove(s.charAt(l));
                l++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update the maximum length
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
