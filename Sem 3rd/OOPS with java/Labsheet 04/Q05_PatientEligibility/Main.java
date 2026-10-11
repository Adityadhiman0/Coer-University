public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ananya", 8, false);
        Patient p2 = new Patient("Rajesh Kumar", 65, true);
        Patient p3 = new Patient("Priya Singh", 30, true);
        Patient p4 = new Patient("Mohit", 35, false);

        p1.checkEligibility();
        p2.checkEligibility();
        p3.checkEligibility();
        p4.checkEligibility();
    }
}
