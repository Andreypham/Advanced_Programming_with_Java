package SS14.Sorting_algorithms.Exercise;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 4, 7, 3, 8, 5};
        printArray(array);
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
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
