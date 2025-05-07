package trees;

public class _653_Two_Sum_IV_Input_is_a_BST {


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


    //  Syntax errors and wrong approach
    class Solution1 {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }

            // extracting out both the values
            int leftVal;
            int rightVal;
            if (root.left == null) {
                leftVal = root.left.val;
            }
            if (root.right != null) {
                rightVal = root.right.val;
            }

            return leftVal + rightVal == k ? true : findTarget(root.left, k) || findTarget(root.right, k);
        }
    }
}
