package binary_search_tree;

public class _701_Insert_into_Binary_Search_Tree {

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

    //    INCORRECT SOLUTION - passed 10 test cases
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            TreeNode node;

            // base-condition
            if (root == null) {
                node = new TreeNode(val);
                node.left = null;
                node.right = null;
                return node;
            } else if (root.val < val) {
                node = new TreeNode(val);
                node.left = root;
                node.right = root.right;
                root.right = null;
                return node;
            }

            root.left = insertIntoBST(root.left, val);

            return root;
        }
    }
}
