package Demo1.Validate;

import Demo1.model.Student;

import java.util.Scanner;

public class ValidationStudent implements ICustomizeRegex {
    static Scanner scanner = new Scanner(System.in);

    public static Student infoStudent() {
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        while (!name.matches(REGEX_NAME)) {
            System.out.println("Invalid input, please re-enter student's name");
            name = scanner.nextLine();
        }

        System.out.println("Enter student's birthday: ");
        String birthday = scanner.nextLine();
        while (!birthday.matches(REGEX_BIRTH_DAY)) {
            System.out.println("Invalid input, please re-enter student's birthday");
            birthday = scanner.nextLine();
        }

        int weight = 0;
        boolean checkWeight = false;
        do {
            try {
                System.out.println("Enter student's weight: ");
                weight = Integer.parseInt(scanner.nextLine());
                checkWeight = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter again");
            }
        } while (!checkWeight || weight < 50 || weight > 100);

        int choice;
        String gender = "Unknown";
        boolean flagGender = false;
        do{
            try{
                System.out.println("Choice student's gender");
                System.out.println("1. Male");
                System.out.println("2. Female");
                choice = Integer.parseInt(scanner.nextLine());
                flagGender = true;
                switch (choice) {
                    case 1 -> gender = "Male";
                    case 2 -> gender = "Female";
                    default -> System.out.println("Invalid choice, please try again");
                }
            }catch (NumberFormatException e){
                System.err.println("Invalid input, please enter again!");
            }
        }while (!flagGender);

        double score = 0;
        boolean checkScore = false;
        do {
            try {
                System.out.println("Enter student's score: ");
                score = Double.parseDouble(scanner.nextLine());
                checkScore = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please re-enter student's score: ");
            }
        } while (!checkScore || score < 0 || score > 10);
        return new Student(name, birthday, weight, gender, score);
    }
}
