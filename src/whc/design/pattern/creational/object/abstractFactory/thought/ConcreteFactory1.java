package whc.design.pattern.creational.object.abstractFactory.thought;

//具体工厂1
public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
