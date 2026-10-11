public class Pharmacy {
    // static fields: one copy shared by every Pharmacy object
    private static String pharmacyName = "COER City Pharmacy";
    private static String location = "Roorkee, Uttarakhand";

    private String branchManager;

    public Pharmacy(String branchManager) {
        this.branchManager = branchManager;
    }

    public void display() {
        System.out.println("Branch Manager : " + branchManager);
        System.out.println("Pharmacy Name  : " + pharmacyName + "  (static - shared)");
        System.out.println("Location       : " + location + "  (static - shared)");
    }

    // Changes the static value through any one object/reference
    public static void changeLocation(String newLocation) {
        location = newLocation;
    }
}
