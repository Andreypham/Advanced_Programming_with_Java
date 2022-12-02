package Case_Study.Controllers;

import Case_Study.Services.IBookingService;
import Case_Study.Services.Implement.BookingServiceImpl;

import java.util.Scanner;

import static Case_Study.Views.DisplayMenu.displayBookingMenu;

public class BookingControllers {
    private static final IBookingService bookingServiceImplement = new BookingServiceImpl();
    public static void BookingManagement(){
        int choice;
        do{
            displayBookingMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    bookingServiceImplement.addNewBooking(); break;
                case 2:
                    bookingServiceImplement.displayAll(); break;
                case 3:
                    System.out.println("3"); break;
                case 4:
                    System.out.println("4"); break;
                case 5:
                    System.out.println("5"); break;
                case 6:
                    System.out.println("6"); break;
                default:
                    System.out.println("Wrong input, please enter your choice again");
            }
        }while ( choice != 6);
    }
}
