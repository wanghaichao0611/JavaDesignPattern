package whc.design.pattern.behavioral.object.command.undo;

import java.util.*;

/**
 * 请求发送者
 */
public class CalculatorForm {


    private AbstractCommand command;


    public void setCommand(AbstractCommand command) {
        this.command = command;
    }


    public void compute(int value) {
        System.out.println("执行运算，运算结果为：" + command.execute(value));
    }

    public void undo() {
        System.out.println("执行撤销，运算结果为：" + command.undo());
    }

}