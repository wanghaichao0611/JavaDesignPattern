package whc.design.pattern.structural.object.decorator.thought;

import java.util.*;

/**
 * 具体装饰类A
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    /**
     * Default constructor
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 
     */
    public void operation() {
        super.operation();
        // TODO implement here
    }

}