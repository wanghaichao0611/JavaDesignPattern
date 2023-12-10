package whc.design.pattern.behavioral.object.interpreter.thought;

import java.util.*;

/**
 * 抽象表达式
 */
public abstract class AbstractExpression {

    /**
     * 声明了抽象的解释操作
     */
    public abstract void interpret(Context ctk);

}