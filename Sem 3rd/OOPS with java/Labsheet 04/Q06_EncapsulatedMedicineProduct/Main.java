public class Main {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Ibuprofen", "B2026-114", 45.0, 200);
        product.display();

        System.out.println("\nUpdating price and stock...");
        product.setPrice(50.0);
        product.setStock(180);
        product.display();
    }
}
