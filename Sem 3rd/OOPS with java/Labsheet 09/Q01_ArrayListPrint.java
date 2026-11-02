import java.util.ArrayList;

// Q1. Create an ArrayList of integers and print all elements.
public class Q01_ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Elements of the ArrayList: " + numbers);
    }
}
