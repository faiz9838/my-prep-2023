package STRIVERDSA.LinkedList.DoublyList;

class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.next = null;
    }
}

public class doublyList {

    public static Node insertAtFirst(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {

            head = newNode;
        }

        newNode.next = head;

        head.prev = newNode;
        head = newNode;

        return head;

    }

    public static Node insertAtTail(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
        temp = newNode;

        return head;
    }

    public static Node insertAtPos(Node head, int pos, int value) {
        Node current = head;

        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }

        Node newNode = new Node(value);
        newNode.next = current.next;
        newNode.prev = newNode;
        current.next = newNode;
        current.next.prev = newNode;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertAtFirst(head, 100);
        insertAtTail(head, 400);
        head = insertAtPos(head, 2, 1000);
        print(head);
    }
}
