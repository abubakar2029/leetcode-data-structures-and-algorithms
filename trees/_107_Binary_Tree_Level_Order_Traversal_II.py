class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []

        result = []

        queue = []
        queue.append(root)

        while queue:
            k = len(queue)
            level = []

            for i in range(k):
                node = queue.pop(0)
                level.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            result.insert(0, level)

        return result
