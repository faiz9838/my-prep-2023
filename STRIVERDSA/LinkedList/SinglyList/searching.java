class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class searching {

    public static int searchInSL(Node head, int value) {
        Node current = head;

        int count = 0;
        while (current != null) {
            count++;
            if (current.data == value) {
                return count + 1;

            }
            current = current.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);

        int answer = searchInSL(head, 20);
        System.out.print("Data is present in SL: " + answer);
    }
}
