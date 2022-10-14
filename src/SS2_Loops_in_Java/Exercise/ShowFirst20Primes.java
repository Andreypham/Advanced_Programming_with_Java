package SS2_Loops_in_Java.Exercise;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int n = 2;
        while (count < numbers) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
