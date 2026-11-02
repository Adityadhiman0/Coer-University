import java.util.LinkedList;

// Q10. Create a LinkedList of strings and print elements.
public class Q10_LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Neha");

        System.out.println("LinkedList elements: " + names);

        System.out.println("Printing one by one:");
        for (String name : names) {
            System.out.println(" - " + name);
        }
    }
}
