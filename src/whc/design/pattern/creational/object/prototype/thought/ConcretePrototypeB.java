package whc.design.pattern.creational.object.prototype.thought;

public class ConcretePrototypeB extends Prototype {

    private String attr;

    public String getAttr() {
        return this.attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeB prototype = new ConcretePrototypeB();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
