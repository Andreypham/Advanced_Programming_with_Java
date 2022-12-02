package Demo1.util;

import Demo1.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherReadAndWriteFileCSV {
    public static List<Teacher> readFieCSV(String FILE_PATH) throws IOException {
        List<Teacher> teachers = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Teacher teacher;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String name = temp[0];
            int age = Integer.parseInt(temp[1]);
            String gender = temp[2];
            double salary = Double.parseDouble(temp[3]);
            teacher = new Teacher(name, age, gender, salary);
            teachers.add(teacher);
        }
        buff.close();
        return teachers;
    }

    public static void writeFileCSV(String FILE_PATH, List<Teacher> teachers) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < teachers.size(); i++) {
            bufferedWriter.write(teachers.get(i) + "\n");
        }
        bufferedWriter.close();
    }
}
