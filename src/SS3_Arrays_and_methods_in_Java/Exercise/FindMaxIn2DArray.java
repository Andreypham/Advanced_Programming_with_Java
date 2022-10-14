package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = inputMatrix2D();
        printMatrix(matrix);
        findMaxMatrix(matrix);
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

    public static void findMaxMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }
        System.out.println("max = " + max);
        System.out.println("index max:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == max) {
                    System.out.println(i + "," + j);
                }
            }
        }
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
