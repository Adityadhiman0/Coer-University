import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Q20. Compare HashSet, LinkedHashSet, and TreeSet by printing elements.
public class Q20_CompareSets {
    public static void main(String[] args) {
        String[] data = {"Orange", "Apple", "Mango", "Banana", "Grapes", "Apple"};

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String s : data) {
            hashSet.add(s);
            linkedHashSet.add(s);
            treeSet.add(s);
        }

        System.out.println("Input order    : Orange, Apple, Mango, Banana, Grapes, Apple");
        System.out.println("HashSet        : " + hashSet + "   (no guaranteed order)");
        System.out.println("LinkedHashSet  : " + linkedHashSet + "   (insertion order)");
        System.out.println("TreeSet        : " + treeSet + "   (sorted order)");
    }
}
