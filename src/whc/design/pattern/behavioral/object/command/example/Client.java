package whc.design.pattern.behavioral.object.command.example;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton functionButton = new FunctionButton();
        Command command;
        command = (Command) ConfigXml.getBean();//读取配置文件，反射生成对象
        functionButton.setCommand(command);
        functionButton.click();
    }
}
