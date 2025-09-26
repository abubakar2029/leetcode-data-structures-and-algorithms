class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        queue = deque()
        queue.append(root)

        result = []

        while queue:
            k = len(queue)
            level_sum = 0
            count = 0
            for i in range(k):
                node = queue.popleft()
                if node.right:
                    queue.append(node.right)
                if node.left:
                    queue.append(node.left)

                level_sum += node.val
                count += 1

            avg = level_sum / count
            result.append(avg)
        return result
