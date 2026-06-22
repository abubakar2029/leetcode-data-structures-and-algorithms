class Solution:
    def romanToInt(self, s: str) -> int:
        data = {
            "I": 1,
            "IV": 4,
            "V": 5,
            "IX": 9,
            "X": 10,
            "XL": 40,
            "L": 50,
            "XC": 90,
            "C": 100,
            "CD": 400,
            "D": 500,
            "CM": 900,
            "M": 1000,
        }
        
        answer = 0
        i = 0

        while i < len(s):
            if i < len(s) - 1 and s[i] + s[i + 1] in data:
                # print(s[i] + s[i + 1])
                answer += data[s[i] + s[i + 1]]
                i += 2
            else:
                answer += data[s[i]]
                # print(i, s[i], answer)
                i+=1

        return answer
