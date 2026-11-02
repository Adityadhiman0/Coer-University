import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author);
    }

    // Two books are "the same" when they have the same id.
    // Without equals() and hashCode(), HashSet would treat every object as different.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
