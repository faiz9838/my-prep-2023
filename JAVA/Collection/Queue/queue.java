package JAVA.Collection.Queue;

import java.util.PriorityQueue;

public class queue {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        PriorityQueue q = new PriorityQueue<>();
        q.add("A");
        q.add("B");
        q.add("C");

        q.offer("D");

        System.out.println(q);

        // get head element, element(), peek()
        System.out.println(q.element());
        System.out.println(q.peek());

        // remove()
        System.out.println(q.remove());
        System.out.println(q);

    }
}
