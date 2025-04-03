public class _1876_Substrings_of_Size_Three_with_Distinct_Characters {

    class Solution {
        public int countGoodSubstrings(String s) {
            int i = 0, j = 1, k = 2;
            int cnt = 0;
            while (k < s.length()) {
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)) cnt++;
                i++;
                j++;
                k++;
            }
            return cnt;
        }
    }
}
