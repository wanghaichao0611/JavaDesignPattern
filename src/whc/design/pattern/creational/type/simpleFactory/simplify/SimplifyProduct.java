package whc.design.pattern.creational.type.simpleFactory.simplify;

//简单工厂模式的简化
public class SimplifyProduct {

    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
        System.out.println("实现了公共方法");
    }

    public static SimplifyProduct factoryMethod(String arg) {
        SimplifyProduct simplifyProduct = null;
        if (arg.equalsIgnoreCase("A")) {
            simplifyProduct = new SimplifyConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            simplifyProduct = new SimplifyConcreteProductB();
        }
        return simplifyProduct;
    }

    public void print() {};
}
