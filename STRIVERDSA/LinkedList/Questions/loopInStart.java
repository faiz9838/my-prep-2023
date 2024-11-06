package STRIVERDSA.LinkedList.Questions;

import java.util.HashSet;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class loopInStart {

    public static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // CREATING A CYCLE LOOP
    public static void createCycle(Node head, int pos) {
        Node ptr = head;
        Node temp = head;

        int cnt = 0;

        while (temp.next != null) {
            if (cnt != pos) {
                ++cnt;
                ptr = ptr.next;
            }
            temp = temp.next;
        }

        temp.next = ptr;
    }

    public static Node detectCycle(Node head) {
        HashSet<Node> st = new HashSet<>();

        while (head != null) {
            if (st.contains(head))
                return head;
            st.add(head);
            head = head.next;
        }
        return null;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        insertNode(head, 70);
        createCycle(head, 3);
        Node nodeRecieve = detectCycle(head);
        if (nodeRecieve == null)
            System.out.println("No cycle");
        else {
            Node temp = head;
            int pos = 0;

            while (temp != nodeRecieve) {
                ++pos;
                temp = temp.next;
            }
            System.out.println("Tail connects at pos " + pos);
        }

    }
}