package whc.design.pattern.creational.object.prototype.manager;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable prototypeTable = new Hashtable(); //使用HashTable存储原型对象

    public PrototypeManager() {
        prototypeTable.put("A", new ConcretePrototypeA());
        prototypeTable.put("B", new ConcretePrototypeB());
    }

    public void add(String key, Prototype prototype) {
        prototypeTable.put(key, prototype);
    }

    public Prototype get(String key) {
        Prototype clone = null;
        clone = ((Prototype) prototypeTable.get(key)).clone(); //通过克隆方法创建新对象
        return clone;
    }

}
