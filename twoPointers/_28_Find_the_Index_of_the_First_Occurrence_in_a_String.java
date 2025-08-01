package twoPointers;

public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            if (m > n)
                return -1;
            int k = 0;
            for (int i = 0; i < haystack.length(); i++) {
                k = 0;
                if (haystack.charAt(i) == needle.charAt(k)) {
                    for (int j = i; j < haystack.length(); j++) {
                        if (haystack.charAt(j) != needle.charAt(k)) {
                            break;
                        }
                        k++;
                        if (k == needle.length())
                            return i;
                    }
                }
            }
            return -1;
        }
    }
}
