package Demo1.model;

public class Teacher extends Person implements Comparable<Teacher>{
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo(){
        return String.format("%20s  |%10s |%10s  |%10s",getName(),getAge(),getGender(),getSalary());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",getName(),getAge(),getGender(),getSalary());
    }


    @Override
    public int compareTo(Teacher o) {
        if (getSalary() > o.getSalary()) return 1;
        else if(getSalary() < o.getSalary()) return -1;
        else return 1;
    }
}
