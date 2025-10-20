class Solution:
    def generateMatrix(self, n: int):
        top, bottom = 0, n - 1
        left, right = 0, n - 1
        count = 1

        nested_list = [0] * n

        # initializing dummy matrix
        matrix = []
        for i in range(n):
            matrix.append(nested_list.copy())

        n = n * n
        
        while count <= n:
            # top_row, left->right
            for i in range(left, right + 1):
                matrix[top][i] = count
                count += 1
            top += 1

            # right_col, top->bottom
            for i in range(top, bottom + 1):
                if count > n:
                    break
                matrix[i][right] = count
                count += 1
            right -= 1

            # bottom_row
            for i in range(right, left - 1, -1):
                if count > n:
                    break
                matrix[bottom][i] = count
                count += 1
            bottom -= 1

            # left_col
            for i in range(bottom, top-1, -1):
                if count > n:
                    break
                matrix[i][left] = count
                count += 1
            left += 1

        print(matrix)
        return matrix

sol = Solution()
sol.generateMatrix(3)