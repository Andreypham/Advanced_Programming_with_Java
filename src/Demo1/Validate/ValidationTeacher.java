package Demo1.Validate;

import Demo1.model.Teacher;

import java.util.Scanner;

public class ValidationTeacher implements ICustomizeRegex {
    static Scanner scanner = new Scanner(System.in);

    public static Teacher infoTeacher() {
        System.out.println("Enter teacher's name: ");
        String name = scanner.nextLine();
        while (!name.matches(REGEX_NAME)) {
            System.out.println("Invalid input, please re-enter teacher's name");
            name = scanner.nextLine();
        }

        System.out.println("Enter teacher's birthday: ");
        String birthday = scanner.nextLine();
        while (!birthday.matches(REGEX_BIRTH_DAY)) {
            System.out.println("Invalid input, please re-enter teacher's birthday");
            birthday = scanner.nextLine();
        }

        int weight = 0;
        boolean checkWeight = false;
        do {
            try {
                System.out.println("Enter teacher's weight: ");
                weight = Integer.parseInt(scanner.nextLine());
                checkWeight = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter again");
            }
        } while (!checkWeight || weight < 50 || weight > 100);

        System.out.println("Enter teacher's gender: ");
        String gender = scanner.nextLine();
        while (!gender.matches(REGEX_GENDER)) {
            System.out.println("Invalid input, please re-enter teacher's gender");
            gender = scanner.nextLine();
        }

        double salary = 0;
        boolean checkSalary = false;
        do {
            try {
                System.out.println("Enter teacher's salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                checkSalary = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please re-enter teacher's salary: ");
            }
        } while (!checkSalary || salary < 0);
        return new Teacher(name, birthday, weight, gender, salary);
    }
}
