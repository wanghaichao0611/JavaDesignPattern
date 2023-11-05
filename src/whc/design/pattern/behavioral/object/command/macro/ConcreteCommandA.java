package whc.design.pattern.behavioral.object.command.macro;

/**
 * 具体命令B
 */
public class ConcreteCommandA extends Command {

    private final ReceiverA receiverA;

    public ConcreteCommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
        System.out.println("调用了具体命令A");
        receiverA.action();
    }
}