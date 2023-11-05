package whc.design.pattern.behavioral.object.command.macro;

import java.util.*;

/**
 * 抽象命令类
 */
public abstract class Command {


    public void add(Command command) {

    }

    public void removeCommand(Command command) {

    }

    public Command getCommand(int i) {
        return null;
    }

    public abstract void execute();

}