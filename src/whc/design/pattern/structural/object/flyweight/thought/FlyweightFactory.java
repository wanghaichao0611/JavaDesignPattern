package whc.design.pattern.structural.object.flyweight.thought;

import java.util.*;

/**
 *
 */
public class FlyweightFactory {


    //定义一个HashMap
    private final Map<String, Flyweight> flyweight = new HashMap<>();


    public Flyweight getFlyweight(String key) {
        //如果对象存在，则直接从享元池获取
        if (flyweight.containsKey(key)) {
            return (Flyweight) flyweight.get(key);
        }
        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            Flyweight fw = new ConcreteFlyweight(key);
            flyweight.put(key, fw);
            return fw;
        }
    }

}