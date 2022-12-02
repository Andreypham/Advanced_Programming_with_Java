package Demo1.util;

import Demo1.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentReadAndWriteFileCSV {

    public static List<Student> readFieCSV() throws IOException {
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader = new FileReader("/Users/ngockhanh/IntelliJProject/src/Demo1/data/ListStudent.csv");
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Student student;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String name = temp[0];
            int age = Integer.parseInt(temp[1]);
            String gender = temp[2];
            double score = Double.parseDouble(temp[3]);
            student = new Student(name, age, gender, score);
            studentList.add(student);
        }
        buff.close();
        return studentList;
    }

    public static void writeFileCSV(List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/ngockhanh/IntelliJProject/src/Demo1/data/ListStudent.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < studentList.size(); i++) {
            bufferedWriter.write(studentList.get(i) + "\n");
        }
        bufferedWriter.close();
    }
}
