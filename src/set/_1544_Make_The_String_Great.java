package set;

import java.util.ArrayDeque;

public class _1544_Make_The_String_Great {
    public static void main(String[] args) {
        System.out.println(Solution.makeGood("leEeetcode"));
    }

    static class Solution {
        static public String makeGood(String s) {

            // edge case
            if (s.length() <= 1) {
                return s;
            }

            ArrayDeque<Character> deque = new ArrayDeque<>();
            // inserting all the elements in the stack
            for (char ch : s.toCharArray()) {
                if (!deque.isEmpty() &&
                        Character.toLowerCase(deque.peek()) == Character.toLowerCase(ch) &&
                        deque.peek() != ch) {
                    deque.pop();
                } else {
                    deque.push(ch);
                }
            }

            StringBuilder newStr = new StringBuilder();
            // making the string again
            while (!deque.isEmpty()) {
                newStr.append(deque.pollLast());
            }
            return newStr.toString();
        }
    }
}
