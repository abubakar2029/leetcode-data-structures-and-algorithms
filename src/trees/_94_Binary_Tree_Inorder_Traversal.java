package trees;

import java.util.*;

public class _94_Binary_Tree_Inorder_Traversal {

    //    My first approach
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> inorderList = new ArrayList<>();
            helper(root, inorderList);
            return inorderList;
        }

        public void helper(TreeNode node, ArrayList<Integer> list) {
            if (node == null)
                return;

            if (node.left == null && node.right == null) {
                list.add(node.val);
                return;
            }
            if (node.left != null) {
                helper(node.left, list);
            }
            list.add(node.val);
            if (node.right != null)
                helper(node.right, list);
        }
    }

    //    An optimized Code
    class Solution2 {
        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> inorderList = new ArrayList<>();
            helper(root, inorderList);
            return inorderList;
        }

        public void helper(TreeNode node, ArrayList<Integer> list) {
            if (node == null)
                return;

            helper(node.left, list);

            list.add(node.val);
            helper(node.right, list);
        }
    }

}
