package trees.binaryTrees;

public class TreeBuilding {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    int[] sequence = {1, -1, -1, -1, 2, 3, -1, -1, 4, -1, -1};

    int index = -1;

    Node buildTree(Node root) {
        if (index >= sequence.length || sequence[index] == -1) {
            return null;
        }

        index++;

        Node newNode = new Node(sequence[index]);

//        root.data(sequence[index]);

        buildTree(root.left);
        buildTree(root.right);

        return root;
    }
}
