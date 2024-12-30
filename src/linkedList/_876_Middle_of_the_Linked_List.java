package linkedList;

public class _876_Middle_of_the_Linked_List {
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
