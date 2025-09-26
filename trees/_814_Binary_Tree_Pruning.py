class Solution:
    def pruneTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        # Post Order Traversal approach
        if not root.left and not root.right:
            return root if root.val == 1 else None

        if root.left:
            root.left = self.pruneTree(root.left)
        if root.right:
            root.right = self.pruneTree(root.right)

        if not root.left and not root.right and root.val == 0:
            return None

        return root
