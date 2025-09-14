package stacks;

import java.util.*;

public class _1381_Design_a_Stack_With_Increment_Operation {
    public static void main(String[] args) {
        _1381_Design_a_Stack_With_Increment_Operation parent = new _1381_Design_a_Stack_With_Increment_Operation();
        CustomStack obj = parent.new CustomStack(3);
        obj.push(1);
        obj.push(2);
        obj.pop();
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.increment(5,100);
        obj.increment(2,100);
        System.out.println(obj.pop());


    }

    class CustomStack {
        ArrayList<Integer> main;
        int max;

        public CustomStack(int maxSize) {
            this.main = new ArrayList();
            this.max = maxSize;
        }

        public void push(int x) {
            if (main.size() < max)
                main.add(x);
        }

        public int pop() {
            if (main.isEmpty())
                return -1;
            return main.remove(main.size() - 1);
        }

        public void increment(int k, int val) {
            int x = Math.min(main.size(), k);

            for (int i = 0; i < x; i++) {
                main.set(i, main.get(i) + val);
            }

        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}
