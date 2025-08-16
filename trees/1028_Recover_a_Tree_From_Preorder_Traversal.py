class Solution:
    def recoverFromPreorder(self, traversal: str) -> Optional[TreeNode]:
        self.index = 0  # keep track of parsing position
        n = len(traversal)

        def build(depth: int) -> Optional[TreeNode]:
            i = self.index
            d = 0
            # count dashes (depth)
            while i < n and traversal[i] == "-":
                i += 1
                d += 1

            # if depth doesn't match, stop recursion
            if d != depth:
                return None

            # parse number (node value)
            j = i
            while j < n and traversal[j].isdigit():
                j += 1
            val = int(traversal[i:j])

            # update index
            self.index = j

            # build node
            node = TreeNode(val)
            node.left = build(depth + 1)
            node.right = build(depth + 1)

            return node

        return build(0)
