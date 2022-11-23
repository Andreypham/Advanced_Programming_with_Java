package SS15_Exception_And_Debug.Exercise;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static boolean checkTriangle(double firstSide, double secondSide, double thirdSide) throws IllegalTriangleException {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IllegalTriangleException();
        } else {
            if (firstSide + secondSide < thirdSide) {
                throw new IllegalTriangleException(thirdSide);
            } else if (secondSide + thirdSide < firstSide) {
                throw new IllegalTriangleException(firstSide);
            } else if (thirdSide + firstSide < secondSide) {
                throw new IllegalTriangleException(secondSide);
            }
        }
        return true;
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        do {
            System.out.println("Enter first side: ");
            double firstSide = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter second side: ");
            double secondSide = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter third side: ");
            double thirdSide = Double.parseDouble(scanner.nextLine());
            try {
                if (checkTriangle(firstSide, secondSide, thirdSide)) {
                    check = true;
                    System.out.println(firstSide + "; " + secondSide + "; " + thirdSide + " are the three sides of a triangle");
                }
            }catch (IllegalTriangleException e){
                System.err.println("Error: "+ e.getMessage());
            }
        } while (!check);
    }
}
