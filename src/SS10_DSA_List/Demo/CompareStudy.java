package SS10_DSA_List.Demo;

import SS10_DSA_List.Demo.NameComparator;
import SS10_DSA_List.Demo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudy {
    // Sắp xếp theo tên tăng dần => sử dụng cách nào cũng được
//    Comparable => compareTo
    //Comparator => compare

    public static void main(String[] args) {
//        System.out.printf("%d\n", (int)'A');
//        System.out.printf("%d\n", (int)'Ở');

//        String str1 = "Namxxx";
//        String str2 = "Nam";

//        System.out.println(str1.compareTo(str2));

        List<Student> students = new ArrayList<>();

        students.add(new Student("Huan", 2));
        students.add(new Student("Ham", 9));
        students.add(new Student("Loi", 1));
        students.add(new Student("Tien", 8));
//        Collections.sort(students); => tăng dần
//        Collections.sort(students, Comparator.reverseOrder()); => giảm dần

//        students.sort(Comparator.naturalOrder());
//        students.sort(Comparator.reverseOrder());
// Sắp xếp theo score


        System.out.println("======== Menu ========");
        System.out.println("1. Sắp xếp theo điểm");
        System.out.println("2. Sắp xếp theo tên");


        int chose = 2;
        switch (chose) {
            case 1:
                Collections.sort(students);
                System.out.println(students);
                break;
            case 2:
                Collections.sort(students, new NameComparator());
                System.out.println(students);
                break;
        }


    }

}