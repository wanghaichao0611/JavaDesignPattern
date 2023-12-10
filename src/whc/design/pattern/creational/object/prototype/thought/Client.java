package whc.design.pattern.creational.object.prototype.thought;

//客户端
public class Client {

    public static void main(String[] args) {

        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAttr("ABC");
        ConcretePrototypeA concretePrototypeACopy = (ConcretePrototypeA) concretePrototypeA.clone();
        System.out.println("原型：" + concretePrototypeA.getAttr());
        System.out.println("复制：" + concretePrototypeACopy.getAttr());
        System.out.println(("是否相等：" + concretePrototypeA.getAttr()).equals(concretePrototypeACopy.getAttr()));
    }
}
