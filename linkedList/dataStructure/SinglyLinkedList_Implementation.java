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
            Node last = new Node(value); //   naya node bnaya
            Node secondLast = tail; //    aak pointer lia loop ko iterate krwana ka lia
            secondLast.next = last;
            tail = last;
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
        while (temp != null) {
//            temp.next != null, ya galat ho ga bcz last node ka value to ho ga lakin node.next null ho ga os lia loop sa bahir aa jae ga, solution ma os ka value print krwao or khud hi temp=temp.next(null) ho jae ga
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int getSize() {
        return size;
    }

    public Node get(int index) {
//        edge check lgaya
        if (index < 0 || index >= size) throw new RuntimeException();

        Node temp = head; //    yahan head ma first index, first node ajae ga, os lia loop index tk nhi chla ga
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp; // loop khatam hoa Node return kr do
    }

    public E deleteFirst() {
        Node temp = head; //    yahan pehla node agaya
        head = temp.next; //    pehla node 2nd ko point kr raha ha, os lia head ab second ko bna dia
        if (head == null) tail = null; // dekho agar aak hi element tha or head null ho gaya to tail ko bhi null kr dia
        size--;
        return temp.value;
    }

    public E deleteLast() {
        if (size == 0) throw new RuntimeException("List is empty"); // Handle empty list
        if (size == 1) { // Edge case: only one node
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        Node last = tail; // Save the last node's value
        tail = secondLast;
        secondLast.next = null;
        size--;
        return last.value;
    }


    public E delete(int index) {
        //        edge check lgaya
        if (index < 0 || index >= size) throw new RuntimeException();
        if (index == 0) {
            return deleteFirst(); // Handle deletion of the first node
        }

        Node beforeIndex = get(index - 1); // index(required) sa pehla ka node lia jo osa point kr raha ha
        Node requiredNode = beforeIndex.next; //    ya wo node mila jisa delete kreang
        Node nextIndex = requiredNode.next; //   delete hona wala node jisa point kr raha ha wo object(node)
        beforeIndex.next = nextIndex; //    before ko kaha ab pehla wala ko rehna do os sa next ko point kr do, or ya hogaya
        size--;
        return requiredNode.value;
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
