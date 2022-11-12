package SS11_DSA_Stack_Queue.Exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Decimal_to_Binary {
    public static void convertDecimalToBinary(int number) {
        System.out.println("Decimal to binary");
        System.out.format("%s = (", number);
        Stack<Integer> stack = new Stack();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println(")B");
    }

    public static void convertBinaryToDecimal(int binary) {
        System.out.println("Binary to decimal");
        System.out.format("(%s)B = ", binary);
        int decimal = 0;
        Queue<Integer> queue = new LinkedList();
        while (binary != 0) {
            queue.add(binary % 10);
            binary /= 10;
        }
        int exponent = 0;
        while (!queue.isEmpty()) {
            decimal += queue.remove() * Math.pow(2, exponent);
            exponent++;
        }
        System.out.println(decimal);
    }

    public static void convertDecimalToHexadecimal(int number) {
        System.out.println("Decimal to Hexadecimal");
        System.out.format("%s = (", number);
        Stack stack = new Stack();
        while (number != 0) {
            int element = number % 16;
            if (element < 10) {
                stack.push(element);
            } else {
                switch (element) {
                    case 10:
                        stack.push("A");
                        break;
                    case 11:
                        stack.push("B");
                        break;
                    case 12:
                        stack.push("C");
                        break;
                    case 13:
                        stack.push("D");
                        break;
                    case 14:
                        stack.push("E");
                        break;
                    case 15:
                        stack.push("F");
                        break;
                }
            }
            number /= 16;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println(")H");
    }

    public static void convertHexadecimalToDecimal(String hexadecimal) {
        System.out.println("Hexadecimal to decimal");
        String[] elements = hexadecimal.split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i]) {
                case "0":
                    stack.add(0);
                    break;
                case "1":
                    stack.add(1);
                    break;
                case "2":
                    stack.add(2);
                    break;
                case "3":
                    stack.add(3);
                    break;
                case "4":
                    stack.add(4);
                    break;
                case "5":
                    stack.add(5);
                    break;
                case "6":
                    stack.add(6);
                    break;
                case "7":
                    stack.add(7);
                    break;
                case "8":
                    stack.add(8);
                    break;
                case "9":
                    stack.add(9);
                    break;
                case "A":
                    stack.add(10);
                    break;
                case "B":
                    stack.add(11);
                    break;
                case "C":
                    stack.add(12);
                    break;
                case "D":
                    stack.add(13);
                    break;
                case "E":
                    stack.add(14);
                    break;
                case "F":
                    stack.add(15);
                    break;
                default:
                    System.out.println("Enter wrong format number");
            }
        }
        int decimal = 0;

        int exponent = 0;
        while (!stack.isEmpty()) {
            decimal += stack.pop() * Math.pow(16, exponent);
            exponent++;
        }
        System.out.println("(" + hexadecimal + ")H = " + decimal);
    }

    public static void main(String[] args) {
        convertDecimalToBinary(20);
        convertBinaryToDecimal(1011);
        convertDecimalToHexadecimal(35);
        convertHexadecimalToDecimal("23");
    }
}
