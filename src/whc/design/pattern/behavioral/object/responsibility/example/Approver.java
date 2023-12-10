package whc.design.pattern.behavioral.object.responsibility.example;

import java.util.*;

/**
 * 抽象审批者
 */
public abstract class Approver {


    //定义后继者
    protected Approver successor;

    //审批者姓名
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}