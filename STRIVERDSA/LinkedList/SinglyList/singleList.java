
class Node {
    // Data stored in the node
    int data;
    // Pointer to the next
    // node in the list
    Node next;

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singleList {

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static Node insertAtHead(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }

        Node temp = head;
        // newNode.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        temp = head;

        return head;
    }

    public static Node insertAtPosition(Node head, int value, int pos) {
        Node newNode = new Node(value);

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }

    public static Node deleteFirst(Node head) {
        if (head == null)
            return null;

        head = head.next;
        return head;
    }

    public static Node deleteLast(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static Node deleteAtPos(Node head, int pos) {
        Node temp = null;
        Node current = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = current;
            current = current.next;
        }

        temp.next = current.next;
        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Insertion operation
        head = insertAtHead(head, 500);
        head = insertAtTail(head, 1000);
        head = insertAtPosition(head, 2000, 1);
        print(head);

        System.out.println();
        // Deletion operation
        // head = deleteFirst(head);
        // head = deleteLast(head);\
        head = deleteAtPos(head, 3);
        print(head);
    }
}
