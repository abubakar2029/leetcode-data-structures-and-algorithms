package stacks;
import java.util.*;
public class _155_Min_Stack {
    class MinStack {
        Stack<custom_pair> stack;

        public class custom_pair {
            int first;
            int second;

            custom_pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        public MinStack() {
            stack = new Stack();
        }

        public void push(int val) {
            if (stack.isEmpty()) {
                stack.push(new custom_pair(val, val));

            } else {
                int min_val = Math.min(stack.peek().second, val);
                stack.push(new custom_pair(val, min_val));
            }
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().first;
        }

        public int getMin() {
            return stack.peek().second;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
