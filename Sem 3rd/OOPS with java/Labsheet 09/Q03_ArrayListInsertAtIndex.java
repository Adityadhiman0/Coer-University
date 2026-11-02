import java.util.ArrayList;

// Q3. Insert an element at a specific index in an ArrayList.
public class Q03_ArrayListInsertAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println("Before insertion: " + list);

        // Insert 3 at index 2; elements from index 2 onward shift right
        list.add(2, 3);
        System.out.println("After inserting 3 at index 2: " + list);

        // Insert at the beginning
        list.add(0, 0);
        System.out.println("After inserting 0 at index 0: " + list);
    }
}
