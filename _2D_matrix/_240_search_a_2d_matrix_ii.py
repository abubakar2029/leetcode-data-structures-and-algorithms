class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n, m = len(matrix), len(matrix[0])

        row, col = n - 1, 0

        while row >= 0 and col <= m - 1:
            if target == matrix[row][col]:
                return True
            elif target > matrix[row][col]:
                col += 1
            else:
                row -= 1

        return False
