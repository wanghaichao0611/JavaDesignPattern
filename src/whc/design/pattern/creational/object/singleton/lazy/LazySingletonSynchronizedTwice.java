package whc.design.pattern.creational.object.singleton.lazy;

public class LazySingletonSynchronizedTwice {

    public volatile static LazySingletonSynchronizedTwice instance = null;

    private LazySingletonSynchronizedTwice() {

    }

    //使用Synchronized关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
    synchronized public static LazySingletonSynchronizedTwice lazySingleton() {
        if (instance == null) {
            synchronized (LazySingletonSynchronizedTwice.class) {
                if (instance == null) {
                    instance = new LazySingletonSynchronizedTwice();
                }
            }
        }
        return instance;
    }
}
