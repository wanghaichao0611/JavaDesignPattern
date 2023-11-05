package whc.design.pattern.behavioral.object.command.example;


/**
 * 退出命令类：充当具体命令类
 */
public class ExitCommand extends Command {

    //维持对请求接收者的引用
    private final SystemExitClass systemExitClass;

    public ExitCommand(){
        systemExitClass = new SystemExitClass();
    }

    /**
     * 命令行指定方法
     */
    @Override
    public void execute() {
        systemExitClass.exit();
    }
}