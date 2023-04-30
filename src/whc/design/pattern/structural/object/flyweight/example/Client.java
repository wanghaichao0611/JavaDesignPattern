package whc.design.pattern.structural.object.flyweight.example;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory;
        //获取享元对象
        factory = IgoChessmanFactory.getInstance();
        //通过享元工厂获取3颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1 == black2));
        //通过享元工厂获取白棋子
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1 == white2));
        //显示棋子
        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();
        //显示棋子，同时设置棋子的坐标位置
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        black3.display(new Coordinates(1,3));
        white1.display(new Coordinates(2,5));
        white2.display(new Coordinates(2,4));
    }
}
