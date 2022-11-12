package SS10_DSA_List.Demo;

public class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /*
    0 : Không làm gì cả
    >= 1: Sắp xếp
    <= -1: Không sắp xếp => Ứng dụng trong Collections.reverseOrder()
     */
    // Sắp xếp theo điểm tăng dần
    @Override
    public int compareTo(Student o) {
        //this => phần tử ở trước
        // o là phần tử ở sau
//        if (this.score > o.score) {
//            return 1;//sắp xếp
//        }
//        if (this.score < o.score) {
//            return -1; // Không sắp xếp
//        }
//        return 0;// Không sắp xếp

        return Double.compare(this.score, o.score);
    }
}