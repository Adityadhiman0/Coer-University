import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Q29. Convert a Set to a List and iterate through it.
public class Q29_SetToList {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        System.out.println("Set: " + set);

        List<String> list = new ArrayList<>(set);
        System.out.println("List created from the set: " + list);

        // A List supports index-based access, which a Set does not
        System.out.println("Iterating through the list with indexes:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" [" + i + "] " + list.get(i));
        }
    }
}
