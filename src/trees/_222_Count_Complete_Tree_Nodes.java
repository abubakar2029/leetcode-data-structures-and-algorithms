package trees;

public class _222_Count_Complete_Tree_Nodes {

    class Solution {
        public int countNodes(TreeNode root) {
            // edge case 
            if (root == null)
                return 0;

            return (countNodes(root.left) + countNodes(root.right)) + 1;
        }
    }
}
