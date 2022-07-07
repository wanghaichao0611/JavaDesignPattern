package whc.design.pattern.creational.object.abstractFactory.thought;


//客户端
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=(AbstractFactory) AbstractFactoryXMLUtil.getBean();
        abstractFactory.createProductA().printA();
        abstractFactory.createProductB().printB();
    }
}
