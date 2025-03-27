package linkedList;

import java.util.Stack;

public class _92_Reverse_Linked_List_II {

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

        class Solution {
            public ListNode reverseBetween(ListNode head, int left, int right) {
                ListNode newStart = new ListNode();
                ListNode newEnd = new ListNode();
                ListNode pointer = head;

                Stack<ListNode> stack = new Stack<>();

                // getting the node from where to start
                int i = 1;
                while (i != left) {
                    newStart = pointer;
                    pointer = pointer.next;
                    i++;
                }

                // adding required elements in the stack - from the starting position
                while (i <= right) {
                    stack.push(pointer);
                    pointer = pointer.next;
                    newEnd = pointer;
                    i++;
                }

                // reversing the list

                while (!stack.isEmpty()) {
                    newStart.next = stack.pop();
                    newStart = newStart.next;
                }
                newStart.next = newEnd;

                return head;
            }
        }
    }
