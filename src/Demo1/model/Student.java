package Demo1.model;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, String birthday, int age, String gender, double score) {
        super(name, birthday, age, gender);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
        return String.format("%20s   |%15s     |%10s   |%10s   |%10s", getName(), getBirthday(), getWeight(), getGender(), getScore());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", getName(), getBirthday(), getWeight(), getGender(), getScore());
    }
}
