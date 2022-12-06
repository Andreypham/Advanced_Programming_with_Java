package Demo1.service.Impl;

import Demo1.Validate.ValidationStudent;
import Demo1.model.Student;
import Demo1.service.IStudentService;
import Demo1.util.ComparatorNameStudent;
import Demo1.util.StudentReadAndWriteFileCSV;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
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
        // Step 1: read file CSV to collection
        List<Student> studentList = StudentReadAndWriteFileCSV.readFieCSV();
        // Step 2: Add New data
        studentList.add(ValidationStudent.infoStudent());
        // Step 3: write collection with new data to file CSV
        StudentReadAndWriteFileCSV.writeFileCSV(studentList);
    }

    @Override
    public void update() throws IOException {
        System.out.println("Enter student's name you want to edit:");
        String name = scanner.nextLine();
        boolean found = false;
        // Step 1: read file CSV to collection
        List<Student> studentList = StudentReadAndWriteFileCSV.readFieCSV();
        // Step 2: Edit data
        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getName())){
                studentList.set(i,ValidationStudent.infoStudent());
                found = true;
            }
        }
        if (found){
            System.out.println("Update student's info successful");
        }else{
            System.out.println("Student not found");
        }
        // Step 3: write collection with new data to file CSV
        StudentReadAndWriteFileCSV.writeFileCSV(studentList);
    }

    @Override
    public void delete() throws IOException {

    }

    @Override
    public void sortByName() throws IOException {
        List<Student> studentList = StudentReadAndWriteFileCSV.readFieCSV();
        ComparatorNameStudent comparatorNameStudent = new ComparatorNameStudent();
        studentList.sort(comparatorNameStudent);
        for (Student student:studentList){
            System.out.println(student.getInfo());
        }
    }
}
