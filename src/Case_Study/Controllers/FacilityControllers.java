package Case_Study.Controllers;

import Case_Study.Services.IFacilityService;
import Case_Study.Services.Implement.FacilityServiceImpl;

import java.util.Scanner;

import static Case_Study.Views.DisplayMenu.displayFacilityMenu;

public class FacilityControllers {
    private static final IFacilityService facilityServiceImplement = new FacilityServiceImpl();
    public static void FacilityManagement(){
        int choice;
        do{
            displayFacilityMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityServiceImplement.displayAll();
                    break;
                case 2:
                    facilityServiceImplement.addNewService();
                    break;
                case 3:
                    System.out.println("Enter service: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String serviceType = scanner1.nextLine();
                    facilityServiceImplement.getServiceNameByServiceType(serviceType);
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("Wrong input, please enter your choice again");
            }
        }while (choice!=4);
    }
}
