package whc.design.pattern.structural.object.composite.thought;

/**
 * 叶子构件
 */
public class Leaf extends Component{

    @Override
    public void add(Component component) {
        //异常处理或错误提示
    }

    @Override
    public void remove(Component component) {
        //异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        //异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        //叶子构件具体业务方法的实现
        System.out.println("叶子构件具体业务方法的实现");
    }
}
