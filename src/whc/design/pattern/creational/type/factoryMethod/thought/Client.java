package whc.design.pattern.creational.type.factoryMethod.thought;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.getProduct();
        product.printProduct();
    }
}
