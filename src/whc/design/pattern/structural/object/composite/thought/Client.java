package whc.design.pattern.structural.object.composite.thought;

/**
 * Client客户端
 */
public class Client {
    public static void main(String[] args) {
        Component component = new Composite();
        component.operation();
        Component componentLeaf = new Leaf();
        componentLeaf.operation();
    }
}
