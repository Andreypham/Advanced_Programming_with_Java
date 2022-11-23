package SS16_IO_Text_File.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_File_CSV {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/ngockhanh/IntelliJProject/src/SS16_IO_Text_File/Exercise/input.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Country> countries = new ArrayList<>();

        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name_country = temp[2];
            Country country = new Country(id, code, name_country);
            countries.add(country);
        }
        bufferedReader.close();

        for (Country country : countries) {
            System.out.println(country.toString());
        }
    }
}
