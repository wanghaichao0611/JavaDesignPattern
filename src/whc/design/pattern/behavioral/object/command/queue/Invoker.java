package whc.design.pattern.behavioral.object.command.queue;

/**
 * 请求发送者类
 */
public class Invoker {
    //维持一个命令队列的使用
    private CommandQueue commandQueue;

    //构造注入
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //调用CommandQueue
    public void call() {
        commandQueue.execute();
    }

}
