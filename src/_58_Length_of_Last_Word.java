public class _58_Length_of_Last_Word {
    class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;
            s = s.trim();
            int lastIndex = s.length() - 1;
            for (int i = lastIndex; i >= 0; i--) {
                if (Character.isWhitespace(s.charAt(i)))
                    break;
                else {
                    length++;
                }
            }
            return length;
        }
    }
}
