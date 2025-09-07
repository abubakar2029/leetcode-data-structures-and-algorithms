package stacks;

import java.util.*;

public class _224_Basic_Calculator {
    public static void main(String[] args) {
        _224_Basic_Calculator parent = new _224_Basic_Calculator();
        Solution solution = parent.new Solution();

        System.out.println(solution.calculate("1-( -2)"));
    }

    class Solution {
        public int calculate(String s) {
            Stack<Integer> stack = new Stack();

            // helping variables
            int num = 0;
            int ans = 0;
            int sign = 1;

            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch))
                    num = num * 10 + Character.getNumericValue(ch);
                else if (ch == '+' || ch == '-') {
                    // I calculate previous
                    ans += num * sign;

                    num = 0;

                    sign = (ch == '+') ? 1 : -1;

                } else if (ch == '(') {
                    stack.push(ans);
                    stack.push(sign);
                    ans = 0;
                    sign = 1;
                } else if (ch == ')') {
                    ans += num * sign;
                    int prev_sign = stack.pop();
                    int prev_ans = stack.pop();
                    num = 0;

                    ans = prev_ans + prev_sign * ans;
                }

            }
            ans += num * sign;
            return ans;
        }
    }
}
