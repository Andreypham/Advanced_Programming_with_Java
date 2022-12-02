package Case_Study.Controllers;

import java.util.Scanner;
import static Case_Study.Controllers.BookingControllers.BookingManagement;
import static Case_Study.Controllers.CustomerControllers.CustomerManagement;
import static Case_Study.Controllers.EmployeeControllers.EmployeeManagement;
import static Case_Study.Controllers.FacilityControllers.FacilityManagement;
import static Case_Study.Controllers.PromotionControllers.PromotionManagement;
import static Case_Study.Views.DisplayMenu.displayMainMenu;

public class FuramaController {
    public static void main(String[] args) {
        int choice;
        do{
            displayMainMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: EmployeeManagement(); break;
                case 2: CustomerManagement(); break;
                case 3: FacilityManagement(); break;
                case 4: BookingManagement(); break;
                case 5: PromotionManagement();break;
                case 6: break;
                default:
                    System.out.println("Wrong choice, Please enter your new choice");
            }
        }while (choice !=6);
    }
}
