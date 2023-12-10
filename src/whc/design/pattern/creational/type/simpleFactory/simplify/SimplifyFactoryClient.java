package whc.design.pattern.creational.type.simpleFactory.simplify;

public class SimplifyFactoryClient {
    public static void main(String[] args) {
        SimplifyProduct.factoryMethod("A").print();
        SimplifyProduct.factoryMethod("B").print();
        SimplifyProduct simplifyProduct = SimplifyProduct.factoryMethod("A");
        simplifyProduct.methodSame();
        simplifyProduct.print();
    }
}
