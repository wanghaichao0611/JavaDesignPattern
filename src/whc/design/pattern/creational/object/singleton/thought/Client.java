package whc.design.pattern.creational.object.singleton.thought;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        //判断两个对象是否相同
        if (s1 == s2){
            System.out.println("两个对象是相同实例");
        }else {
            System.out.println("两个对象不是相同实例");
        }
    }
}
