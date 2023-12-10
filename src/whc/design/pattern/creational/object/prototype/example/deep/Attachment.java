package whc.design.pattern.creational.object.prototype.example.deep;


import java.io.Serializable;

//附件类
public class Attachment implements Serializable {
    private String name; //附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为：" + name);
    }
}
