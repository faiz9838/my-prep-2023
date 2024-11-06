package JAVA.Collection.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class arrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue_1 = new ArrayBlockingQueue(10);
        ArrayBlockingQueue<Integer> queue_2 = new ArrayBlockingQueue<>(10, true, queue_1);

        // adding element
        queue_1.offer(40);
        queue_1.offer(60);
        queue_1.offer(100);

        System.out.println("ArrayBlockingQueue: " + queue_1);

        // removing element
        queue_1.remove();
        System.out.println("ArrayBlockingQueue after removing element: " + queue_1);

        System.out.println("Peek element is: " + queue_1.peek());

        // Iterator

        java.util.Iterator<Integer> it = queue_1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
