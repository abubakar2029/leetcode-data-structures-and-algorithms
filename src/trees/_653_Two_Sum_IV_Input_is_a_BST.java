package trees;

import java.util.*;

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


    //    correct solution
    class Solution2 {

        // if use a helper mehod and send hashSet to it, it will make no difference in complexities as only reference of hashSet is passed in function calls
        Set<Integer> hashSet = new HashSet<>();

        public boolean findTarget(TreeNode root, int k) {
            if (root == null)
                return false;

            int value = root.val;
            if (hashSet.contains(k - value))
                return true;

            hashSet.add(value);

            return findTarget(root.left, k) || findTarget(root.right, k);
        }
    }

    //  wrong approach
    class Solution1 {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }

            // extracting out both the values
            int leftVal = 0;
            int rightVal = 0;
            if (root.left != null) {
                leftVal = root.left.val;
            }
            if (root.right != null) {
                rightVal = root.right.val;
            }

            if (rightVal + leftVal == k || root.val + leftVal == k || root.val + rightVal == k) {
                return true;
            }

            return findTarget(root.left, k) || findTarget(root.right, k);
        }
    }
}
