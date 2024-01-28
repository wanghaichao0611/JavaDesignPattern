package whc.design.pattern.behavioral.object.memento.thought;

/**
 * 客服端类
 *
 * @Author:汪海潮
 * @Date: 2024/01/27
 */
public class Client {
    public static void main(String[] args) {
        //创建原发器对象
        Originator originator = new Originator("状态(1)");
        System.out.println(originator.getState());

        //创建负责人对象，保存创建的备忘录对象
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("状态(2)");
        System.out.println(originator.getState());

        //从负责人对象中取出备忘录对象，实现撤销
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
