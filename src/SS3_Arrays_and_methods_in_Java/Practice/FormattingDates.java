package SS3_Arrays_and_methods_in_Java.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingDates {
    public static void main(String[] args) {
        Date date = new Date();

        // Time Formatting
        System.out.printf("%tT%n", date);
        // output: 13:51:15
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        // output: hours 13: minutes 51: seconds 15
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
        // output: 13:51:15 pm 061 061000000 +0400

        // Date Formatting
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        // output:Thursday, November 2018
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
        // output:22.11.18
    }
}
