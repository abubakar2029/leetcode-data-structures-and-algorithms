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

    int[] sequence = {1, -1, 2, 3, -1, -1, 4, 5, -1, -1, -1};
    int index = -1;

    public static void main(String[] args) {
        TreeBuilding tb = new TreeBuilding();
        Index index = new Index();
        Node root = tb.buildTree();
        tb.preOrder(root);
//        Node root = tb.buildTree(tb.sequence, index);
    }

    Node buildTree() {
        index++;

        if (index >= sequence.length || sequence[index] == -1) {
            return null;
        }


        Node root = new Node(sequence[index]);

//        root.data(sequence[index]);

        root.left = buildTree();
        root.right = buildTree();

        return root;
    }

    void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " -> ");

        preOrder(root.left);
        preOrder(root.right);
    }

    static class Index {
        int value = 0;
    }

//    Node buildTree(int[] sequence, Index index) {
//        if (index.value >= sequence.length || sequence[index.value] == -1) {
//            index.value++;
//            return null;
//        }
//
//        Node newNode = new Node(sequence[index.value]);
//        index.value++;
//        newNode.left = buildTree(sequence, index);
//        newNode.right = buildTree(sequence, index);
//
//        return newNode;
//    }

}


