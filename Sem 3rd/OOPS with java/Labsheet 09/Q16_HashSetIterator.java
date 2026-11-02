import java.util.HashSet;
import java.util.Iterator;

// Q16. Iterate through a HashSet using Iterator.
public class Q16_HashSetIterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Pune");
        set.add("Jaipur");

        Iterator<String> it = set.iterator();
        System.out.println("Iterating over HashSet (order is not guaranteed):");
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }
    }
}
