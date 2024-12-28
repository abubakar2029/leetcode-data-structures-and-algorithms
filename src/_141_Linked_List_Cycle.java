public class _141_Linked_List_Cycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */

//    Optimized Approach
 public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;
                // Comparing references here, not val
                if (slow == fast)
                    return true;
            }
            return false;
        }
    }

// Approach 2 using HashSet
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode pointer = head;
            Set<ListNode> record = new HashSet<ListNode>();
            while (pointer !=null && pointer.next != null) {
                pointer = pointer.next;
                // Comparing references here, not val
                if (record.contains(pointer))
                    return true;
                record.add(pointer);
            }
            return false;
        }
    }
}
