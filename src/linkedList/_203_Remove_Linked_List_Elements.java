package linkedList;

public class _203_Remove_Linked_List_Elements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        _203_Remove_Linked_List_Elements solutionObj = new _203_Remove_Linked_List_Elements();
        Solution solution = solutionObj.new Solution();

        // Create a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = solutionObj.new ListNode(1);
        head.next = solutionObj.new ListNode(2);
        head.next.next = solutionObj.new ListNode(6);
        head.next.next.next = solutionObj.new ListNode(3);
        head.next.next.next.next = solutionObj.new ListNode(4);
        head.next.next.next.next.next = solutionObj.new ListNode(5);
        head.next.next.next.next.next.next = solutionObj.new ListNode(6);

        // Remove elements with value 6
        int valToRemove = 6;
        ListNode updatedHead = solution.removeElements(head, valToRemove);

        // Print the updated linked list
        ListNode current = updatedHead;
        System.out.print("Updated Linked List: ");
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode newHead = null;
            ListNode pointer = head;
            ListNode newPointer = null;
            if (head == null || head.next == null)
                return head;
            while (pointer != null) {
                if (pointer.val == val) {
                    pointer = pointer.next; // Skip the current node
                    continue;
                }
                if (newHead == null) {
                    newHead = pointer;
                    newPointer = newHead;
                } else {
                    newPointer.next = pointer;
                    newPointer = newPointer.next;
                }
                pointer = pointer.next;
            }
            newPointer.next = null;
            return newHead;
        }
    }
}
