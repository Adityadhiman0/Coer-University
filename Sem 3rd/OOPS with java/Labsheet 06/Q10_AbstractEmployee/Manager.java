public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + " | Base: " + baseSalary
                + " | Bonus: " + bonus + " | Total Salary: " + calculateSalary());
    }
}
