package whc.design.pattern.behavioral.object.interpreter.example;

import java.util.*;

/**
 * 方向结点类，充当终结符表达式
 */
public class DirectionNode extends AbstractNode {


    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    /**
     * 方向表达式的解释操作
     */
    public String interpret() {
        if ("up".equalsIgnoreCase(direction)) {
            return "向上-";
        } else if ("down".equalsIgnoreCase(direction)) {
            return "向下-";
        } else if ("left".equalsIgnoreCase(direction)) {
            return "向左-";
        } else if ("right".equalsIgnoreCase(direction)) {
            return "向右-";
        } else {
            return "无效指令";
        }
    }

}