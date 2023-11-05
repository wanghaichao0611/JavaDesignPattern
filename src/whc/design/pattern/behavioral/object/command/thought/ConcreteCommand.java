package whc.design.pattern.behavioral.object.command.thought;

/**
 * 
 */
public class ConcreteCommand extends Command {

    /**
     * 维持对一个请求接收者对象的引用
     */
    private Receiver receiver;

    @Override
    public void execute() {
        //调用接收请求者的业务处理方法action()
        receiver.action();
    }
}