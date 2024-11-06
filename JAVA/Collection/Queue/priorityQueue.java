package JAVA.Collection.Queue;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(pq);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10);

        pq.add(10);
        pq.add(30);
        pq.add(40);
        pq.add(60);

        System.out.println(pq.peek());
        System.out.println(pq.poll());

    }
}
