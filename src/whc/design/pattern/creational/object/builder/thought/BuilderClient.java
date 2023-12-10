package whc.design.pattern.creational.object.builder.thought;


public class BuilderClient {
    public static void main(String[] args) {
        //new实现
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());

        //可通过配置文件实现
        Builder builderXml = (Builder) BuilderUtil.getBean();
        Director directorXml = new Director(builderXml);
        Product productXml = directorXml.construct();
        System.out.println(productXml.getPartA());
        System.out.println(productXml.getPartB());
        System.out.println(productXml.getPartC());
    }
}
