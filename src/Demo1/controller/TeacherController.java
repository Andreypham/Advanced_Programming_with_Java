package Demo1.controller;

import Demo1.service.Impl.TeacherService;
import Demo1.view.DisplayMenu;

import java.io.IOException;
import java.util.Scanner;

public class TeacherController {
    public static void TeacherManagement() {
        TeacherService teacherService = new TeacherService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                DisplayMenu.displayMenuTeacher();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        teacherService.display();
                        break;
                    case 2:
                        teacherService.addNew();
                        break;
                    case 3:
                        teacherService.update();
                        break;
                    case 4:
                        teacherService.delete();
                        break;
                    case 5:
                        teacherService.sort();
                        break;
                    case 6:
                        teacherService.search();
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Invalid choice, please try again");
                }
            } catch (NumberFormatException | IOException e) {
                System.err.println("Invalid input, please enter again!");
            }
        } while (choice != 7);
    }
}
