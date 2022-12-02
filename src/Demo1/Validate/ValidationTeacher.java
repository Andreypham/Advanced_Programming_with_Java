package Demo1.Validate;

import Demo1.model.Teacher;

import java.util.Scanner;

public class ValidationTeacher implements ICustomizeRegex{
    static Scanner scanner = new Scanner(System.in);
    public static Teacher infoTeacher(){
        System.out.println("Enter teacher's name: ");
        String name = scanner.nextLine();
        while (!name.matches(REGEX_NAME)){
            System.out.println("Invalid input, please re-enter teacher's name");
            name = scanner.nextLine();
        }

        int age = 0;
        boolean checkAge = false;
        do {
            try {
                System.out.println("Enter teacher's age: ");
                age = Integer.parseInt(scanner.nextLine());
                checkAge = true;
            } catch (NumberFormatException e) {
                System.err.println("Enter position with wrong pattern, please re-do: ");
            }
        } while (!checkAge || age<22 || age> 60);

        System.out.println("Enter teacher's gender: ");
        String gender = scanner.nextLine();
        while (!gender.matches(REGEX_GENDER)){
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
        } while (!checkSalary || salary<0);
        return new Teacher(name,age,gender,salary);
    }
}
