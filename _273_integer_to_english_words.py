class Solution:
    def numberToWords(self, n: int) -> str:
        below_20 = [
            "",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen",
        ]
        tens = [
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety",
        ]

        thousands = ["", "Thousand", "Million", "Billion"]

        if n == 0:
            return "Zero"

        def helper(n):
            if n < 20:
                return below_20[n]
            if n < 100:  # its a 2 digit
                return tens[n // 10] + " " + helper(n % 10)
            else:
                return below_20[n // 100] + " Hundred " + helper(n % 100)

        res = ""
        i = 0
        while n > 0:
            if n % 1000 != 0:
                res = helper(n % 1000).strip() + " " + thousands[i] + " " + res
                #       last_3_num  +   []          + ""
            n = n // 1000
            i += 1

        print(res)
        return res.strip()
