package users;

public class Lecturer extends User {
    private final String faculty;
    private final String officeNumber;

    public Lecturer(String userId, String name, String email, String password,
                  String faculty, String officeNumber) {
        super(userId, name, email, password);
        this.faculty = faculty;
        this.officeNumber = officeNumber;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requests transport for official duty");
    }

    public String getFaculty() { return faculty; }
    public String getOfficeNumber() { return officeNumber; }
}