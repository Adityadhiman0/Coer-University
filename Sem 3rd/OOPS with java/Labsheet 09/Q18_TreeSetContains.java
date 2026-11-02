import java.util.TreeSet;

// Q18. Check if a TreeSet contains a specific element.
public class Q18_TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(15);
        set.add(25);
        set.add(35);
        System.out.println("TreeSet: " + set);

        int[] toCheck = {15, 20, 35};
        for (int n : toCheck) {
            if (set.contains(n)) {
                System.out.println(n + " is present in the TreeSet");
            } else {
                System.out.println(n + " is NOT present in the TreeSet");
            }
        }
    }
}
