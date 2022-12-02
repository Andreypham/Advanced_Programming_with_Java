package Demo1.view;

public class DisplayMenu {
    public static void displayMainMenu(){
        System.out.println("-----Management-----");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Exit");
        System.out.println("--------------------");
        System.out.println("Enter your choice: ");
    }

    public static void displayMenuTeacher(){
        System.out.println("-----Teacher Management-----");
        System.out.println("1. Display list teacher");
        System.out.println("2. Add New Teacher");
        System.out.println("3. Update Teacher");
        System.out.println("4. Delete Teacher");
        System.out.println("5. Sort List Teacher");
        System.out.println("6. Search Teacher");
        System.out.println("7. Return main menu");
        System.out.println("----------------------------");
        System.out.println("Enter your choice: ");
    }

    public static void displayMenuStudent(){
        System.out.println("-----Teacher Management-----");
        System.out.println("1. Display list student");
        System.out.println("2. Add New Student");
        System.out.println("3. Update student");
        System.out.println("4. Return main menu");
        System.out.println("----------------------------");
        System.out.println("Enter your choice: ");
    }
}
