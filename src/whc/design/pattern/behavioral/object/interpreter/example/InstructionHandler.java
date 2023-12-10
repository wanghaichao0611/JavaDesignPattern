package whc.design.pattern.behavioral.object.interpreter.example;

import java.util.*;

/**
 * InstructionHandler: 指令处理类，工具类，利用栈的特性
 */
public class InstructionHandler {

    private AbstractNode node;

    /**
     * 处理
     */
    public void handle(String instruction) {
        AbstractNode left = null;
        AbstractNode right = null;
        AbstractNode direction = null;
        AbstractNode action = null;
        AbstractNode distance = null;
        //声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            /**
             * 本实例采用栈的方式处理指令，如果遇到‘and’，则将其后的3个单词作为三个终结符表达式连成一个简单的句子
             * sentenceNode作为‘and’的右表达式，而将从栈顶弹出的表达式作为‘and’的左表达式，最后将新的‘and’表达式压入栈中
             */
            if ("and".equalsIgnoreCase(words[i])) {
                //弹出栈顶作为左表达式
                left = (AbstractNode) stack.pop();
                direction = new DirectionNode(words[++i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);
                //右表达式
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));

            } else {
                /**
                 * 如果是藏头开始进行解释，则将前三个单词组成一个简单句子SentenceNode,并将该句子压入栈中
                 */
                direction = new DirectionNode(words[i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        //将全部表达式从栈中弹出
        this.node = (AbstractNode) stack.pop();
    }


    /**
     * 解析表达式
     */
    public String output() {
        return node.interpret();
    }

}