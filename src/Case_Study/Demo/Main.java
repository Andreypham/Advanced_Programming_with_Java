package Case_Study.Demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "11/08/2016"; //yyyy-MM-dd

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
    }

}