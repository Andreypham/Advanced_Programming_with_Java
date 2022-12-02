package Case_Study.Models.Person;

public class Employee extends Person {
    private String employeeID;
    private String level;
    private String position;
    private double salary;

    public Employee(){

    }
    public Employee(String employeeID, String level, String position, double salary) {
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String fullName, String dateOfBirth, boolean gender, String identityCard, String phoneNumber, String email, String employeeID, String level, String position, double salary) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
