/*
 * HYBRID INHERITANCE - CONCEPT ONLY
 * -----------------------------------
 * Hybrid inheritance is simply a combination of more than one type
 * of inheritance (e.g. hierarchical + multilevel, or hierarchical +
 * multiple) used together in the same class structure.
 *
 * A typical hybrid shape looks like this:
 *
 *                     Person
 *                    /      \
 *             Employee        Patient        <-- hierarchical part
 *                |
 *             Manager                        <-- multilevel part
 *
 * Person has two children (Employee and Patient) - that is the
 * "hierarchical" piece. Employee itself has a child, Manager - that
 * is the "multilevel" piece. Put together, the whole structure is
 * called hybrid inheritance.
 *
 * IMPORTANT: this hybrid shape only combines single-parent
 * relationships (each class still extends only ONE parent). It does
 * NOT require any class to extend two classes at once, so it is
 * completely legal in Java and needs no interfaces.
 *
 * A hybrid structure WOULD become illegal only if one of its
 * branches tried to merge back into a class that extends two
 * parents directly, e.g.:
 *
 *     class Manager extends Employee, Patient { }   // NOT legal Java
 *
 * That merging case is true multiple inheritance (see
 * MultipleInheritanceDemo in Q12) and is exactly what Java forbids.
 * The hybrid tree below avoids it by keeping every "extends" to a
 * single parent.
 */
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showPerson() {
        System.out.println("Person: " + name);
    }
}

// Hierarchical: first child of Person
class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void showEmployee() {
        showPerson();
        System.out.println("Salary: " + salary);
    }
}

// Hierarchical: second child of Person
class Patient extends Person {
    private String ailment;

    public Patient(String name, String ailment) {
        super(name);
        this.ailment = ailment;
    }

    public void showPatient() {
        showPerson();
        System.out.println("Ailment: " + ailment);
    }
}

// Multilevel: Manager extends Employee, which extends Person
// (still single inheritance at every step, combined into a hybrid tree)
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void showManager() {
        showEmployee();
        System.out.println("Department: " + department);
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Patient patient = new Patient("Ritu Das", "Fever");
        Manager manager = new Manager("Sanjay Mehra", 120000, "Administration");

        System.out.println("-- Patient branch (hierarchical) --");
        patient.showPatient();

        System.out.println("\n-- Manager branch (hierarchical + multilevel = hybrid) --");
        manager.showManager();
    }
}
