import java.util.HashSet;
import java.util.Set;


public class _141_Linked_List_Cycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Optimized Approach: Floyd’s Cycle Detection Algorithm (Two Pointers)
    class Solution1 {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                // Comparing references, not values
                if (slow == fast)
                    return true;
            }
            return false;
        }
    }

    // Approach 2: Using HashSet
    class Solution2 {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> record = new HashSet<>();
            ListNode pointer = head;

            while (pointer != null) {
                // If the node is already in the set, cycle exists
                if (record.contains(pointer))
                    return true;

                // Add the node to the set and move forward
                record.add(pointer);
                pointer = pointer.next;
            }
            return false;
        }
    }
}
