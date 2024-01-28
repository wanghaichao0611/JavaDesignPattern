package whc.design.pattern.behavioral.object.memento.thought;

/**
 * 负责人Caretaker
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}