package whc.design.pattern.behavioral.object.command.queue;

import whc.design.pattern.behavioral.object.command.example.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令队列实现方式
 */
public class CommandQueue {
    //定义一个ArrayList来存储命令队列
    private final List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
