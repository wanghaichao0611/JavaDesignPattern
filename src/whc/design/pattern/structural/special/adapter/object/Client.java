package whc.design.pattern.structural.special.adapter.object;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
