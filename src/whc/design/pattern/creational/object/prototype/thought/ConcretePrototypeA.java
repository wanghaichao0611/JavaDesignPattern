package whc.design.pattern.creational.object.prototype.thought;

public class ConcretePrototypeA extends Prototype {

    private String attr;

    public String getAttr() {
        return this.attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA prototype = new ConcretePrototypeA();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
