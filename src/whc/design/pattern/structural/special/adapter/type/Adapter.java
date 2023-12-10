package whc.design.pattern.structural.special.adapter.type;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
