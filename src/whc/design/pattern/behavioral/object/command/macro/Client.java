package whc.design.pattern.behavioral.object.command.macro;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command commandA = new ConcreteCommandA(new ReceiverA());
        Command commandB = new ConcreteCommandB(new ReceiverB());
        Command command = new MacroCommand();
        command.add(commandA);
        command.add(commandB);
        command.execute();
    }
}
