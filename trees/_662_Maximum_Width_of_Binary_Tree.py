class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        queue = deque()
        queue.append({"node": root, "index": 0})
        max_width = 0

        while queue:
            k = len(queue)
            peek = queue[0]
            last = queue[-1]
            current_width = (last["index"] - peek["index"]) + 1
            max_width = max(max_width, current_width)

            for i in range(k):
                element = queue.popleft()

                if element["node"].left:
                    queue.append(
                        {"node": element["node"].left, "index": element["index"] * 2 + 1}
                    )
                if element["node"].right:
                    queue.append(
                        {"node": element["node"].right, "index": element["index"] * 2 + 2}
                    )

        return max_width
