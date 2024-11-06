package STRIVERDSA.LinkedList.Questions;

class Node {
    Node next;
    int data;

    Node() {
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class add2List {

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node();
        Node temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            Node node = new Node(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        Node l2 = new Node(2);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

        print(l1);

        print(l2);

        Node head = addTwoNumbers(l1, l2);
        print(head);

    }
}