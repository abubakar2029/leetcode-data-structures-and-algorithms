public class _99_Recover_BST {
    public static void main(String[] args) {
        // Create example 2 tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

//        System.out.println("Inorder before recovery:");
//        printInorder(root);
//        System.out.println();

        // Recover BST
        Solution sol = new Solution();
        sol.recoverTree(root);

        System.out.println("Inorder after recovery:");
        printInorder(root);
        System.out.println();
    }

    // Utility method to print inorder traversal
    public static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Solution class
    static class Solution {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        public void recoverTree(TreeNode root) {
            inorder(root);
            // Swap the values of the two wrong nodes
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        private void inorder(TreeNode node) {
            if (node == null) return;

            inorder(node.left);

            // Detect violation
            if (prev.val >= node.val) {
                if (first == null) {
                    first = prev; // first wrong node
                }
                second = node; // second wrong node
            }
            prev = node;

            inorder(node.right);
        }
    }
}
