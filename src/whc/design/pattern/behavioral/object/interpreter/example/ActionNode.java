package whc.design.pattern.behavioral.object.interpreter.example;

import java.util.*;

/**
 * 动作结点类，充当终结符表达式
 */
public class ActionNode extends AbstractNode {

    public String action;

    public ActionNode(String action) {
        this.action = action;
    }

    /**
     * 动作表达式的解释操作
     */
    public String interpret() {
        if ("move".equalsIgnoreCase(action)) {
            return "移动-";
        } else if ("run".equalsIgnoreCase(action)) {
            return "快速移动-";
        } else {
            return "无效指令";
        }
    }

}