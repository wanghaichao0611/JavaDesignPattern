package whc.design.pattern.creational.object.builder.thought;


/**
 * ConcreteBuilder（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确所创建的复杂对象，还可以提供
 * 一个方法返回创建好的复杂产品对象（该方法也可由抽象建造者实现）。
 */
public class ConcreteBuilder extends Builder {

    public void buildPartA(){
        product.setPartA("A1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C1");
    }

}
