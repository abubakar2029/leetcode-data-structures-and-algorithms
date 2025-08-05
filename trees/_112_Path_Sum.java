public class _112_Path_Sum {

    //    Approach 1 - mistake is it stopped before leafNode
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;

            return helper(root, 0, targetSum);

        }

        public boolean helper(TreeNode node, int current, int targetSum) {
            if (node == null)
                return false;

            current += node.val;

            if (current == targetSum)
                return true;
            else if (current > targetSum)
                return false;
            else
                return helper(node.left, current, targetSum) || helper(node.right, current, targetSum);

        }
    }

    //    Approach 2 - all test cases passed
    class Solution2 {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;

            return helper(root, 0, targetSum);

        }

        public boolean helper(TreeNode node, int current, int targetSum) {
            if (node == null)
                return false;

            current += node.val;
            if (node.left == null && node.right == null) {
                if (current == targetSum)
                    return true;
            }

            return helper(node.left, current, targetSum) || helper(node.right, current, targetSum);

        }
    }
}
