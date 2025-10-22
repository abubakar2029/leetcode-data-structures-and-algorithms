        # find the number of cols
        # make the matrix
        # iterate over the matrix in diagonal order
        
# Approach 2:
class Solution:
    def decodeCiphertext(self, encodedText: str, rows: int) -> str:
        if rows == 1:
            return encodedText  # Edge case

        n = len(encodedText)
        cols = n // rows
        mat = []
        for i in range(0, n, cols):
            sub_str = encodedText[i : i + cols]
            sub_list = list(sub_str)
            mat.append(sub_list)

        res = ""
        for start_col in range(cols):
            i, j = 0, start_col
            while i < rows and j < cols:
                res += mat[i][j]
                i += 1
                j += 1

        # Strip trailing spaces
        return res.rstrip()


sol = Solution()
print(sol.decodeCiphertext("ch   ie   pr", 3))


# Approach 1:
class Solution1:
    def decodeCiphertext(self, encodedText: str, rows: int) -> str:
        original = ""
        n = len(encodedText)
        cols = int(n / rows)

        mat = []
        for i in range(0, n, cols):
            sub_str = encodedText[i : i + cols]
            sub_list = list(sub_str)
            mat.append(sub_list)

        print(mat)
        i, j = 0, 0
        while i != rows and j != cols:
            original += mat[i][j]
            if i == rows-1 and j != cols-1:
                i = 0
                j -= 1
                continue
            else:
                i += 1
            if j < cols - 1 and i != rows:
                j += 1

        return original
