package linkedList.dataStructure;

public class DoublyLinkedList<E> {
    private int size;
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        size = 0;
    }

    public void insertAtFirst(E value) {
//        pehla edge case check kra
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

//      normal list ma head ko change kia
        Node temp = head;
        head = node;
        head.next = temp;
        temp.prev = head;
        head.prev = null;
        size++;
    }

    public void insert(E val, int index) {
        Node node = new Node(val);
//        edge case check kra
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

//        edge case agar index out of bounds ha to
        if (index < 0 || index >= size) {
            throw new RuntimeException("Out of bounds index");
        }

//        0 sa index tk scan kra or node get kra
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
//        required node mil gaya
        node.next = temp.next;
        node.prev = temp.prev;
        temp.prev.next = node;
        temp.next.prev = node;
        size++;
    }

    public void delete(int index) {
        //        edge case agar index out of bounds ha to
        if (index < 0 || index >= size) {
            throw new RuntimeException("Out of bounds index");
        }

//        0 sa index tk loop chalaya
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
//        required node mila
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    private class Node {
        private E value;
        private Node next;
        private Node prev;

        public Node(E value) {
            this.value = value;
        }
    }

}
