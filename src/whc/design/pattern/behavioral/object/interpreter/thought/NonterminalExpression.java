package whc.design.pattern.behavioral.object.interpreter.thought;

/**
 * 终结符表达式
 */
public class NonterminalExpression extends AbstractExpression {


    private final AbstractExpression left;

    private final AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context ctk) {
        //递归调用每一个组成部门的interpret()方法
        //在递归调用时指定组成部门的连接方式，即非终结符的功能
    }
}