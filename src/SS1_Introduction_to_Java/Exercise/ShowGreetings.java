package SS1_Introduction_to_Java.Exercise;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.next();

        System.out.println("Hello " + name);
    }
}
