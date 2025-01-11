package queues.dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque.remove()); // 2
        System.out.println(deque.removeLast()); // 4
        System.out.println(deque.peek()); // 3
    }
}
