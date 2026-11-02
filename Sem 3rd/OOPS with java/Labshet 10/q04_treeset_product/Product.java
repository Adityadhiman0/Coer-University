public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product() {
        this(0, "Unknown", 0.0);
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Sort by price. If two products cost the same, fall back to id so that
    // TreeSet does not treat them as duplicates and silently drop one.
    @Override
    public int compareTo(Product other) {
        int result = Double.compare(this.price, other.price);
        if (result == 0) {
            result = Integer.compare(this.id, other.id);
        }
        return result;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}
