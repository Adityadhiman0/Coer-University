public class Main {
    public static void main(String[] args) {
        Pharmacy branch1 = new Pharmacy("Riya Verma");
        Pharmacy branch2 = new Pharmacy("Karan Mehta");

        System.out.println("-- Before changing location --");
        branch1.display();
        branch2.display();

        // Changing the static value through branch1 affects branch2 as well,
        // because both objects share the same static copy.
        Pharmacy.changeLocation("Haridwar Road, Roorkee");

        System.out.println("\n-- After changing location via branch1 --");
        branch1.display();
        branch2.display();
    }
}
