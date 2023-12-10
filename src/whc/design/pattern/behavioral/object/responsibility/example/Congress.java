package whc.design.pattern.behavioral.object.responsibility.example;


/**
 * 董事会类：充当具体处理者
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法：链的最终端不转发请求
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会" + this.name + "审批采购单：" + request.getNumber() + " ,金额："
                + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        //处理请求
    }

}