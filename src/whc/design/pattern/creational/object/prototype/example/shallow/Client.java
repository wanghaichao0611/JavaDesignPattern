package whc.design.pattern.creational.object.prototype.example.shallow;


//客户端测试类
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous, log_new;
        //创建原型对象与附件对象
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment); //将附件添加到周报中
        log_new = log_previous.clone();
        System.out.println("周报是否相同：" + (log_previous == log_new));
        System.out.println("附件是否相同：" + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
