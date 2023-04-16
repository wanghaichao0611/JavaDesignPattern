package whc.design.pattern.structural.object.flyweight.thought;


/**
 *
 */
public class ConcreteFlyweight extends Flyweight {

    //内部状态intrinsicState作为成员变量，同一个享元对象的内部状态是一致的
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    //外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时可以传入不同的外部状态
    public void Operation(String extrinsicState) {
        //实现业务方法
    }


}