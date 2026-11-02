import java.util.HashSet;

// Q15. Remove an element from a HashSet.
public class Q15_HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        System.out.println("Original set: " + set);

        boolean removed = set.remove("Green");
        System.out.println("remove(\"Green\") returned: " + removed);
        System.out.println("Set after removal: " + set);

        boolean removedAgain = set.remove("Purple");
        System.out.println("remove(\"Purple\") returned: " + removedAgain + " (not present)");
    }
}
