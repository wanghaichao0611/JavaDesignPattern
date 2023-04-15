package whc.design.pattern.structural.object.facade.example;

import java.io.FileOutputStream;
import java.util.*;

/**
 * 文件保存类，充当子系统类
 */
public class FileWriter {

    public void write(String encryptText, String fileNameDes) {
        System.out.println("保存密文，写入文件");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileNameDes);
            fileOutputStream.write(encryptText.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}