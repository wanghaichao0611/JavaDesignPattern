package whc.design.pattern.creational.object.builder.thought;


/**
 * Product（产品）：它是被构建的复杂对象，包含多个组件部件，具体建造者创建该产品的内部表示并定义它的装配过程。
 */
public class Product {

    //定义部件，部件可以是任意类型，包括值类型和引用类型
    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
