package SS17_IO_Binary_File_and_Serialization.Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
        OutputStream os = new FileOutputStream("/Users/ngockhanh/IntelliJProject/src/SS17_IO_Binary_File_and_Serialization/Practice/output.txt");

        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };

        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        os.close();
    }
}
