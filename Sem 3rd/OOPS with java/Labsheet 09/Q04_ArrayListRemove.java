import java.util.ArrayList;

// Q4. Remove an element from an ArrayList by index and by value.
public class Q04_ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original list: " + list);

        // Remove by index (int argument)
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // Remove by value (must pass an Integer object, not an int)
        list.remove(Integer.valueOf(40));
        System.out.println("After removing the value 40: " + list);
    }
}
