package Demo1.model;

public class Teacher extends Person implements Comparable<Teacher> {
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, String birthday, int age, String gender, double salary) {
        super(name, birthday, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return String.format("%20s    |%15s  |%10s |%10s  |%10s", getName(), getBirthday(), getWeight(), getGender(), getSalary());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", getName(), getBirthday(), getWeight(), getGender(), getSalary());
    }

    @Override
    public int compareTo(Teacher o) {
        if (getSalary() > o.getSalary()) return 1;
        else if (getSalary() < o.getSalary()) return -1;
        else return 0;
    }
}
