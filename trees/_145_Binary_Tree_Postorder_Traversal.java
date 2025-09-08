import java.util.*;

public class _145_Binary_Tree_Postorder_Traversal {

    class Solution {
        List<Integer> ans;

        public List<Integer> postorderTraversal(TreeNode root) {
            ans = new ArrayList();
            helper(root);
            return ans;
        }

        public void helper(TreeNode node) {

            if (node == null)
                return;

            if (node.left != null)
                helper(node.left);

            if (!(node.right == null))
                helper(node.right);

            ans.add(node.val);

        }
    }
}
