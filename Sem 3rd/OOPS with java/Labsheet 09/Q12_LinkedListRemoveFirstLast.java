import java.util.LinkedList;

// Q12. Remove the first and last elements from a LinkedList.
public class Q12_LinkedListRemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Original list: " + list);

        String first = list.removeFirst();
        System.out.println("Removed first element: " + first);
        System.out.println("List now: " + list);

        String last = list.removeLast();
        System.out.println("Removed last element: " + last);
        System.out.println("List now: " + list);
    }
}
