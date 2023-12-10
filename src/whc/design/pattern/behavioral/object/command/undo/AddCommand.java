package whc.design.pattern.behavioral.object.command.undo;


/**
 * 具体命令类
 */
public class AddCommand extends AbstractCommand {


    private final Adder adder = new Adder();

    private int value;


    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        //取反操作数值：撤回依旧是上一步的状态数值
        return adder.add(-value);
    }
}