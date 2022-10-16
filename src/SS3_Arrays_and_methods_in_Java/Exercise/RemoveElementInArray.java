package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 8, 6, 9};
        // print arr
        System.out.print("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
        // input number to delete
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to delete: ");
        int number = sc.nextInt();

        int delIndex = -1, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) count++;
        }
        if (count == 0) {
            System.out.println("The number you want to remove is not in the array");
        } else {
            System.out.print("Array:");
            for (int j = 0; j < count; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == number) delIndex = i;
                }
                for (int i = delIndex; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }
        }
    }
}
