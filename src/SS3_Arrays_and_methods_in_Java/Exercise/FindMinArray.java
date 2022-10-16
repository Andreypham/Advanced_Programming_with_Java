package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        int[] matrix = inputMatrix();
        printMatrix(matrix);
        findMinMatrix(matrix);
    }

    public static int[] inputMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] matrix = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.format("Enter element %s: ", i);
            matrix[i] = input.nextInt();
        }
        return matrix;
    }

    public static void printMatrix(int[] matrix) {
        System.out.print("Array: ");
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            System.out.format("%4d", matrix[i]);
        }
    }

    public static void findMinMatrix(int[] matrix) {
        int size = matrix.length;
        int min = matrix[0];
        for (int i = 0; i < size; i++) {
            if (matrix[i] < min) min = matrix[i];
        }
        System.out.println();
        System.out.println("Minimum = " + min);
        System.out.println("Index minimum: ");
        for (int i = 0; i < size; i++) {
            if (matrix[i] == min) System.out.println(i);
        }
    }
}
