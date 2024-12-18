package linkedList.dataStructure;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList_Implementation<Integer> list = new SinglyLinkedList_Implementation<>();

        list.insertAtFirst(10);
        list.insertAtFirst(5);
        list.insertLast(20);
        list.insert(15, 2); // Insert 15 at index 2

        list.display(); // Output: 5 -> 10 -> 15 -> 20 -> END
        System.out.println("Size: " + list.getSize()); // Size: 4

        list.deleteFirst();
        list.display(); // Output: 5 -> 10 -> 15 -> 20 -> END
        list.delete(2);
        list.display();;
    }
}

