package slidingWindow;

//  My Solution
/*
// pehla ka table bna lia
// second pr start sa loop chla dia
// table ma add krwata gae or dakha kb 2 table equal hon gan
// or jb tk match kr raha ha while ma phanko
*/

import java.util.HashMap;

public class _76_Minimum_Window_Substring {

    //    Incorrect & Incomplete
    class Solution1 {
        public String minWindow(String s, String t) {
            // edge case
            if (s.length() < t.length()) {
                return "";
            }

            HashMap<Character, Integer> table2 = new HashMap();
            // adding frequencies of t string in hashmap
            for (Character ch : t.toCharArray()) {
                table2.put(ch, table2.getOrDefault(ch, 0) + 1);
            }

            String result = "";
            int left = 0;
            HashMap<Character, Integer> table1 = new HashMap();
            for (int right = 0; right < s.length(); right++) {
                Character ch = s.charAt(right);
                table1.put(ch, table1.getOrDefault(ch, 0) + 1);
                String substr = s.substring(left, right + 1);
                if (table1.equals(table2)) {
                    if (result.length() > substr.length()) {
                        result = substr;
                    }
                    while (table1.equals(table2)) {
                        int freq = table1.getOrDefault(ch, 1);
                        if (freq == 0) {

                            table1.remove(ch);
                        } else {
                            table1.put(ch, --freq);
                        }
                    }
                }
                return result;

            }
        }
    }
}
