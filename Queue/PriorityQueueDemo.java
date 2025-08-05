package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // creating  a empty PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding element
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(68);

        // Printing top element of PriorityQueue
        System.out.println(pq.peek()); // 10

        // Printing top element and remove it from the PriorityQueue
        System.out.println(pq.poll()); // 10

        // Printing top element of PriorityQueue again
        System.out.println(pq.peek()); // 20

        // Printing top element and remove it from the priorityQueue one by one
        while (!pq.isEmpty()){
            System.out.println(pq.poll()); // 20 40 68
        }

    }
}
