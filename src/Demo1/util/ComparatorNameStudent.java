package Demo1.util;

import Demo1.model.Student;

import java.util.Comparator;

public class ComparatorNameStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().equals(o2.getName())){
            if (o1.getScore()>o2.getScore()) return 1;
            else return -1;
        }else return o1.getName().compareTo(o2.getName());
    }
}
