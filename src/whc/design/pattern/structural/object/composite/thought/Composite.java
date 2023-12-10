package whc.design.pattern.structural.object.composite.thought;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 */
public class Composite extends Component {

    private final List<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        System.out.println("容器构件具体业务方法");
        //容器构件
        for (Object obj : list) {
            ((Component) obj).operation();
        }
    }
}
