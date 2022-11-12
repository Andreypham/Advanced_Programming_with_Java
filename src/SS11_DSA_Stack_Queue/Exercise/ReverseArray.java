package SS11_DSA_Stack_Queue.Exercise;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array: " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            array[index] = stack.pop();
            index++;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}
