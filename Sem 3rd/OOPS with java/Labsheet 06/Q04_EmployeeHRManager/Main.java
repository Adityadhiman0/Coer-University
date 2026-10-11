public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul Verma", 35000);
        HRManager hrManager = new HRManager("Pooja Sharma", 65000);

        employee.work();
        System.out.println("Salary: " + employee.getSalary());

        System.out.println();

        hrManager.work();              // overridden version
        hrManager.addEmployee("Kiran Rao"); // new method, only on HRManager
        System.out.println("Salary: " + hrManager.getSalary()); // inherited, unchanged
    }
}
