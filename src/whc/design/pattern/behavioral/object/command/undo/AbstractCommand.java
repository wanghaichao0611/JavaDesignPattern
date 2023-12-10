package whc.design.pattern.behavioral.object.command.undo;

import java.util.*;

/**
 *
 */
public abstract class AbstractCommand {

    public abstract int execute(int value);

    public abstract int undo();

}