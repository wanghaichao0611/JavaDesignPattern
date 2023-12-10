package whc.design.pattern.structural.object.facade.thought;

import java.util.*;

/**
 * 外观模式客户端
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }

}