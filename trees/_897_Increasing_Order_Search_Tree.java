public class _897_Increasing_Order_Search_Tree {
    class Solution {
        private TreeNode current;

        public TreeNode increasingBST(TreeNode root) {
            TreeNode dummy = new TreeNode(-1); // temp placeholder
            current = dummy;
            helper(root);
            return dummy.right;
        }

        private void helper(TreeNode node) {
            if (node == null)
                return;

            helper(node.left); // visit left

            node.left = null; // disconnect left
            current.right = node; // attach to chain
            current = node; // move pointer

            helper(node.right); // visit right
        }
    }

}
