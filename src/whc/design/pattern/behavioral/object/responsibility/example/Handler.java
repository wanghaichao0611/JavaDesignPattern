package whc.design.pattern.behavioral.object.responsibility.example;


/**
 * 抽象处理者
 */
public abstract class Handler {


    //维持对下家的引用
    protected Handler successor;

    /**
     *
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);

}