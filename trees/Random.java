import java.util.ArrayList;
import java.util.*;

public class Random {


    public static void main(String[] args) {
        System.out.println("H");
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(20);
        root.right.left = new TreeNode(12);

        preOrder(root);
    }

    //    pre-order by stacks
    public static void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            System.out.println(node.val);

//            right first and then left, so that left is processed first
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }
}
