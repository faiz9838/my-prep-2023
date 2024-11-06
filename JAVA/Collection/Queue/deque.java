package JAVA.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(20);
        deque.add(40);
        deque.add(60);
        System.out.println(deque);

        // removeFirst() => remove first element from deque
        int first = deque.removeFirst();
        System.out.println("Removed first element: " + first);

        // removeLast() => remove last element from deque
        int last = deque.removeLast();
        System.out.println("Removed last element: " + last);

        // offer() => add element into last position of deque
        deque.offer(1000);
        System.out.println(deque);

    }
}
