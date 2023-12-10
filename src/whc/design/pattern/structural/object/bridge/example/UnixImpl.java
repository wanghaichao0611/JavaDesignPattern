package whc.design.pattern.structural.object.bridge.example;

public class UnixImpl implements ImageImp{

    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Unix操作系统中显示图像");
    }
}
