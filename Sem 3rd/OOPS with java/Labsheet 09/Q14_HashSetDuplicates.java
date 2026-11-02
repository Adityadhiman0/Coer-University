import java.util.HashSet;

// Q14. Create a HashSet of integers and add duplicate elements. Observe the result.
public class Q14_HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("add(10): " + set.add(10));
        System.out.println("add(20): " + set.add(20));
        System.out.println("add(30): " + set.add(30));
        System.out.println("add(10) again: " + set.add(10));   // duplicate -> false
        System.out.println("add(20) again: " + set.add(20));   // duplicate -> false

        System.out.println("HashSet contents: " + set);
        System.out.println("Size: " + set.size() + " (duplicates were ignored)");
    }
}
