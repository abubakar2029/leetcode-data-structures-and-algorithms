package linkedList;

public class _24_Swap_Nodes_in_Pairs {


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
        public ListNode swapPairs(ListNode head) {
            // edge case
            if (head == null || head.next == null)
                return head;

            ListNode pointer = head;
            head = head.next;
            ListNode previous = new ListNode();

            while (pointer != null && pointer.next != null) {
                ListNode first = pointer;
                ListNode second = pointer.next;
                pointer = second.next;

                // now swap it
                second.next = first;
                first.next = pointer;
                previous.next = second;
                previous = first;
            }
            return head;
        }
    }
}
