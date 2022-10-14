package SS2_Loops_in_Java.Exercise;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
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
            }
            n++;
        }
    }
}
