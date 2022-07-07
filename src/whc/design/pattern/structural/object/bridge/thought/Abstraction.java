package whc.design.pattern.structural.object.bridge.thought;

public abstract class Abstraction {

    protected Implementor imple; //定义实现类接口对象

    public void setImpl(Implementor impl){
        this.imple = impl;
    }

    public abstract void operation(); //声明抽象业务方法
}
