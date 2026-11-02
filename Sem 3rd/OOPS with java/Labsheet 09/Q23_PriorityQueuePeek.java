import java.util.PriorityQueue;

// Q23. Peek the first element of a PriorityQueue without removing it.
public class Q23_PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(60);
        pq.add(20);
        pq.add(40);
        pq.add(10);

        System.out.println("Size before peek: " + pq.size());
        System.out.println("peek(): " + pq.peek());
        System.out.println("Size after peek: " + pq.size() + " (nothing was removed)");
    }
}
