package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class SumNumbersDiagonalSquareMatrix {
    public static void main(String[] args) {
        int[][] matrix = inputSquareMatrix();
        printSquareMatrix(matrix);
        sumNumbersDiagonal(matrix);
    }

    public static int[][] inputSquareMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of square matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        System.out.format("Enter %s rows and %s columns:%n", size, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Element (%s;%s): ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void printSquareMatrix(int[][] matrix) {
        int size = matrix.length;
        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumNumbersDiagonal(int[][] matrix) {
        int size = matrix.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.printf("Sum the numbers on main diagonal is: %s", sum);
    }
}
