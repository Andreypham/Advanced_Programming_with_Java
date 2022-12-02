package Demo1.service.Impl;

import Demo1.Validate.ValidationTeacher;
import Demo1.model.Teacher;
import Demo1.service.ITeacherService;
import Demo1.util.TeacherReadAndWriteFileCSV;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final String FILE_PATH = "/Users/ngockhanh/IntelliJProject/src/Demo1/data/ListTeacher.csv";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() throws IOException {
        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);
        // Step 2: display information
        System.out.println("----- List Teacher -----");

        if (teachers.size() == 0) {
            System.out.println("The list is empty");
        } else {
            for (Teacher teacher : teachers) {
                System.out.println(teacher.getInfo());
            }
        }
    }

    @Override
    public void addNew() throws IOException {
        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);
        // Step 2: Add New data
        teachers.add(ValidationTeacher.infoTeacher());
        // Step 3: write collection with new data to file CSV
        TeacherReadAndWriteFileCSV.writeFileCSV(FILE_PATH, teachers);
    }

    @Override
    public void update() throws IOException {
        System.out.println("Enter teacher's name you want to edit:");
        String name = scanner.nextLine();
        boolean found = false;

        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);
        // Step 2: Update data
        for (int i = 0; i < teachers.size(); i++) {
            if (name.equals(teachers.get(i).getName())) {
                teachers.set(i, ValidationTeacher.infoTeacher());
                found = true;
                System.out.println("Update teacher successful");
            }
        }
        if (!found) {
            System.out.println("Don't found teacher: " + name);
        }
        // Step 3: write collection with new data to file CSV
        TeacherReadAndWriteFileCSV.writeFileCSV(FILE_PATH, teachers);
    }

    @Override
    public void delete() throws IOException {
        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);

        // Step 2: delete data
        System.out.println("Enter teacher's name you want to delete:");
        String name = scanner.nextLine();
        boolean found = false, check = false;
        int choice;
        for (int i = 0; i < teachers.size(); i++) {
            if (name.equals(teachers.get(i).getName())) {
                found = true;
                do{
                    try{
                        System.out.println("Are you sure?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        choice = Integer.parseInt(scanner.nextLine());
                        check = true;
                        switch (choice){
                            case 1: teachers.remove(i);
                                System.out.println("Delete teacher successful");break;
                            case 2: break;
                            default:
                                System.out.println("Invalid choice, please try again");
                        }
                    }catch (NumberFormatException e){
                        System.err.println("Invalid input, please enter again!");
                    }
                }while (!check);
            }
        }
        if (!found){
            System.out.println("Teacher not found");
        }

        // Step 3: write collection with new data to file CSV
        TeacherReadAndWriteFileCSV.writeFileCSV(FILE_PATH, teachers);
    }

    @Override
    public void sort() throws IOException {
        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);
        // Step 2: Sort
        Collections.sort(teachers);
        // Step 3: display List teacher
        for(Teacher teacher:teachers){
            System.out.println(teacher.getInfo());
        }
    }

    @Override
    public void search() throws IOException {
        // Step 1: read file CSV to collection
        List<Teacher> teachers = TeacherReadAndWriteFileCSV.readFieCSV(FILE_PATH);
        // Step 2: Search data
        System.out.println("Enter teacher's name you want to search:");
        String name = scanner.nextLine();
        boolean flagSearch = false;
        for (Teacher teacher : teachers) {
            if (name.equals(teacher.getName())) {
                System.out.println(teacher.getInfo());
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Don't found teacher: " + name);
        }else{
            System.out.println("Update teacher successful");
        }
    }
}
