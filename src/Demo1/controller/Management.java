package Demo1.controller;

import Demo1.service.Impl.TeacherService;
import Demo1.view.DisplayMenu;

import java.io.IOException;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                DisplayMenu.displayMainMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        TeacherController.TeacherManagement();
                        break;
                    case 2:
                        StudentController.StudentManagement();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid choice, please try again");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter again!");
            }
        } while (choice != 3);
    }
}
