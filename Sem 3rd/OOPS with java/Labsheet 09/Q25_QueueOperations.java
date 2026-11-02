import java.util.LinkedList;
import java.util.Queue;

// Q25. Demonstrate adding, removing, and peeking elements in a Queue.
public class Q25_QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println("After offer(): " + queue);

        // Peeking
        System.out.println("peek(): " + queue.peek() + "  -> queue: " + queue);

        // Removing
        System.out.println("poll(): " + queue.poll() + "  -> queue: " + queue);
        System.out.println("poll(): " + queue.poll() + "  -> queue: " + queue);

        System.out.println("peek(): " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}
