package whc.design.pattern.structural.object.proxy.example.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 自定义请求处理程序类
 */
public class DAOLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DAOLogHandler() {

    }

    //自定义有参构造函数，用于注入一个需要提供代理的真实主题对象
    public DAOLogHandler(Object object) {
        this.object = object;
    }

    //实现invoke方法，调用真实主题类的定义的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);//转发调用
        afterInvoke();
        return result;
    }

    //记录调用的时间
    public void beforeInvoke() {
        calendar = new GregorianCalendar();
        System.out.println("调用时间:" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }

    //后置操作
    public void afterInvoke() {
        System.out.println("方法调用结束!");
    }
}
