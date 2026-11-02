import java.util.TreeSet;

// Q4. TreeSet keeps Product objects sorted by price.
public class Main {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(1, "Laptop", 55000.00));
        products.add(new Product(2, "Mouse", 499.99));
        products.add(new Product(3, "Keyboard", 1299.50));
        products.add(new Product(4, "Monitor", 12999.00));
        products.add(new Product(5, "Headphones", 2499.00));
        products.add(new Product(6, "Webcam", 2499.00));   // same price as Headphones

        System.out.println("Products in sorted order (by price):");
        for (Product p : products) {
            p.display();
        }

        System.out.println("\nCheapest product : " + products.first().getName());
        System.out.println("Costliest product: " + products.last().getName());
    }
}
