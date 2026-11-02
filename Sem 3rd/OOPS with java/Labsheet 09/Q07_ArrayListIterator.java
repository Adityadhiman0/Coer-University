import java.util.ArrayList;
import java.util.Iterator;

// Q7. Iterate through an ArrayList using an Iterator.
public class Q07_ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        Iterator<Integer> it = list.iterator();
        System.out.println("Iterating using Iterator:");
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(" - " + value);
        }
    }
}
