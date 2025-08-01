package recursion;

import java.util.*;

public class _22_Generate_Parentheses {
    class Solution {
        public void solve(String op, int open, int close, List<String> ans) {
            if (open == 0 && close == 0) {
                ans.add(op);
                return;
            }

            // when count of open and close brackets are same
            // we can only place an open bracket
            if (open == close) {
                solve(op + "(", open - 1, close, ans);
            } else if (open == 0) {
                // only choice is to place closing bracket
                solve(op + ")", open, close - 1, ans);
            } else if (close == 0) {
                // only choice is to place opening bracket
                solve(op + "(", open - 1, close, ans);
            } else {
                // we can place both '(' and ')'
                solve(op + "(", open - 1, close, ans);
                solve(op + ")", open, close - 1, ans);
            }
        }

        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();
            solve("", n, n, ans);
            return ans;
        }
    }

}
