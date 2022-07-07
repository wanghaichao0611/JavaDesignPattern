package whc.design.pattern.structural.special.adapter.twoway;

public class ConcreteAdaptee implements Adaptee{

    @Override
    public void specificRequest() {
        System.out.println("调用了specificRequest");
    }
}
