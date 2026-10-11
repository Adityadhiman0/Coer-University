public class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: " + name + " | Rate: " + hourlyRate
                + "/hr | Hours: " + hoursWorked + " | Total Salary: " + calculateSalary());
    }
}
