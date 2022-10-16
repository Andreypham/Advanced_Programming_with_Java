package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9, 0, 0, 0};
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to add: ");
        int element = sc.nextInt();
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 0 || index > arr.length) {
            System.out.println("Index out of range");
        } else {
            System.out.print("Array: ");
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }
        }
    }
}
