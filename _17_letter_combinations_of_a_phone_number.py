class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        # make a dictionary
        # split digits into an array
        # agar digit one ha to os ka map directly return krwa do
        # 2 pointers ka sath nested loop chla do -> on ka .items() sa iterate krwa do

        digit_map = {
            "2": ["a", "b", "c"],
            "3": ["d", "e", "f"],
            "4": ["g", "h", "i"],
            "5": ["j", "k", "l"],
            "6": ["m", "n", "o"],
            "7": ["p", "q", "r", "s"],
            "8": ["t", "u", "v"],
            "9": ["w", "x", "y", "z"],
        }

        digits = list(digits)

        n = len(digits)
        if n == 1:
            return digit_map[digits[0]]

        result = []

        for c1 in digit_map[digits[0]]:
            seq1 = c1
            for c2 in digit_map[digits[1]]:
                seq2 = seq1 + c2
                if n > 2:
                    for c3 in digit_map[digits[2]]:
                        seq3 = seq2 + c3
                        if n > 3:
                            for c4 in digit_map[digits[3]]:
                                seq4 = seq3 + c4
                                result.append(seq4)
                                continue
                        else:
                            result.append(seq3)
                            continue
                else:
                    result.append(seq2)

        return result
