public class Inventory {
    // The array and the loop that walks it both belong here, not in main
    private MedicineStock[] stocks;

    public Inventory() {
        stocks = new MedicineStock[]{
            new MedicineStock("Paracetamol", 120),
            new MedicineStock("Amoxicillin", 45),
            new MedicineStock("Cough Syrup", 30),
            new MedicineStock("Vitamin C", 80)
        };
    }

    public void displayAll() {
        System.out.println("Pharmacy Inventory:");
        for (MedicineStock stock : stocks) {
            stock.display();
        }
    }
}
