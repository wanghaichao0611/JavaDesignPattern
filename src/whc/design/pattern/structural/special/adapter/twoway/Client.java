package whc.design.pattern.structural.special.adapter.twoway;

public class Client {
    public static void main(String[] args) {
        Target target = (Target) Util.getBean();
        System.out.print("Target:");
        target.request();
        Adaptee adaptee = (Adaptee) Util.getBean();
        System.out.print("adaptee:");
        adaptee.specificRequest();
    }
}
