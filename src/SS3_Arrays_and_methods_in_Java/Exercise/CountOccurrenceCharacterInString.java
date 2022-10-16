package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class CountOccurrenceCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        System.out.print("Enter the desired character:");
        char k = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == k) count++;
        }
        System.out.printf("The number of occurrences of character '%s' in string '%s' is: %s times", k, str, count);
    }
}
