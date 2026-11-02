import java.util.Vector;

// Q7. Encapsulation (private fields + getters/setters) and Vector<Customer>.
public class Main {
    static void displayAll(Vector<Customer> customers) {
        for (Customer c : customers) {
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Email: " + c.getEmail());
        }
    }

    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();
        customers.add(new Customer(1, "Aarav Sharma", "aarav@example.com"));
        customers.add(new Customer(2, "Diya Verma", "diya@example.com"));
        customers.add(new Customer(3, "Kabir Singh", "kabir@example.com"));

        System.out.println("--- Customer details ---");
        displayAll(customers);

        // Using setters to change private data
        System.out.println("\n--- After updating customer 2 with setters ---");
        Customer c = customers.get(1);
        c.setName("Diya Mehra");
        c.setEmail("diya.mehra@example.com");
        displayAll(customers);

        System.out.println("\nTotal customers: " + customers.size());
    }
}
