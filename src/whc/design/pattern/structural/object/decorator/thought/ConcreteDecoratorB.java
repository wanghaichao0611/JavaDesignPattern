package whc.design.pattern.structural.object.decorator.thought;

import java.util.*;

/**
 * 具体装饰类B
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * Default constructor
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 原有的业务方法
     */
    public void operation() {
        super.operation();
        // TODO implement here
        addedBehavior();
    }

    /**
     * 新增业务方法
     */
    public void addedBehavior() {
        // TODO implement here
    }

}