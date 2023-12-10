package whc.design.pattern.creational.object.abstractFactory.example;


//SummerButton：Summer按钮类，充当具体产品
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
