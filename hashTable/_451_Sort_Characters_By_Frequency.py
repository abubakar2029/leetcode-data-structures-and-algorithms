class Solution:
    def frequencySort(self, s: str) -> str:
        # track max freq
        # build new string according to the frequency

        freq = Counter(s)

        # for element,count in freq.most_common():
        #     print(element)

        # print(freq)

        new_str = "".join([ch * count for ch, count in freq.most_common()])

        return new_str
