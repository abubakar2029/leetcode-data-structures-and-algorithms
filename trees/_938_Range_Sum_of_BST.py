# My first approach: DFS
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        return self.dfs(root, 0, low, high)

    def dfs(self, node, ans, low, high):
        if not node:
            return 0

        if node.val >= low and node.val <= high:
            ans += node.val

        return (
            ans
            + self.dfs(node.left, 0, low, high)
            + self.dfs(node.right, 0, low, high)
        )

# Optimized DFS
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        return self.dfs(root, 0, low, high)

    def dfs(self, node, ans, low, high):
        if not node:
            return 0

        if node.val < low:
            return self.dfs(node.right, 0, low, high)
        if node.val > high:
            return self.dfs(node.left, 0, low, high)
        

        return (
            node.val
            + self.dfs(node.left, 0, low, high)
            + self.dfs(node.right, 0, low, high)
        )