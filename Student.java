package users;

public class Student extends User {
    private final String studentId;
    private final String department;

    public Student(String userId, String name, String email, String password,
                 String studentId, String department) {
        super(userId, name, email, password);
        this.studentId = studentId;
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " requests transport to campus");
    }

    public String getStudentId() { return studentId; }
    public String getDepartment() { return department; }
}