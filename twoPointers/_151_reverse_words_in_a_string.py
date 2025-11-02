class Solution:
    def reverseWords(self, s: str) -> str:
        # split the string by empty space
        # take two pointers (start + end)
        # replace starting word with ending word
        # do it until start < end
        
        input_list = s.split()

        s, e = 0, len(input_list) - 1

        while s < e:
            input_list[s], input_list[e] = input_list[e], input_list[s]
            s += 1
            e -= 1

        return " ".join(input_list)
