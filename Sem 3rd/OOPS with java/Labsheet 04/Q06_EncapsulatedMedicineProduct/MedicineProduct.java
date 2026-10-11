public class MedicineProduct {
    // All fields are private - fully encapsulated
    private String productName;
    private String batchNumber;
    private double price;
    private int stock;

    public MedicineProduct(String productName, String batchNumber, double price, int stock) {
        this.productName = productName;
        this.batchNumber = batchNumber;
        this.price = price;
        this.stock = stock;
    }

    // Getters - the only way outside code can read the private data
    public String getProductName() { return productName; }
    public String getBatchNumber() { return batchNumber; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setters - the only way outside code can modify the private data
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price ignored for " + productName);
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock ignored for " + productName);
        }
    }

    // The class displays its own data - nobody reaches in from outside
    public void display() {
        System.out.println("Product : " + productName);
        System.out.println("Batch   : " + batchNumber);
        System.out.println("Price   : " + price);
        System.out.println("Stock   : " + stock);
    }
}
