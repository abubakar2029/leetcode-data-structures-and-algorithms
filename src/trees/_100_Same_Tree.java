package trees;

public class _100_Same_Tree {


    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // in recursion call both are at the end - successfully
            if (p == null && q == null)
                return true;

            // one of them is null - failure
            if (p == null || q == null)
                return false;

            // if vals are not same - failure
            if (p.val != q.val)
                return false;

            // not null and same val continue to next branches
            return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
        }
    }
}
