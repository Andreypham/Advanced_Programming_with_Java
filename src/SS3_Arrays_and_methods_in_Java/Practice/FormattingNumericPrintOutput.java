package SS3_Arrays_and_methods_in_Java.Practice;

import java.util.Calendar;
import java.util.Locale;

public class FormattingNumericPrintOutput {
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"
        System.out.printf("'%5.2e'%n", 5.1473); //--> '5.15e+00'

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        System.out.format("%tD%n", c);    // -->  "05/29/06"

        /*
            %c: Ký tự
            %d: Số thập phân (số nguyên) (cơ số 10)
            %e: Dấu phẩy động theo cấp số nhân
            %f: Dấu phẩy động
            %i: Số nguyên (cơ sở 10)
            %o: Số bát phân (cơ sở 8)
            %s: Chuỗi
            %u: Số thập phân (số nguyên) không dấu
            %x: Số trong hệ thập lục phân (cơ sở 16)
            %t: Định dạng ngày / giờ
            %%: Dấu phần trăm
            \%: Dấu phần trăm

         */
    }
}
