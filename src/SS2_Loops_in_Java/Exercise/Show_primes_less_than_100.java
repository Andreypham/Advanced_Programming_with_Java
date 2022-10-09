package SS2_Loops_in_Java.Exercise;

public class Show_primes_less_than_100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
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
            }
            N++;
        }
    }
}
