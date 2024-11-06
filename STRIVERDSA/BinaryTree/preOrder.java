package STRIVERDSA.BinaryTree;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

public class preOrder {

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        preOrder(root);
    }
}
