class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        # determine the length of list
        # determine how much to rotate
        # loop upto the new tail

        if k == 0 or head is None or head.next is None:
            return head

        n = 0
        ptr = head
        while ptr:
            n += 1
            tail = ptr
            ptr = ptr.next

        k = k % n

        if k == 0:
            return head

        ptr = head
        for i in range(1, n - k):
            ptr = ptr.next

        # now modify the list
        new_head = ptr.next
        ptr.next = None

        tail.next = head

        return new_head
