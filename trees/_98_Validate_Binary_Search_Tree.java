public class _98_Validate_Binary_Search_Tree {

    //    Approach 2 - passed
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public boolean helper(TreeNode node, long min, long max) {
            if (node == null)
                return true;

            if (node.val <= min || node.val >= max)
                return false;

            // if (node.left == null && node.right == null)
            //     return true;

            return helper(node.left, min, node.val) && helper(node.right, node.val, max);
        }
    }

    //  Approach 1 - not checing single null nodes
    class Solution1 {
        public boolean isValidBST(TreeNode root) {
            TreeNode left = root.left;
            TreeNode right = root.right;


            if (left == null && right == null)
                return true;

            return (left.val < root.val && right.val > root.val) && isValidBST(left) && isValidBST(right);
        }
    }
}
