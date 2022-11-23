package SS16_IO_Text_File.Exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/ngockhanh/IntelliJProject/src/SS16_IO_Text_File/Exercise/Source");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> list = new ArrayList<>();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("/Users/ngockhanh/IntelliJProject/src/SS16_IO_Text_File/Exercise/Target");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i) + "\n");
        }
        bufferedWriter.close();
    }
}
