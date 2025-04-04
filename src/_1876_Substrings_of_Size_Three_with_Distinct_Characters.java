import java.util.*;

public class _1876_Substrings_of_Size_Three_with_Distinct_Characters {


    //    using HashSet
    class Solution2 {
        public int countGoodSubstrings(String s) {
            int count = 0;

            for (int i = 0; i < s.length() - 2; i++) {
                Set<Character> set = new HashSet();
                set.add(s.charAt(i));
                set.add(s.charAt(i + 1));
                set.add(s.charAt(i + 2));

                if (set.size() == 3)
                    count++;
            }

            return count;
        }
    }


    //   using sliding window
    class Solution1 {
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
