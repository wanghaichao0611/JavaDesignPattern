package whc.design.pattern.structural.object.bridge.example;

public class LinuxImage implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Linux操作系统中显示图像");
    }
}
