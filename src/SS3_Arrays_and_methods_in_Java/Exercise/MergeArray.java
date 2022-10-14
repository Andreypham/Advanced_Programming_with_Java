package SS3_Arrays_and_methods_in_Java.Exercise;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int[] brr = {0, 7, 9, 3};
        int c = arr.length + brr.length;
        int[] crr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
        for (int i = arr.length; i < c; i++) {
            crr[i] = brr[i - arr.length];
        }
        for (int i = 0; i < c; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}
