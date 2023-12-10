package whc.design.pattern.structural.object.facade.example;

import java.util.*;

/**
 * 加密外观类，充当外观类
 */
public class EncryptFacade {

    private final FileReader reader;

    private final CipherMachine cipher;

    private final FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }

}