package whc.design.pattern.behavioral.object.responsibility.thought;

/**
 * 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Handler handler, handler1;
        handler = new ConcreteHandlerA();
        handler1 = new ConcreteHandlerB();
        //创建职责链
        handler.setSuccessor(handler1);
        //发送请求
        handler1.handleRequest("请求对象");
    }

}