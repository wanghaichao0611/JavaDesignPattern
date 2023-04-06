package whc.design.pattern.structural.object.composite.example;

/**
 * 图像文件类，充当叶子构建类
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("对图像文件进行杀毒:" + name + "进行杀毒");
    }
}
