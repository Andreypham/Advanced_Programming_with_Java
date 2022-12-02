package Case_Study.Controllers;

import java.util.Scanner;

import static Case_Study.Views.DisplayMenu.displayPromotionMenu;

public class PromotionControllers {
    public static void PromotionManagement(){
        int choice;
        do{
            displayPromotionMenu();
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("Wrong input, please enter your choice again");
            }

        }while (choice!=3);
    }
}
