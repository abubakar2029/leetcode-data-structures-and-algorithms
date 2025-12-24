class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_to_t = {}
        t_to_s = {}

        for e1, e2 in zip(s, t):
            # check 1
            if e1 in s_to_t:
                if s_to_t[e1] != e2:
                    return False
            else:
                s_to_t[e1] = e2

            # check 2
            if e2 in t_to_s:
                if t_to_s[e2] != e1:
                    return False
            else:
                t_to_s[e2] = e1
        return True

    # APPROACH 2
    class Solution2:
        def isIsomorphic(self, s: str, t: str) -> bool:
            s_to_t = {}
            # t_to_s = {}

            for e1, e2 in zip(s, t):
                # check 1
                if e1 in s_to_t:
                    if s_to_t[e1] != e2:
                        return False
                else:
                    if e2 in s_to_t.values():
                        return False
                    s_to_t[e1] = e2

                # check 2
                # if e2 in t_to_s:
                #     if t_to_s[e2] != e1:
                #         return False
                # else:
                #     t_to_s[e2] = e1
            return True
