package bai1ghimangsonguyenvaofile;

import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFileNhiPhan {
    public static void main(String[] args) {
        //bai1 ghi mang so nguyen ra file
        try (FileOutputStream fos = new FileOutputStream("numbers.dat")) {
            // ghi so tu 1 den 10
            for (int i = 1; i <= 10; i++) {
                fos.write(i);
            }
            System.out.println(" file đã ghi xong");
        } catch (
                IOException e) {
            System.out.println(" lỗi " + e.getMessage());
        }
    }
}


//b2 ghi mang byte
   /* try(FileOutputStream fos = new FileOutputStream("data.dat")){
         [] data
    }
}*/

