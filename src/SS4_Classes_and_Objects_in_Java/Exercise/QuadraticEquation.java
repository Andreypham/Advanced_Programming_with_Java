package SS4_Classes_and_Objects_in_Java.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Solve equation: ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        double a = 0, b = 0, c = 0;
        do {
            flag = false;
            try {
                System.out.println("Enter a, b, c: ");
                String coefficient = scanner.nextLine();
                String[] arrayCoefficient;
                arrayCoefficient = coefficient.split(" ");
                a = Double.parseDouble(arrayCoefficient[0]);
                b = Double.parseDouble(arrayCoefficient[1]);
                c = Double.parseDouble(arrayCoefficient[2]);
            } catch (Exception e) {
                System.out.println("input error, you need reenter");
                flag = true;
            }
        } while (flag);

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double d = quadraticEquation.getDiscriminant();
        if (d < 0) {
            System.out.println("The equation has no real roots");
        } else if (d == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        } else {
            System.out.format("The equation has two roots %5f and %5f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        }
    }

    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 / this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 / this.a;
    }
}
