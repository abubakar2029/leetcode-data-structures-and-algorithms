public class _32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        _32_Longest_Valid_Parentheses parent = new _32_Longest_Valid_Parentheses();
        Solution solution = parent.new Solution();
        System.out.println(        solution.longestValidParentheses(")()())"));
    }


    //    Approach 1 - passed 51 test_cases
    class Solution {
        public int longestValidParentheses(String s) {
            return helper('\0', 0, s);
        }

        public int helper(char prev, int i, String s) {
            if (i >= s.length())
                return 0;
            char current = s.charAt(i);
            if ((prev == '(' && current == ')') || (prev == ')' && current == '(')) {
                return 2 + helper(s.charAt(++i), ++i, s);
            }

            return s.charAt(i) == ')' ? helper('\0', ++i, s) : helper(s.charAt(i), ++i, s);
        }
    }
}
