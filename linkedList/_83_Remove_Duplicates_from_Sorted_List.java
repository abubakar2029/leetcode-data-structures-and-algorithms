package linkedList;

public class _83_Remove_Duplicates_from_Sorted_List {
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

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            // agar head null ya agla node null ha to return kr do
            if (head == null || head.next == null)
                return head;
            ListNode current = head;
            ListNode pointer = head.next;
            while (pointer != null) {
                if (current.val == pointer.val) {
                    pointer = pointer.next;
                } else {
                    current.next = pointer;
                    current = current.next;
                    pointer = pointer.next;

                }
            }
            current.next = null;
            return head;
        }
    }
}
