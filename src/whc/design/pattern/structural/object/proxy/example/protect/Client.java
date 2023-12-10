package whc.design.pattern.structural.object.proxy.example.protect;


//客户端
public class Client {
    public static void main(String[] args) {
        Searcher searcher; //针对对象编程，客户端无须分辨真实主题类和代理类
        searcher = (Searcher) ProtectXMLUtil.getBean();
        searcher.doSearch("杨过", "小龙女");
    }
}
