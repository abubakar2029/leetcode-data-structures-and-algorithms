from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])

        # finding row
        top, bottom = 0, m - 1
        while top <= bottom:
            mid = top + (bottom - top) // 2

            if target > matrix[mid][-1]:
                top = mid + 1
            elif target < matrix[mid][0]:
                bottom = mid - 1
            else:
                break

        # target doesn't exist in any row
        if top > bottom:
            return False

        row = top + (bottom - top) // 2

        # finding coloumn
        left, right = 0, n - 1
        while left <= right:
            mid = left + (right - left) // 2
            if target == matrix[row][mid]:
                return True
            elif target > matrix[row][mid]:
                left = mid + 1
            else:
                right = mid - 1

        return False

sol= Solution()
sol.searchMatrix([[1],[3],[5]],3)