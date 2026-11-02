import java.util.LinkedHashSet;

// Q19. Create a LinkedHashSet of strings and maintain insertion order.
public class Q19_LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Zebra");
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Apple");   // duplicate, ignored and order is not disturbed

        System.out.println("LinkedHashSet keeps insertion order: " + set);
    }
}
