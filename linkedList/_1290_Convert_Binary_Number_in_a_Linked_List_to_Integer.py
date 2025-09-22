class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        # determine the length of list
        length = 0
        ptr = head
        while ptr:
            ptr = ptr.next
            length += 1

        # initialize an ans integer
        res = 0

        # start from the first node and power of 2 will length-1
        ptr = head
        while ptr:
            res += ptr.val * (2 ** (length - 1))
            length -= 1
            ptr = ptr.next

        return res
