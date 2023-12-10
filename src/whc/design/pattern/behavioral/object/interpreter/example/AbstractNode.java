package whc.design.pattern.behavioral.object.interpreter.example;


/**
 * 抽象结点类，充当抽象表达式角色
 */
public abstract class AbstractNode {

     /**
     * 解释文法规则
     */
    public abstract String interpret();
}