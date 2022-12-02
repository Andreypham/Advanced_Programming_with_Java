package Demo1.service.Impl;

import Demo1.model.Student;
import Demo1.service.IStudentService;
import Demo1.util.StudentReadAndWriteFileCSV;

import java.io.IOException;
import java.util.List;

public class StudentService implements IStudentService {

    @Override
    public void display() throws IOException {
        List<Student> studentList = StudentReadAndWriteFileCSV.readFieCSV();
        System.out.println("-----List Student -----");
        if (studentList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Student student : studentList) {
                System.out.println(student.getInfo());
            }
        }
        System.out.println("------------------------");
    }

    @Override
    public void addNew() throws IOException {

    }

    @Override
    public void update() throws IOException {

    }

    @Override
    public void delete() throws IOException {

    }
}
