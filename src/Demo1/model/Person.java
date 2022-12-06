package Demo1.model;

public abstract class Person {
    private String name;
    private String birthday;
    private int weight;
    private String gender;

    public Person() {
    }

    public Person(String name, String birthday, int weight, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int age) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
