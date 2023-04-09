package whc.design.pattern.structural.object.decorator.thought;

import java.util.*;

/**
 * 装饰类
 */
public class Decorator extends Component {


    public Component component;

    /**
     * Default constructor
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 新增业务方法
     */
    public void operation() {
        component.operation();
        // TODO implement here
    }

}