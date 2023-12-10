package whc.design.pattern.structural.object.decorator.example;

import java.util.*;

/**
 * 构件装饰类(抽象装饰类)
 */
public class ComponentDecorator extends AbstractComponent {

    private final AbstractComponent component;

    public ComponentDecorator(AbstractComponent component) {
        this.component = component;
    }

    public void display(){
        component.display();
    }

}