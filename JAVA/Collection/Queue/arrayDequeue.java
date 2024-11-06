package JAVA.Collection.Queue;

import java.util.ArrayDeque;

public class arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque dq = new ArrayDeque();
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();
        ArrayDeque<Integer> dq2 = new ArrayDeque<>(10);

        dq1.add(10);
        dq1.add(30);
        dq1.add(100);

        System.out.println(dq1);
        System.out.println("Elements contains in deque: " + dq1.contains(30));
        System.out.println("Element return head: " + dq1.element());

        // forEach()
        dq1.forEach((value) -> System.out.print(value + " "));
    }
}
