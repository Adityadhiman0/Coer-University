public class MedicineStock {
    private String medicineName;
    private int unitsInStock;

    public MedicineStock(String medicineName, int unitsInStock) {
        this.medicineName = medicineName;
        this.unitsInStock = unitsInStock;
    }

    public void display() {
        System.out.println(medicineName + " -> " + unitsInStock + " units");
    }
}
