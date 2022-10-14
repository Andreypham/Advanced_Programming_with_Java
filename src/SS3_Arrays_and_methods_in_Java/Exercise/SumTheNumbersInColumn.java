package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class SumTheNumbersInColumn {
    public static void main(String[] args) {
        int[][] matrix = inputMatrix2D();
        int n = matrix[0].length;
        printMatrix(matrix);
        int column;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the column to sum: ");
            column = sc.nextInt();
            if (column < 0 || column >= n) System.out.format("Column is out of range [%s;%s]%n", 0, n - 1);
        } while (column < 0 || column >= n);
        sumNumbersInColumn(matrix, column);
    }

    public static int[][] inputMatrix2D() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of matrix: ");
        int row = input.nextInt();
        System.out.println("Enter the column of matrix: ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter " + row + " rows and " + column + " columns: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void sumNumbersInColumn(int[][] matrix, int column) {
        int m = matrix.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += matrix[i][column];
        }
        System.out.format("Sum the numbers in column %s is %s:", column, sum);
    }

    public static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
