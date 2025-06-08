package trees.binaryTrees;

import java.util.*;

public class LevelOrderTraversal {

    // Make TreeNode static so it can be accessed inside main
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if (root == null) return result;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {
                int levelSize = q.size();
                List<Integer> level = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = q.poll();
                    level.add(node.val);

                    if (node.left != null) {
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        q.offer(node.right);
                    }
                }

                result.add(level);
            }

            return result;
        }
    }

    // static main method for testing
    public static void main(String[] args) {
        // Build the tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        Solution solution = new Solution();
        List<List<Integer>> levels = solution.levelOrder(root);

        // Print result
        System.out.println("Level Order Traversal:");
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }
}
