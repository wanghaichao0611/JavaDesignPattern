package whc.design.pattern.structural.object.bridge.thought;

public class Client {

    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.operation();

    }
}
