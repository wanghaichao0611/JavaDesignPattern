package whc.design.pattern.behavioral.object.command.example;

import java.util.*;

/**
 * 功能键类，充当请求调用者(请求发送者)
 */
public class FunctionButton {
    /**
     * 维持一个抽象命令对象的引用
     */
    private Command command;

    public void setCommand(Command command) {
       this.command = command;
    }

    /**
     * 发送请求的方法
     */
    public void click() {
       System.out.print("单击功能键：");
        command.execute();
    }

}