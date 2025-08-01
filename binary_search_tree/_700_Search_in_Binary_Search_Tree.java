package binary_search_tree;

public class _700_Search_in_Binary_Search_Tree {

    static public class TreeNode {
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

    public static void main(String[] args) {
        _700_Search_in_Binary_Search_Tree parent = new _700_Search_in_Binary_Search_Tree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = parent.new Solution();
        solution.searchBST(root, 5);
    }

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null)
                return root;

            if (root.val == val)
                return root;
            else if (root.val > val)
                return searchBST(root.left, val);
            else
                return searchBST(root.right, val);
        }
    }

    //    wrong solution
    class Solution1 {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root.val == val)
                return root;
            else if (root.left != null && root.right.val > val)
                return searchBST(root.left, val);
            else return searchBST(root.right, val);
        }
    }
}
