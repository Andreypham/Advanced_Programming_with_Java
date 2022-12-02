package Case_Study.Controllers;

import Case_Study.Services.ICustomerService;
import Case_Study.Services.Implement.CustomerServiceImpl;

import java.util.Scanner;

import static Case_Study.Views.DisplayMenu.displayCustomerMenu;

public class CustomerControllers {
    private static final ICustomerService customerServiceImpl = new CustomerServiceImpl();
    public static void CustomerManagement(){
        int choice;
        do{
            displayCustomerMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerServiceImpl.displayAll();
                    break;
                case 2:
                    customerServiceImpl.addNewCustomer();
                    break;
                case 3:
                    String customerID;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Enter customer's customer ID you want to update: ");
                    customerID = scanner1.nextLine();
                    customerServiceImpl.updateCustomer(customerID);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong input, please enter your choice again");
            }
        }while (choice!= 4);
    }
}
