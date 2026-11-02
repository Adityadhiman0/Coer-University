public class Teacher extends Department {
    private int teacherId;
    private String teacherName;

    public Teacher(int deptId, String deptName, int teacherId, String teacherName) {
        super(deptId, deptName);
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public void display() {
        System.out.println("  Teacher ID: " + teacherId + ", Name: " + teacherName + " (Dept: " + deptName + ")");
    }
}
