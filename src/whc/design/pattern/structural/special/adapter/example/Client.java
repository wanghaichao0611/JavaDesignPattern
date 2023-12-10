package whc.design.pattern.structural.special.adapter.example;

public class Client {
    public static void main(String[] args) {
        CarController carController = (CarController) AdapterXmlUtil.getBean();
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
