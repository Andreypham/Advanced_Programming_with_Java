package Demo1.controller;

import Demo1.model.Student;
import Demo1.service.Impl.StudentService;
import Demo1.view.DisplayMenu;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    public static void StudentManagement(){
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            try{
                DisplayMenu.displayMenuStudent();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        studentService.display(); break;
                    case 2:
                        studentService.addNew(); break;
                    case 3:
                        System.out.println("Update student");;break;
                    case 4: studentService.sortByName(); break;
                    case 5: break;
                    default:
                        System.out.println("Invalid choice, please try again");
                }
            }catch (NumberFormatException | IOException e){
                System.err.println("Invalid input, please enter again!");
            }
        }while (choice != 5);
    }
}
