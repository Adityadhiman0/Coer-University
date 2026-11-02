import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Q28. Convert a List to a Set and observe duplicate removal.
public class Q28_ListToSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        System.out.println("List (with duplicates): " + list + "  size = " + list.size());

        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set (duplicates removed): " + set + "  size = " + set.size());
    }
}
