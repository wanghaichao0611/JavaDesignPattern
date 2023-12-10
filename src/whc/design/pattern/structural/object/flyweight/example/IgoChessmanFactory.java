package whc.design.pattern.structural.object.flyweight.example;

import java.util.*;

/**
 * 享元工厂类：围棋棋子工厂类
 */
public class IgoChessmanFactory {

    private static final IgoChessmanFactory instance = new IgoChessmanFactory();

    private static Hashtable<String, IgoChessman> ht; //享元池

    private IgoChessmanFactory() {
        ht = new Hashtable<>();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 通过Key来获取存储在HashTable中的享元对象
     */
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }

}