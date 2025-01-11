package stacks.dataStructure;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
//        The <> (diamond operator) allows Java to infer the type (Integer) from the left-hand side of the assignment.

        stack.push(2);
        stack.push(3);
        stack.push(99);

        System.out.println(stack.pop()); // 99
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
    }
}
