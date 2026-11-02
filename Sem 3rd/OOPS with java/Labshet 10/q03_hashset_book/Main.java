import java.util.HashSet;

// Q3. HashSet avoids duplicate books (same ID).
public class Main {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        System.out.println("add(101): " + books.add(new Book(101, "Java: The Complete Reference", "Herbert Schildt")));
        System.out.println("add(102): " + books.add(new Book(102, "Effective Java", "Joshua Bloch")));
        System.out.println("add(103): " + books.add(new Book(103, "Head First Java", "Kathy Sierra")));

        // Duplicate: same ID 101 even though title and author differ
        System.out.println("add(101 again): " + books.add(new Book(101, "Duplicate Book", "Someone Else")));

        System.out.println("\nTotal books stored: " + books.size() + " (duplicate was not added)");
        System.out.println("\n--- Book details ---");
        for (Book b : books) {
            b.display();
        }
    }
}
