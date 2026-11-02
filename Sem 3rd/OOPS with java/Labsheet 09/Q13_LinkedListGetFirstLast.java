import java.util.LinkedList;

// Q13. Retrieve the first and last elements from a LinkedList.
public class Q13_LinkedListGetFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println("List: " + list);

        // getFirst()/getLast() only read the element; they do not remove it
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("List is unchanged: " + list);
    }
}
