package SS3_Arrays_and_methods_in_Java.Exercise;

import java.util.Scanner;

public class Count_occurrence_character_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        System.out.println("Enter the desired character:");
        char k = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == k) count++;
        }
        System.out.println("Count = " + count);
    }
}
