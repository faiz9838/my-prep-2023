package STRIVERDSA.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class levelOrder {

    public static List<List<Integer>> LevelOrder(Node root) {
        List<List<Integer>> wraplist = new LinkedList<>();

        if (root == null) {
            return wraplist;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < levelNum; i++) {
                Node node = queue.poll();
                sublist.add(node.data);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.left = new Node(70);

        List<List<Integer>> ans = LevelOrder(root);

        for (List<Integer> list : ans) {
            for (Integer list2 : list) {
                System.out.print(list2 + " ");
            }
        }
    }
}