package trees;

import java.util.*;

public class _144_Binary_Tree_Preorder_Traversal {


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

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();
            helper(root, list);
            return list;
        }

        public void helper(TreeNode root, List<Integer> list) {
            // base condition
            if (root == null)
                return;

            list.add(root.val);

            helper(root.left, list);
            helper(root.right, list);
        }
    }
}
