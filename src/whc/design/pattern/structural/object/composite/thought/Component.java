package whc.design.pattern.structural.object.composite.thought;

/**
 * 抽象构件
 */
public abstract class Component {

    public abstract void add(Component component);        //增加成员
    public abstract void remove(Component component);     //删除成员
    public abstract Component getChild(int i);            //获取成员
    public abstract void operation();                     //业务方法

}
