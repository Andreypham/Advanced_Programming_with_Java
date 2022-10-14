package SS2_Loops_in_Java.Exercise;

import java.util.Scanner;

public class ShowGeometricTypes {
    public static void main(String[] args) {
        int choice = -1;
        int m = 6, n = 8;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < m; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("------");
                    for (int i = 1; i < m; i++) {
                        for (int j = i; j < m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("------");
                    for (int i = 1; i < m; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = i; j < m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("------");
                    for (int i = 1; i < m; i++) {
                        for (int j = 1; j < m - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = m - i; j < m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < m - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = m - i; j <= m + i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
