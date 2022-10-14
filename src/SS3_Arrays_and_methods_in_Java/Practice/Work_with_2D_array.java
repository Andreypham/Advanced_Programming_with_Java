package SS3_Arrays_and_methods_in_Java.Practice;

public class Work_with_2D_array {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 6, 8, 9, 4},
                {8, 6, 9, 3, 2},
                {7, 6, 4, 2, 9},
        };

        // print array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // array with random value of element
        int m = 4, n = 3;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100); //random value
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%4d", arr[i][j]); // print array with format
            }
            System.out.println();
        }

        //random swap element in array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }

        //print array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%3d", matrix[i][j]); // print array with format
            }
            System.out.println();
        }
    }
}
