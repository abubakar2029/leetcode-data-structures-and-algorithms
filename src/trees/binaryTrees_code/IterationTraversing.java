package trees.binaryTrees_code;

import java.util.*;

public class IterationTraversing {
    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        IterationTraversing parent = new IterationTraversing();
        Node root = parent.new Node(1);
        root.left = parent.new Node(2);
        root.right = parent.new Node(3);
        root.left.left = parent.new Node(4);
        root.right.left = parent.new Node(7);
        root.right.right = parent.new Node(6);

        List<Integer> preOrderList = parent.preOrderTraversal(root);
        List<Integer> inOrderList = parent.inorderTraversal(root);
        System.out.println("Pre-order traversal : " + preOrderList.toString());
        System.out.println("In-order traversal : " + inOrderList.toString());
    }

    //    pre-order traversing
    public List<Integer> preOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);

            list.add(node.val);

        }

        return list;
    }

    //    in-order traversing
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current is null at this point
            current = stack.pop();
            result.add(current.val);  // Visit the node
            current = current.right; // Move to the right subtree
        }

        return result;
    }
}
