import java.util.*;

public class _101_Symmetric_Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

// Left subtree
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

// Right subtree
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution.isSymmetric(root);
    }


    //    My first approach
    static class Solution {
        static public boolean isSymmetric(TreeNode root) {

            if (root.left.val == root.right.val)
                return helper(root.left, root.right);
            return false;
        }

        static public boolean helper(TreeNode n1, TreeNode n2) {
            // base condition
            if (n1 == null && n2 == null)
                return true;
            else if (n1 == null || n2 == null)
                return false;

            if (n1.left.val != n2.right.val || n1.right.val != n2.right.val)
                return false;

            return helper(n1.left, n2.right) && helper(n1.right, n2.left);
        }
    }

    //    Correct Solution
    class Solution2 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return false;

            return helper(root.left, root.right);
        }

        public boolean helper(TreeNode n1, TreeNode n2) {
            // base condition
            if (n1 == null && n2 == null)
                return true;
            else if (n1 == null || n2 == null)
                return false;

            if (n1.val != n2.val)
                return false;

            return helper(n1.left, n2.right) && helper(n1.right, n2.left);
        }
    }

    //    iterative approach
    class Solution3 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;

            Deque<TreeNode> deque = new LinkedList<>();
            deque.addLast(root.left);
            deque.addLast(root.right);

            while (!deque.isEmpty()) {
                TreeNode n1 = deque.pollFirst();
                TreeNode n2 = deque.pollFirst();

                if (n1 == null && n2 == null) continue;
                if (n1 == null || n2 == null || n1.val != n2.val) return false;

                deque.addLast(n1.left);
                deque.addLast(n2.right);
                deque.addLast(n1.right);
                deque.addLast(n2.left);
            }

            return true;
        }
    }

}
