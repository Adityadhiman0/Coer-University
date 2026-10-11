public class Medicine {
    private String name;
    private double price;
    private int quantity;

    // Parameterized constructor - 'this' distinguishes fields from parameters
    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Medicine : " + this.name);
        System.out.println("Price    : " + this.price);
        System.out.println("Quantity : " + this.quantity);
    }
}
