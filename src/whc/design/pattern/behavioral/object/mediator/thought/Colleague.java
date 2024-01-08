package whc.design.pattern.behavioral.object.mediator.thought;

import java.util.*;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    //维持一个抽象中介者的引用
    public Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void method1();

    //定义依赖方法，与中介者通信
    public void method2(){
        mediator.operation();
    }

}