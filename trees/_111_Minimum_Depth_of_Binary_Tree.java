
public class _111_Minimum_Depth_of_Binary_Tree {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            return helper(root, 1);
        }

        public int helper(TreeNode node, int currentDistance) {
            if (node == null)
                return Integer.MAX_VALUE;

            if (node.left == null && node.right == null)
                return currentDistance;

            return Math.min(helper(node.left, currentDistance + 1), helper(node.right, currentDistance + 1));
        }
    }
}
