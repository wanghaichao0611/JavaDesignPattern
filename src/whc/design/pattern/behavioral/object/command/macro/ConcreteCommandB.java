package whc.design.pattern.behavioral.object.command.macro;

/**
 * 具体命令B
 */
public class ConcreteCommandB extends Command {

    private final ReceiverB receiverB;

    public ConcreteCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        System.out.println("调用了具体命令B");
        receiverB.action();
    }
}