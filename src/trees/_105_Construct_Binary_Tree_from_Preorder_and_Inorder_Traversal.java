package trees;

import java.util.HashMap;
import java.util.Map;

public class _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal parent = new _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        Solution solution = parent.new Solution();

        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};

        TreeNode root = solution.buildTree(preorder, inorder);
    }

    class Solution {
        int preIndex = 0;
        Map<Integer, Integer> inorderMap = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {

//            for time-optimization making an index value table of inorder sequence
            for (int i = 0; i < inorder.length; i++) {
                inorderMap.put(inorder[i], i);
            }

            return build(preorder, 0, inorder.length-1);
        }

        public TreeNode build(int[] preorder, int left, int right) {

//            2 checks -> one is preIndex is within the bounds, and second is we have still elements in the left sub-tree
            if (left > right || preIndex > preorder.length - 1) return null;

            TreeNode root = new TreeNode(preorder[preIndex++]);

            int rootIndex = inorderMap.get(root.val);
            root.left = build(preorder, left, rootIndex - 1);
            root.right = build(preorder, rootIndex + 1, right);

            return root;
        }
    }
}
