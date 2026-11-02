import java.util.ArrayList;

// Q5. Update an element in an ArrayList at a given index.
public class Q05_ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        System.out.println("Before update: " + cities);

        // set(index, newValue) replaces the element and returns the old one
        String old = cities.set(1, "Kolkata");
        System.out.println("Replaced \"" + old + "\" at index 1");
        System.out.println("After update: " + cities);
    }
}
