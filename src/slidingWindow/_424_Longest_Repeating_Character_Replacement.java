package slidingWindow;

import java.util.Map;
import java.util.HashMap;

public class _424_Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        int longest = 0;
        int l = 0;
        int maxFreq = 0;
        Map<Character, Integer> list = new HashMap<>();

        // Sliding window
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            list.put(rightChar, list.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, list.get(rightChar));

            // Shrink the window if needed
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                list.put(leftChar, list.get(leftChar) - 1);
                l++;
            }

            // Update the longest substring length
            longest = Math.max(longest, r - l + 1);
        }

        return longest;
    }

}
