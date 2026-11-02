import java.util.PriorityQueue;

// Q21. Create a PriorityQueue of integers and add elements. Print the queue.
public class Q21_PriorityQueueAdd {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);

        // Printing shows the internal heap order, NOT fully sorted order.
        // Only the smallest element is guaranteed to be at the head.
        System.out.println("PriorityQueue (internal heap order): " + pq);
        System.out.println("Head of the queue (smallest): " + pq.peek());
    }
}
