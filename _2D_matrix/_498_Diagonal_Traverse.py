from typing import List



# Approach 2: 
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # traverse col by col
        n = len(mat)
        m = len(mat[0])

        count = 0
        i = 0
        j = 0

        result = []
        direction = 1  # 1(upward)
        for _ in range(n * m):
            if direction == 1:
                result.append(mat[i][j])

                if j == m - 1:
                    i += 1
                    direction = -1
                elif i == 0:
                    direction = -1
                    j += 1
                else:
                    i -= 1
                    j += 1

            else:
                result.append(mat[i][j])
                if i == n - 1:
                    direction = 1
                    j += 1
                elif j == 0:
                    i += 1
                    direction = 1
                else:
                    i += 1
                    j -= 1

        return result


# Approach 1:
class Solution1:
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