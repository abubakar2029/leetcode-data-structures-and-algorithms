package binary_search_tree;

public class _1008_Construct_Binary_Search_Tree_Preorder_Traversal {

    public static void main(String[] args) {
        _1008_Construct_Binary_Search_Tree_Preorder_Traversal parent = new _1008_Construct_Binary_Search_Tree_Preorder_Traversal();
        Solution solution = parent.new Solution();

        solution.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
    }

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


    //    INCORRECT solution
    class Solution1 {
        int index = 0;

        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = new TreeNode(preorder[index++]);

            // boundry for left-subtree
            int bound = 0;
            for (int i = 0; i < preorder.length; i++) {
                if (preorder[i] > root.val) {
                    bound = i - 1;
                    break;
                }
            }

            root.left = helper(preorder, bound, root);
            root.right = helper(preorder, preorder.length - 1, root);
            return root;
        }

        public TreeNode helper(int[] preorder, int bound, TreeNode root) {

            TreeNode node = new TreeNode(preorder[index++]);

            // base-condition
            if (index >= bound && node.val > root.val) {
                index--;
                return null;
            }

            node.left = helper(preorder, bound, node);
            node.right = helper(preorder, bound, node);

            return node;
        }
    }


    //    CORRECT SOLUTION
    class Solution {
        int index = 0;

        public TreeNode bstFromPreorder(int[] preorder) {
            return helper(preorder, Integer.MAX_VALUE);  // ∞ as initial bound
        }

        public TreeNode helper(int[] preorder, int bound) {
            if (index == preorder.length || preorder[index] > bound) {
                return null;
            }

            int val = preorder[index++];
            TreeNode node = new TreeNode(val);

            // Left subtree must be < val
            node.left = helper(preorder, val);

            // Right subtree must be < bound but > val
            node.right = helper(preorder, bound);

            return node;
        }
    }

}
