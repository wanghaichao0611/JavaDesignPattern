package whc.design.pattern.structural.object.facade.example;

import java.io.FileInputStream;
import java.util.*;

/**
 * FileReader：文件读取类，充当子系统类
 */
public class FileReader {


    public String read(String fileNameSrc) {
        System.out.println("读取文件,获取明文：");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileNameSrc);
            int data;
            while ((data = fileInputStream.read()) != -1) {
                sb = sb.append((char) data);
            }
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

}