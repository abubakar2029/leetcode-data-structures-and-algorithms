package linkedList;

import java.util.HashSet;

public class _160_Intersection_of_Two_Linked_Lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }


    //  Naive approach using HashSet
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            HashSet listA = new HashSet();
            ListNode ptrA = headA;
            while (ptrA != null) {
                listA.add(ptrA);
                ptrA = ptrA.next;
            }

            ListNode ptrB = headB;
            while (ptrB != null) {
                if (listA.contains(ptrB))
                    return ptrB;
                ptrB = ptrB.next;
            }
            return null;
        }
    }
}
