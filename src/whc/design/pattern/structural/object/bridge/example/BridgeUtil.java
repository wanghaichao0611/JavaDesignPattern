package whc.design.pattern.structural.object.bridge.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class BridgeUtil {

    public static Object getBean(String args){
        try {
            //创建文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src//whc//design//pattern//structural//object//bridge//example//config.xml"));
            NodeList n1 = null;
            Node classNode = null;
            String cName = null;
            n1 = doc.getElementsByTagName("className");

            //获取第一个包含类名的结点，即扩充抽象类
            if (args.equals("image")){
                classNode = n1.item(0).getFirstChild();
            }
            //获取第二个包含类名的结点，即具体的实现类
            else if (args.equals("os")){
                classNode = n1.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c =Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
