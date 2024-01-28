package whc.design.pattern.behavioral.object.memento.thought;

import java.util.*;

/**
 * 备忘录类，默认可见性，包内可见
 */
class Memento {

    private String state;

    public Memento(Originator o) {
        state = o.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}