package whc.design.pattern.structural.special.adapter.object;

public class Adapter extends Target {
    public Adaptee adaptee ; //维持一个对象者的引用

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest(); //转发调用
    }
}
