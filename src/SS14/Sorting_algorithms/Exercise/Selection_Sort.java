package SS14.Sorting_algorithms.Exercise;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 4, 7, 3, 8, 5};
        printArray(array);
        System.out.println("Process sorting array");
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
            System.out.println("------");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
