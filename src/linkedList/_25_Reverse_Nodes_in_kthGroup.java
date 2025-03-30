package linkedList;

public class _25_Reverse_Nodes_in_kthGroup {

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

    class Solution1 {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k == 1)
                return head;

            // checking if k-nodes available
            int count = 1;
            ListNode dummy = head;
            while (count <= k) {
                dummy = dummy.next;
                count++;
            }

            // reversing the rest of the list
            ListNode previous = reverseKGroup(dummy, k);

            // reversing the kth group
            count = 1;
            dummy = head;
            while (count <= k) {
                ListNode next = dummy.next;
                dummy.next = previous;
                previous = dummy;
                dummy = next;
                count++;
            }

            head = previous;
            return head;
        }
    }
}
