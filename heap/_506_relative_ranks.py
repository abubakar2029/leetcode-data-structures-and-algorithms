from typing import List

class Solution1:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        # copy of Array ko sort kr lo (desc. order)
        # value:index ka dict bna lo
        # original sa iterate kro or conditions sa unha rank kr do
        # answer bna do
        reverse = sorted(score, reverse=True)
        answer = [0] * len(score)
        dic = {value: index for index, value in enumerate(reverse, 1)}
        print(dic)

        for i, v in enumerate(score):
            if dic[v] == 1:
                answer[i] = "Gold Medal"
            elif dic[v] == 2:
                answer[i] = "Silver Medal"
            elif dic[v] == 3:
                answer[i] = "Bronze Medal"
            else:
                answer[i] = str(dic[v])

        return answer

