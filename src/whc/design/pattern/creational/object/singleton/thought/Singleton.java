package whc.design.pattern.creational.object.singleton.thought;

public class Singleton {

    private static Singleton instance = null; //静态私成员变量

    //私有构造函数
    private Singleton() {

    }

    //静态公有工厂方法，返回唯一实例
    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
