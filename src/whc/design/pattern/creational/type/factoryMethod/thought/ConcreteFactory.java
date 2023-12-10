package whc.design.pattern.creational.type.factoryMethod.thought;

public class ConcreteFactory implements Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
}
