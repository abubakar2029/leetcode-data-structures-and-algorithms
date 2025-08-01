package linkedList;

public class _142_Linked_List_Cycle_II {
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

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            // detecting cycle present or not
            Boolean cycle = false;
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }

            if (!cycle)
                return null;
            // detecting start node of cycle
            slow = head;
            int index = 0;
            while (fast != slow) {
                slow = slow.next;
                fast = fast.next;
                index++;
            }
            return slow;
        }
    }
}
