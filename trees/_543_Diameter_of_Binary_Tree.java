
public class _543_Diameter_of_Binary_Tree {


    class Solution {
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return max;
        }

        public int height(TreeNode root) {
            if (root == null)
                return -1;

            int leftHeight = height(root.left); // recursive call forheight of left sub-tree
            int rightHeight = height(root.right); // recursive call for height of right sub-tree

            int rootDiameter = leftHeight + rightHeight + 2;

            max = Math.max(rootDiameter, max);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
