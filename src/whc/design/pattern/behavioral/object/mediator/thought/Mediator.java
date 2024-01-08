package whc.design.pattern.behavioral.object.mediator.thought;

import java.util.*;

/**
 * 抽象中介者类
 */
public abstract class Mediator {

    //用于存储同事对象
    protected List<Colleague> colleagueList = new ArrayList<>();


    //注册方法，用于增加同事对象
    public void register(Colleague colleague){
        colleagueList.add(colleague);
    }

    //声明抽象的业务方法
    public abstract void operation();
}