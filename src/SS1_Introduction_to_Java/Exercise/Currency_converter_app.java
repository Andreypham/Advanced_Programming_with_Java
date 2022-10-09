package SS1_Introduction_to_Java.Exercise;

import java.util.Scanner;

public class Currency_converter_app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Enter the amount in USD: ");
        double usd = scanner.nextDouble();
        System.out.println("The amount to be converted into VND is: " + usd * rate);
    }
}
