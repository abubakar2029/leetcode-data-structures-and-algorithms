from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # store magazine in a dict
        # iterate over the ransomNote and decrease the values in magazine_dict

        magazine_count = Counter(magazine)

        for word in ransomNote:
            if word not in magazine_count or not magazine_count[word] > 0:
                return False
            magazine_count[word] = magazine_count[word] - 1

        return True