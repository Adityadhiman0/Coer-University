import java.util.Objects;

public class Department {
    protected int deptId;
    protected String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void display() {
        System.out.println("Department ID: " + deptId + ", Name: " + deptName);
    }

    // equals() and hashCode() let Department work properly as a HashMap key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        return this.deptId == ((Department) o).deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId);
    }
}
