package SS14.Sorting_algorithms.Practice;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            boolean check = false;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                    check = true;
                }
            }
            if (check) {
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
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
        selectionSort(array);
        printArray(array);
    }
}
