package trees;

import java.util.*;

public class _102_Binary_Tree_Level_Order_Traversal {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> traversal = new ArrayList<>();

            if (root == null)
                return traversal;

            Deque<TreeNode> que = new LinkedList<TreeNode>();

            que.addFirst(root);

            while (!que.isEmpty()) {
                List<Integer> subList = new ArrayList<>();
                // take size of level
                int levelSize = que.size();

                // iterate over the que by number of nodes currently present
                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = que.pollFirst();
                    subList.add(node.val);
                    if (node.left != null)
                        que.addLast(node.left);

                    if (node.right != null)
                        que.addLast(node.right);

                }

                traversal.add(subList);

            }

            return traversal;
        }
    }
}
