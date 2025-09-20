class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        path_list = path.split("/")

        print(path_list)
        for i in range(len(path_list)):
            element = path_list[i]
            if element == "." or element == "":
                continue
            elif element == ".." and len(stack) >= 1:
                stack.pop()
                continue
            elif element == "..":
                continue
            stack.append(element)

        print(stack)

        ans = ""
        for element in stack:
            ans += "/" + element

        if len(stack) == 0:
            ans += "/"

        return ans
