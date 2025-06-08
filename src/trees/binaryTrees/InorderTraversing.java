package trees.binaryTrees;

public class InorderTraversing {
    int[] sequence = {1, 2, -1, -1, 3, 4, -1, -1, 5};
//    int[] sequence = {3, 4, 14, 15, -1, -1, -1, 2, -1, -1, 12, -1, 13, 17, -1, 18, -1, -1};

    public static void main(String[] args) {
        InorderTraversing parent = new InorderTraversing();
        Node root = parent.buildTree();
        parent.inorderTraversal(root);
    }

    static class Index {
        static int index = -1;
    }

    // Make TreeNode static so it can be accessed inside main
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public Node buildTree() {
        Index.index++;
        if (Index.index >= sequence.length || sequence[Index.index] == -1) return null;

        Node root = new Node(sequence[Index.index]);

        root.left = buildTree();
        root.right = buildTree();

        return root;
    }

    void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.val + " -> ");
        inorderTraversal(root.right);
    }

}
