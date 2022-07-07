package whc.design.pattern.structural.object.bridge.example;

public class Client {
    public static void main(String[] args) {

        Image image;
        ImageImp imp;
        image = (Image) BridgeUtil.getBean("image");
        imp = (ImageImp) BridgeUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
