package SS1_Introduction_to_Java.Exercise;

import java.util.Scanner;

public class Application_to_read_numbers_into_letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result = "";

        do {
            System.out.println("Enter a number (0-999): ");
            number = scanner.nextInt();
        } while (number < 0 || number > 999);

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        switch (hundreds) {
            case 0 -> result += "";
            case 1 -> result += "One hundred ";
            case 2 -> result += "Two hundred ";
            case 3 -> result += "Three hundred ";
            case 4 -> result += "Four hundred ";
            case 5 -> result += "Five hundred ";
            case 6 -> result += "Six hundred ";
            case 7 -> result += "Seven hundred ";
            case 8 -> result += "Eight hundred ";
            case 9 -> result += "Nine hundred ";

        }

        if (hundreds != 0 && (tens != 0 || ones != 0)) result += "and ";

        switch (tens) {
            case 0 -> result += "";
            case 1 -> {
                switch (ones) {
                    case 0 -> result += "ten";
                    case 1 -> result += "eleven";
                    case 2 -> result += "twelve";
                    case 3 -> result += "thirteen";
                    case 4 -> result += "fourteen";
                    case 5 -> result += "fifteen";
                    case 6 -> result += "sixteen";
                    case 7 -> result += "seventeen";
                    case 8 -> result += "eighteen";
                    case 9 -> result += "nineteen";
                }
            }
            case 2 -> result += "twenty ";
            case 3 -> result += "thirty ";
            case 4 -> result += "forty ";
            case 5 -> result += "fifty ";
            case 6 -> result += "sixty ";
            case 7 -> result += "seventy ";
            case 8 -> result += "eighty ";
            case 9 -> result += "ninety ";
        }

        if (tens != 1) {
            switch (ones) {
                case 0 -> {
                    {
                        if (hundreds == 0 && tens == 0) result = "zero";
                    }
                }
                case 1 -> result += "one";
                case 2 -> result += "two";
                case 3 -> result += "three";
                case 4 -> result += "four";
                case 5 -> result += "five";
                case 6 -> result += "six";
                case 7 -> result += "seven";
                case 8 -> result += "eight";
                case 9 -> result += "nine";
            }
        }
        System.out.println(result);
    }
}