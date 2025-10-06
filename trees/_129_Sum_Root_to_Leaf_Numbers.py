class Solution:
    total = 0

    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        def findPaths(node, prev):

            prev += str(node.val)

            if not node.left and not node.right:
                self.total += int(prev)
                return

            if node.left:
                findPaths(node.left, prev)
            if node.right:
                findPaths(node.right, prev)

        findPaths(root, "")
        return self.total
