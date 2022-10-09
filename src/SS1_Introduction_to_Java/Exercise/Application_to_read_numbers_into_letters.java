package SS1_Introduction_to_Java.Exercise;

import java.util.Scanner;

public class Application_to_read_numbers_into_letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result;

        do {
            System.out.println("Enter a number (0-999): ");
            number = scanner.nextInt();
        }while (number<0 || number>999);

        int hundreds = number/100;
        int tens = (number%100)/10;
        int ones = number%10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);

//        if (number<10){
//            switch (number){
//                case 0:
//                    ones = "zero";
//                case 1:
//                    ones = "One";
//                    break;
//                case 2:
//                    ones = "Two";
//                    break;
//                case 3:
//                    ones = "Three";
//                    break;
//                case 4:
//                    ones = "Four";
//                    break;
//                case 5:
//                    ones = "Five";
//                    break;
//                case 6:
//                    ones = "Six";
//                    break;
//                case 7:
//                    ones = "Seven";
//                    break;
//                case 8:
//                    ones = "Eight";
//                    break;
//                case 9:
//                    ones = "Nine";
//                    break;
//
//            }
//        }else if (number<100){
//
//        }
//        System.out.println(ones);
    }
}
