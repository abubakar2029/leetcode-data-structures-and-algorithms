class Solution:
    def convert(self, s: str, numRows: int) -> str:
        i = 0
        n = len(s)
        result = ""

        matrix = []
        for _ in range(numRows):
            matrix.append([])

        if n == 1:
            return s

        while i < n:

            # coloumn 1
            for j in range(numRows):
                if i >= n:
                    break
                matrix[j].append(s[i])
                i += 1

            # coloumn 2
            for j in range(numRows - 1, -1, -1):
                if j == 0 or j == numRows - 1:
                    matrix[j].append("")
                    continue
                if i >= n:
                    break
                matrix[j].append(s[i])
                i += 1

        for i in range(numRows):
            result += "".join(matrix[i])

        return result
