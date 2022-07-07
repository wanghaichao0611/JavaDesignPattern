package whc.design.pattern.structural.object.bridge.thought;

public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        //业务代码
        imple.operationImpl(); //调用实现类的方法
        //业务代码
    }
}
