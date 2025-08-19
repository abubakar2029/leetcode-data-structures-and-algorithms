import java.util.*;
public class _257_Binary_Tree_Paths {

    class Solution {
        List<String> ans = new ArrayList();

        public List<String> binaryTreePaths(TreeNode root) {
            helper(root, "");
            return ans;
        }

        public void helper(TreeNode node, String str) {
            if (node == null)
                return;

            // It is leaf node, so add it and return
            if (node.left == null && node.right == null) {
                str = str + node.val;
                ans.add(str);
                return;
            }
            str = str + node.val + "->";
            helper(node.left, str);
            helper(node.right, str);

        }
    }
}
