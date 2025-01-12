public class _2116_Check_if_a_Parentheses_String_Can_Be_Valid {
    public static void main(String[] args) {
        boolean result = Solution.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(", "100011110110011011010111100111011101111110000101001101001111");
    }

    class Solution {
        static public boolean canBeValid(String s, String locked) {
            if (s.length() % 2 != 0)
                return false;
            int openBrackets = 0;
            int closeBrackets = 0;
            int unlocked = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c=s.charAt(i);
                if (s.charAt(i) == '(')
                    openBrackets++;
                else
                    closeBrackets++;
                if (locked.charAt(i) == '0')
                    unlocked++;
            }
            return (openBrackets - closeBrackets <= unlocked) ? true : false;
        }
    }
}
