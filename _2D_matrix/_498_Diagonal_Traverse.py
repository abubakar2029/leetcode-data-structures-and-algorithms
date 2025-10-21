from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat) - 1, len(mat[0]) - 1
        arr = []
        count = 0

        i, j = 0, 0

        # code for diagonal traversal
        while count <= len(mat) * len(mat[0]):
            if i>n:
                i = n
            # keep_decreasing_row
            while i >= 0:
                arr.append(mat[i][j])
                count += 1
                i -= 1
                j += 1

            i += 1
            if j > m:
                j = m

            # keep_decreasing_col
            while j >= 0:
                arr.append(mat[i][j])
                count += 1
                j -= 1
                i += 1
            j += 1

        return arr

sol = Solution()
print(sol.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))