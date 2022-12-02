package Case_Study.Utils.Implement;

import Case_Study.Models.Facility.Room;
import Case_Study.Utils.IRoomReadAndWriteFileCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomReadAndWriteFileCSV implements IRoomReadAndWriteFileCSV {
    public static void writeFileCSV(List<Room> list){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_ROOM);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for(Room room: list){
                fileWriter.append(room.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getUsableArea()+"");
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getRentalCost()+"");
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getMaxCapacity()+"");
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getRentalType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeServiceIncluded());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error in CSV file record");
        }finally {
            try{
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                ex.printStackTrace();
                System.err.println("Error while flushing or closing");
            }
        }
    }

    public static List<Room> readFileCSV(){
        BufferedReader br = null;
        ArrayList<Room> list = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader(FILE_PATH_ROOM));
            String line = null;
            while (line != null){
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("Service Name")) {
                    continue;
                }
                Room room = new Room();
                room.setServiceName(splitData[0]);
                room.setUsableArea(Double.parseDouble(splitData[1]));
                room.setRentalCost(Double.parseDouble(splitData[2]));
                room.setMaxCapacity(Integer.parseInt((splitData[3])));
                room.setRentalType(splitData[4]);
                room.setFreeServiceIncluded(splitData[5]);
                list.add(room);
            }
        } catch (Exception e) {
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return list;
    }
}
