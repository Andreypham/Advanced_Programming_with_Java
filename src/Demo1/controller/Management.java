package Demo1.controller;

import Demo1.model.Student;
import Demo1.model.Teacher;
import Demo1.util.TeacherReadAndWriteFileCSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Management {
    public static void main(String[] args) throws IOException {
        List<Teacher> teachers = new ArrayList<>();
//        teachers.add(new Teacher("Khanh",31,"male",500));
//        teachers.add(new Teacher("Duc",30,"male",400));
//        teachers.add(new Teacher("Nhat",35,"male",700));


        List<Student> students = new ArrayList<>();
//        students.add(new Student("Nhan", 21,"Male", 9.0));
//        students.add(new Student("Van", 23,"Female", 9.5));
//        students.add(new Student("Dung", 18,"Male", 8.5));

        teachers = TeacherReadAndWriteFileCSV.readFieCSV();
        teachers.add(new Teacher("Quang",27,"male",700));

        for(Teacher teacher: teachers){
            System.out.println(teacher.getInfo());
        }

        TeacherReadAndWriteFileCSV.writeFileCSV(teachers);

//        for(Student student:students){
//            System.out.println(student.getInfo());
//        }
    }
}
