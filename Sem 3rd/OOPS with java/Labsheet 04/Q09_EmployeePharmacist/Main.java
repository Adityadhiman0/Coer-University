public class Main {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Neha Joshi", 45000, "PH-20260055");
        pharmacist.displayPharmacistDetails();
        pharmacist.dispenseMedicine("Paracetamol");
    }
}
