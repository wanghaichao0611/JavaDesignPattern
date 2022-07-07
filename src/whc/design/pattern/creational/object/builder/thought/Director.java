package whc.design.pattern.creational.object.builder.thought;


/**
 * Director（指挥者）：指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象者之间存在关联关系，可以在其construct（）
 * 建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的构造。客户端一般只需要与指挥者进行交互，在客户端确定具体构造者的
 * 类型，并实例化具体构造者对象（也可以通过配置文件与反射机制实现），然后通过指挥者类的构造函数或者Setter方法将对象传入指挥者类中。
 */
public class Director {

    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    //产品构建与组装方法
    public Product construct(){
        builder.buildPartA();;
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
