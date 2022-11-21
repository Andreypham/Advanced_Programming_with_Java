package SS13_Search_Algorithm.Exercise;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Array before sorting");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        bubbleSort(array);
        System.out.println();
        System.out.println("Array after sorting");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int index = binarySearch(array, 2, 4, 5);
        if (index == -1) {
            System.out.println("value is not found");
        } else {
            System.out.println("index = " + index);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if ((left < right) && (right <= array.length - 1)) {
            while (left <= right) {
                int middle = (left + right) / 2;
                if (array[middle] == value) {
                    return middle;
                } else if (array[middle] > value) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        } else {
            System.out.println("left or right is invalid");
        }
        return -1;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
}
