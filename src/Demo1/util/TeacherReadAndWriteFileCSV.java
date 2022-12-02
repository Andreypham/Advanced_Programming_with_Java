package Demo1.util;

import Demo1.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherReadAndWriteFileCSV {

    public static final String File_Path = "/Users/ngockhanh/IntelliJProject/src/Demo1/data/ListTeacher.csv";

    public static List<Teacher> readFieCSV() throws IOException {
        List<Teacher> teachers = new ArrayList<>();
        FileReader fileReader = new FileReader(File_Path);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Teacher teacher;
        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            String name = temp[0];
            int age = Integer.parseInt(temp[1]);
            String gender = temp[2];
            double salary = Double.parseDouble(temp[3]);
            teacher = new Teacher(name,age,gender,salary);
            teachers.add(teacher);
        }
        buff.close();
        return teachers;
    }

    public static void writeFileCSV(List<Teacher> teachers) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/ngockhanh/IntelliJProject/src/Demo1/data/ListTeacher.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < teachers.size(); i++) {
            bufferedWriter.write(teachers.get(i)+"\n");
        }
        bufferedWriter.close();
    }
}
