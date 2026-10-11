public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Sanjay Mehra", 80000, 15000),
            new Programmer("Aarav Sharma", 500, 160)
        };

        for (Employee employee : staff) {
            employee.displayInfo();
        }
    }
}
