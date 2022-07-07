package whc.design.pattern.creational.object.prototype.example.shallow;


//工作周报类
public class WeeklyLog implements Cloneable {

    //为了简化设计与实现，假设一份工作周报中只有一个附件对象，在实际情况中可以包含多个附件，可以通过List等集合对象实现

    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeeklyLog clone() {
        Object o = null;
        try {
            o = super.clone();
            return (WeeklyLog) o;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制!");
            return null;
        }
    }
}
