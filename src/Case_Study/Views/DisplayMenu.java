package Case_Study.Views;

public class DisplayMenu {
    public static void displayMainMenu(){
        System.out.println();
        System.out.println("  ==*==  MAIN MENU  ==*==  ");
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }

    public static void displayEmployeeMenu(){
        System.out.println();
        System.out.println("  ==*==  1. Employee Management   ==*==  ");
        System.out.println("1\tDisplay list employees\n" +
                "2.\tAdd new employee\n" +
                "3.\tEdit employee\n" +
                "4.\tReturn main menu\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }

    public static void displayCustomerMenu(){
        System.out.println();
        System.out.println("  ==*== 2. Customer Management  ==*==  ");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }

    public static void displayFacilityMenu(){
        System.out.println();
        System.out.println("  ==*== 3. Facility Management  ==*==  ");
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }

    public static void displaySubMenuFacility() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("----- Type of services ----");
        System.out.println("1. Villa");
        System.out.println("2. House");
        System.out.println("3. Room");
        System.out.println("---------------------------");
        System.out.print("Enter your choice: ");
    }

    public static void displayFacilitySubMenuAdd() {
        System.out.println();
        System.out.println("---- Add new facility ----");
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to facility management menu");
        System.out.println("---------------------------");
        System.out.print("Enter your choice: ");
    }

    public static void displayBookingMenu(){
        System.out.println();
        System.out.println("  ==*== 4. Booking Management  ==*==  ");
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }

    public static void displayPromotionMenu(){
        System.out.println();
        System.out.println("  ==*== 5. Promotion Management  ==*==  ");
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
    }
}
