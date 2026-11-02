import java.util.ArrayList;
import java.util.Collections;

// Q8. Sort an ArrayList of integers in ascending order.
public class Q08_ArrayListSortAscending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(3);
        list.add(56);
        list.add(21);
        System.out.println("Before sorting: " + list);

        Collections.sort(list);
        System.out.println("After sorting (ascending): " + list);
    }
}
