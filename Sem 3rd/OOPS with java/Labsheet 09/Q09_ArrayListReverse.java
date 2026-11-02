import java.util.ArrayList;
import java.util.Collections;

// Q9. Reverse an ArrayList of strings.
public class Q09_ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        System.out.println("Original: " + words);

        Collections.reverse(words);
        System.out.println("Reversed: " + words);
    }
}
