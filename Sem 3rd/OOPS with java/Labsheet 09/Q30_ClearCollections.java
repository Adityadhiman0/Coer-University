import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// Q30. Demonstrate clearing all elements from a List, Set, and Queue.
public class Q30_ClearCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Queue<Double> queue = new LinkedList<>();
        queue.add(1.1);
        queue.add(2.2);
        queue.add(3.3);

        System.out.println("Before clear():");
        System.out.println(" List  : " + list + " size = " + list.size());
        System.out.println(" Set   : " + set + " size = " + set.size());
        System.out.println(" Queue : " + queue + " size = " + queue.size());

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("\nAfter clear():");
        System.out.println(" List  : " + list + " size = " + list.size() + ", isEmpty = " + list.isEmpty());
        System.out.println(" Set   : " + set + " size = " + set.size() + ", isEmpty = " + set.isEmpty());
        System.out.println(" Queue : " + queue + " size = " + queue.size() + ", isEmpty = " + queue.isEmpty());
    }
}
