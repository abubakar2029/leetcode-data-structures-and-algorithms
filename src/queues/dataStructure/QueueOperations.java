package queues.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(21);
        queue.add(22);
        queue.add(23);

        System.out.println(queue.peek()); // 21
        System.out.println(queue.remove()); // 21
        System.out.println(queue.peek()); // 22
    }
}
