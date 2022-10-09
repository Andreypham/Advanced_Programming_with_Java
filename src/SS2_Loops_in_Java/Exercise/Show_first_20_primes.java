package SS2_Loops_in_Java.Exercise;

public class Show_first_20_primes {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;
        while (count < numbers) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
