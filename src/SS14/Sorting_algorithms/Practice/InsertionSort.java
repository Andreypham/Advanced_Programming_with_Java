package SS14.Sorting_algorithms.Practice;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int pos = j;
                while (pos>0 && array[pos]<array[pos-1]){
                    int temp = array[pos];
                    array[pos] = array[pos-1];
                    array[pos-1] = temp;
                    pos--;
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
        insertionSort(array);
        printArray(array);
    }
}
