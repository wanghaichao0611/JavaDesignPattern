package whc.design.pattern.structural.object.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类：充当容器构建类
 */
public class Folder extends AbstractFile {

    //定义集合fileList,用于存储AbstractFile类型的成员
    private List<AbstractFile> files = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile) files.get(i);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("对图像文件进行杀毒:" + name + "进行杀毒"); //模拟杀毒

        //递归调用成员构件的KillVirus方法
        for (Object obj:files){
            ((AbstractFile)obj).killVirus();
        }
    }
}
