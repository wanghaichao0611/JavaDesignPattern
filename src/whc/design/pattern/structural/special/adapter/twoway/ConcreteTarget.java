package whc.design.pattern.structural.special.adapter.twoway;

public class ConcreteTarget implements Target{


    @Override
    public void request() {
        System.out.println("调用了request");
    }
}
