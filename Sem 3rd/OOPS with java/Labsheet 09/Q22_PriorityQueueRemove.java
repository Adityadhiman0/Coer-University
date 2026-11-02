import java.util.PriorityQueue;

// Q22. Remove elements from a PriorityQueue and observe the order.
public class Q22_PriorityQueueRemove {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(35);
        pq.add(5);
        pq.add(25);
        pq.add(15);
        pq.add(45);
        System.out.println("PriorityQueue: " + pq);

        System.out.println("Removing elements with poll():");
        while (!pq.isEmpty()) {
            System.out.println(" - " + pq.poll());   // always the smallest remaining element
        }
        System.out.println("Elements come out in ascending order (natural ordering).");
    }
}
