import java.util.ArrayList;

// Q2. Add elements to an ArrayList and display its size.
public class Q02_ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial size: " + fruits.size());

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Elements: " + fruits);
        System.out.println("Size after adding elements: " + fruits.size());
    }
}
