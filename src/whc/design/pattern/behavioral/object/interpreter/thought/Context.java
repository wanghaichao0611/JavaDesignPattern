package whc.design.pattern.behavioral.object.interpreter.thought;

import java.util.*;

/**
 * 环境类
 */
public class Context {

    private final HashMap<String, String> map = new HashMap<>();

    public void addSign(String key, String value) {
        //往环境中设值
        map.put(key, value);
    }

    public String lookUp(String key) {
        //获取存储在环境类中的值
        return map.get(key);
    }

}