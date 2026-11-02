import java.util.TreeSet;

// Q17. Create a TreeSet of integers and add elements in random order. Print the sorted set.
public class Q17_TreeSetSorted {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(10);   // duplicate, ignored

        System.out.println("Elements were added in the order: 50, 10, 40, 20, 30, 10");
        System.out.println("TreeSet (sorted): " + set);
    }
}
