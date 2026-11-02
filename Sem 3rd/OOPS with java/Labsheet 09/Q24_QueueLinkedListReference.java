import java.util.LinkedList;
import java.util.Queue;

// Q24. Use a Queue interface reference to refer to a LinkedList. Add and remove elements.
public class Q24_QueueLinkedListReference {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue after adding: " + queue);

        System.out.println("Removed: " + queue.remove());   // removes the head (FIFO)
        System.out.println("Queue now: " + queue);

        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue now: " + queue);
    }
}
