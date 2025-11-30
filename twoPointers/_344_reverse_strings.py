class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        # initialize 2 pointers
        # start reversing by in-place
        # when 2 will be equal to each other stop there and return the answer

        i, j = 0, len(s) - 1

        while i < j:
            print("i", i, " j", j)
            t = s[i]
            s[i] = s[j]
            s[j] = t
            j -= 1
            i += 1
