package whc.design.pattern.behavioral.object.command.undo;

import java.util.*;

/**
 * 请求接收者
 */
public class Adder {

    private int num = 0;


    public int add(int value) {
        num += value;
        return num;
    }

}