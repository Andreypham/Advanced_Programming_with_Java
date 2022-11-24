package SS14.Sorting_algorithms.Practice;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.format("%4d", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 6, 1, 5, 3, 9, 7};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }
}
