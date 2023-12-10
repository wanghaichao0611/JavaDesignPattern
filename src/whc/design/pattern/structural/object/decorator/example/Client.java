package whc.design.pattern.structural.object.decorator.example;


/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        getFirstMethod();
        getMoreMethod();
    }

    /**
     * 增加一个修饰方法
     */
    public static void getFirstMethod(){
        AbstractComponent component,componentSb;
        component = new Window(); //使用抽象构件定义对象
        componentSb = new ScrollBarDecorator(component);  //创建具体构建对象
        componentSb.display();   //创建装饰后的构件对象
    }

    /**
     * 增加多个修饰方法
     */
    public static void getMoreMethod(){
        AbstractComponent component,componentSb,componentBb;
        component = new Window(); //使用抽象构件定义对象
        componentSb = new ScrollBarDecorator(component);  //创建具体构建对象
        componentBb = new BlackBordDecorator(componentSb); //进行第二次装饰修饰增加功能
        componentBb.display();   //创建装饰后的构件对象
    }
}
