package whc.design.pattern.structural.object.proxy.example.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler invocationHandler;
        AbstractUserDAO abstractUserDAO = new UserDAO();
        invocationHandler = new DAOLogHandler(abstractUserDAO);
        AbstractUserDAO proxy;

        //动态创建代理对象，用于处理一个AbstractUserDAO类型的真实主题对象
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, invocationHandler);
        proxy.findUserById("张无忌");//调用代理对象的业务方法

        System.out.println("------------------------------------------------------------");

        AbstractDocumentDAO dao = new DocumentDAO();
        invocationHandler = new DAOLogHandler(dao);
        AbstractDocumentDAO proxyNew;

        //动态创建代理对象，用于创建一个AbstractDocumentDAO类型的真实主题对象
        proxyNew = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, invocationHandler);
        proxyNew.deleteDocumentById("DOO2");//调用代理对象的业务方法
    }
}
