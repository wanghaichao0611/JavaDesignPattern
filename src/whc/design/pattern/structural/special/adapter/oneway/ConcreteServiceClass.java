package whc.design.pattern.structural.special.adapter.oneway;

public class ConcreteServiceClass extends AbstractServiceClass{

    @Override
    public void serviceMethod1() {
        System.out.println("重写了serviceMethod1方法");
    }
}
