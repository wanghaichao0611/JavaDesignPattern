package whc.design.pattern.behavioral.object.command.macro;


/**
 * 调用者
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
        System.out.println("调用了执行命令action");
    }
}