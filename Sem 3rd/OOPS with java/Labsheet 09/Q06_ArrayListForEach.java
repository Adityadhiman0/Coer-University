import java.util.ArrayList;

// Q6. Iterate through an ArrayList using a for-each loop.
public class Q06_ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");
        subjects.add("Operating Systems");

        System.out.println("Subjects:");
        for (String subject : subjects) {
            System.out.println(" - " + subject);
        }
    }
}
