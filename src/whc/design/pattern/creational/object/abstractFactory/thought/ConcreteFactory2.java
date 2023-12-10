package whc.design.pattern.creational.object.abstractFactory.thought;

//具体工厂2
public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
