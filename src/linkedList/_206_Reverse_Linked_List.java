package linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _206_Reverse_Linked_List {

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            Stack<ListNode> stk = new Stack<>();
            ListNode pointer = head;
            // loop chlao tail tk,
            while (pointer != null) {
                stk.push(pointer);
                pointer = pointer.next;
            }
            // sb elements stack ma agae, tail sb sa oper ha

            // loop chlao or reverse list bna do
            ListNode current = stk.pop();
            // yaar head ko preserve krna ha, so current use kia jo iterate krta hoa last tk jae lakin head pehla ko hi point kra
            head=current;
            while (!stk.isEmpty()) {
                current.next = stk.pop();
                current = current.next;
            }
            current.next = null;
            return head;
        }
    }
}
