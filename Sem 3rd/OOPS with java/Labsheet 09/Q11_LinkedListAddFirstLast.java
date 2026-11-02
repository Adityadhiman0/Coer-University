import java.util.LinkedList;

// Q11. Add elements at the beginning and end of a LinkedList.
public class Q11_LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Middle");
        System.out.println("Initial list: " + list);

        list.addFirst("Start");
        System.out.println("After addFirst(\"Start\"): " + list);

        list.addLast("End");
        System.out.println("After addLast(\"End\"): " + list);
    }
}
