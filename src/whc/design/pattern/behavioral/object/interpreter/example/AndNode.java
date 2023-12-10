package whc.design.pattern.behavioral.object.interpreter.example;

import java.util.*;

/**
 * And结点类，充当非终结符表达式角色
 */
public class AndNode extends AbstractNode {

    /**
     * And的左表达式
     */
    private AbstractNode left;

    /**
     * And的右表达式
     */
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    /**
     * And表达式解释操作
     */
    public String interpret() {
        return left.interpret() + " 再 " + right.interpret();
    }

}