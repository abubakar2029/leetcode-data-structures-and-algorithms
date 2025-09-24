class Solution:
    ptr = 0
    dic = {}

    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        n = len(postorder)
        self.ptr = n - 1  # last element is the root

        for i in range(n):
            self.dic[inorder[i]] = i

        return self.build(inorder, postorder, 0, n - 1)

    def build(self, inorder, postorder, left, right):
        if left > right:
            return None

        node = TreeNode(postorder[self.ptr])

        self.ptr -= 1

        inorderIndex = self.dic[node.val]

        node.right = self.build(inorder, postorder, inorderIndex + 1, right)
        node.left = self.build(inorder, postorder, left, inorderIndex - 1)

        return node
