package whc.design.pattern.creational.object.builder.thought;


/**Builder（抽象建造者）：它为创建一个产品对象的各个部件指定抽象接口，在该接口中一般声明两类方法，一类方法是buildPartX（），
 * 它们用户创建复杂对象的各个部件；另一类方法是getResult（），它们用于创建复杂对象。Builder既可以是抽象类，也可以是接口。
 */
public abstract class Builder {

    //创建产品对象
    protected Product product=new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }

}
