package whc.design.pattern.behavioral.object.responsibility.example;

/**
 * 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        //构建职责链
        Approver a, b, c, d;
        a = new Director("主任a");
        b = new VicePresident("副董事长b");
        c = new President("董事长c");
        d = new Congress("董事会d");
        a.setSuccessor(b);
        b.setSuccessor(c);
        c.setSuccessor(d);

        //创建采购单
        PurchaseRequest purchaseRequestA = new PurchaseRequest(45000, 10001, "购买倚天剑A");
        a.processRequest(purchaseRequestA);

        PurchaseRequest purchaseRequestB = new PurchaseRequest(65000, 10002, "购买倚天剑B");
        a.processRequest(purchaseRequestB);

        PurchaseRequest purchaseRequestC = new PurchaseRequest(145000, 10003, "购买倚天剑C");
        a.processRequest(purchaseRequestC);

        PurchaseRequest purchaseRequestD = new PurchaseRequest(805000, 10004, "购买倚天剑D");
        a.processRequest(purchaseRequestD);
    }
}
