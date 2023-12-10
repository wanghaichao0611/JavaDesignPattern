package whc.design.pattern.creational.object.singleton.lazy;

public class LazySingletonSynchronized {

    public static LazySingletonSynchronized instance = null;

    private LazySingletonSynchronized() {

    }

    //使用Synchronized关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
    synchronized public static LazySingletonSynchronized lazySingleton() {
        if (instance == null) {
            instance = new LazySingletonSynchronized();
        }
        //synchronized (LazySingletonSynchronized.class) 对getInstance方法锁定会导致出现多线程对象不唯一的情况
        return instance;
    }
}
