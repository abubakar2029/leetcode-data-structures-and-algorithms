package linkedList.dataStructure;

public class SinglyLinkedList_Implementation<E> {
    private int size;
    private Node head;
    private Node tail;

    public SinglyLinkedList_Implementation() {
        size = 0;
    }

    public void insertAtFirst(E value) {
        Node node = new Node(value); //   naya node bnaya
        Node t1 = head; //    pehla node t1 ma savw kia
        head = node; //   head ko nae node ki taraf point kr dia
        head.next = t1;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(E value) {
        if (head == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value); //   naya node bnaya
        Node temp = head; //    aak pointer lia loop ko iterate krwana ka lia
        while (temp.next != null) {
            temp = temp.next;
        }
//        loop na akhri node dia
        temp.next = node; // alhri node ko kaha new node ko point kr do
        tail = node;
        size++;
    }

    public void insert(E value, int index) {
        Node node = new Node(value);
//        if head is null, mean length zero, insert at first
        if (head == null || index == 0) {
            insertAtFirst(value);
            return;
        } else {
//            store head in t1, and start iterating
            Node t1 = head;
            Node t2;
            for (int i = 1; i < index; i++) {
                t1 = t1.next;
            }
//            the for loop has found the node before the index
            t2 = t1.next; //    t2 ma node save kr lia jis ka ab index aga jae ga, jo pehla os index ma tha
            t1.next = node; //  t1.next ko naya node da dia, matlab ab index value pr node change ho gaya bcz os sa pehla wala ab kisi or ko point kr raha
            node.next = t2; //  ab new node ko kaha ka jis ki jagah pr aae ho ab osa point kro
            size++;
        }

    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
//            temp.next != null, ya galat ho ga bcz last node ka value to ho ga lakin node.next null ho ga os lia loop sa bahir aa jae ga, solution ma os ka value print krwao or khud hi temp=temp.next(null) ho jae ga
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
