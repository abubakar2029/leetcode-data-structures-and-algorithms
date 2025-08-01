package linkedList;


public class _876_Middle_of_the_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;

            // in even case the check fast.next ensure that fast.next.next dont throw exception error
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    }
}
