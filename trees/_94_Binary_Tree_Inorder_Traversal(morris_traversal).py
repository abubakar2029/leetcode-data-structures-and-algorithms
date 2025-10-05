# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        current = root

        while current:
            if not current.left:
                # Visit current node when no left subtree
                result.append(current.val)
                current = current.right
            else:
                # Find the inorder predecessor
                predecessor = current.left
                while predecessor.right and predecessor.right != current:
                    predecessor = predecessor.right

                # Create a temporary link
                if not predecessor.right:
                    predecessor.right = current
                    current = current.left
                else:
                    # Remove the link and visit node
                    predecessor.right = None
                    result.append(current.val)
                    current = current.right
        
        return result
