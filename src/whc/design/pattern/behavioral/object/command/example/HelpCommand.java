package whc.design.pattern.behavioral.object.command.example;

import java.util.*;

/**
 * 帮助命令类
 */
public class HelpCommand extends Command {

    private final DisplayHelpClass displayHelpClass;

    public HelpCommand(){
        displayHelpClass = new DisplayHelpClass();
    }

    /**
     * 命令执行方法
     */
    @Override
    public void execute() {
        displayHelpClass.display();;
    }
}