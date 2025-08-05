package Queue.Deque;

import java.util.ArrayDeque;

public class ArrayDeque_Demo {
    public static void main(String[] args) {

        // Initialization an Deque
        ArrayDeque<Integer> dq = new ArrayDeque<>(10);

        // add() method to insert
        dq.add(21);

        // addFirst() method to insert
        dq.addFirst(10);

        // offerFirst() method to insert
        dq.offerFirst(30);

        // addLast() method to insert
        dq.addLast(50);

        // getFirst() method to Retrives but does not remove first element
        System.out.println(dq.getFirst()); // 30

        // getLast() method to Retrives but does not remove last element
        System.out.println(dq.getLast()); // 50

        // removeFirst() method retrieves and remove the first element
        System.out.println(dq.removeFirst()); // 30

        // pollFirst() method retrieves and remove the first element, or return null if empty
        System.out.println(dq.pollFirst()); // 10
    }
}
