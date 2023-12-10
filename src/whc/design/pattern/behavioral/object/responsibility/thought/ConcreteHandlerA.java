package whc.design.pattern.behavioral.object.responsibility.thought;

/**
 * 具体处理者A
 */
public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(String request) {
        if (true){
            //处理请求
        }else {
            this.successor.handleRequest(request);
        }
    }
}