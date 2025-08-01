package linkedList;

public class _61_Rotate_List {

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


    //    Rotation by 2 pointers approach
    class Solution1 {
        public ListNode rotateRight(ListNode head, int k) {

            // handling edge case 
            if (head == null || head.next == null || k == 0) {
                return head;
            }
            ListNode fast = head;
            ListNode slow = head;

            // determining the length of sequence
            int length = 1;
            while (fast.next != null) {
                fast = fast.next;
                length++;
            }

            // determining the effective rotations
            k = k % length;
            if (k == 0) {
                return head;
            }

            fast = head;
            while (k > 0) {
                fast = fast.next;
                k--;
            }

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            ListNode newHead = slow.next;
            slow.next = null;
            fast.next = head;
            return newHead;
        }
    }
}
