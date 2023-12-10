package whc.design.pattern.structural.special.adapter.twoway;

public class Adapter implements Target, Adaptee {

    private Adaptee adaptee;

    private Target target;

    //1.组合模式
    public Adapter() {
        adaptee = new ConcreteAdaptee();
        target = new ConcreteTarget();
    }

    //2.关联关系
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter(Target target) {
        this.target = target;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
