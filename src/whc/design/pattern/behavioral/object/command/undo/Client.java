package whc.design.pattern.behavioral.object.command.undo;

/**
 * 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new AddCommand();
        form.setCommand(command);
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
