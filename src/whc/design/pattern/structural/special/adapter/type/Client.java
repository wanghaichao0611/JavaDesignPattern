package whc.design.pattern.structural.special.adapter.type;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
