package trees;

public class _222_Count_Complete_Tree_Nodes {

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

    class Solution {
        public int countNodes(TreeNode root) {
            // edge case 
            if (root == null)
                return 0;

            return (countNodes(root.left) + countNodes(root.right)) + 1;
        }
    }
}
