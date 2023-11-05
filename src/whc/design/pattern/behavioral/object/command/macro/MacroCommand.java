package whc.design.pattern.behavioral.object.command.macro;


import java.util.ArrayList;
import java.util.List;

/**
 * 组合命令模式：宏命令
 */
public class MacroCommand extends Command {

    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
        System.out.println("重写了抽象命令的add方法");
    }

    @Override
    public void removeCommand(Command command) {
        commands.remove(command);
        System.out.println("重写了抽象命令的remove方法");
    }

    @Override
    public Command getCommand(int i) {
        System.out.println("重写了抽象命令的getCommand方法");
        return commands.get(i);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}