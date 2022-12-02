package Case_Study.Controllers;

import Case_Study.Services.IEmployeeService;
import Case_Study.Services.Implement.EmployeeServiceImpl;

import java.util.Scanner;

import static Case_Study.Views.DisplayMenu.displayEmployeeMenu;

public class EmployeeControllers {
    private static final IEmployeeService employeeServiceImpl = new EmployeeServiceImpl();
    public static void EmployeeManagement(){
        int choice;
        do{
            displayEmployeeMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeServiceImpl.displayAll();
                    break;
                case 2:
                    employeeServiceImpl.addNewEmployee();
                    break;
                case 3:
                    String employeeID;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Enter employee's employee ID you want to update: ");
                    employeeID = scanner1.nextLine();
                    employeeServiceImpl.upDateEmployee(employeeID);
                    break;
                case 4:
                    System.out.println("Exit menu Employee Management");
                    break;
                default:
                    System.out.println("Wrong input, please enter your choice again");
            }
        }while (choice!=4);
    }
}
