package whc.design.pattern.behavioral.object.mediator.thought;

import java.util.*;

/**
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {

    /**
     * 实现业务方法：封装同事之间的调用
     */
    @Override
    public void operation() {

        //通过中介者调用同事类的方法
        ((Colleague)colleagueList.get(0)).method1();
    }
}