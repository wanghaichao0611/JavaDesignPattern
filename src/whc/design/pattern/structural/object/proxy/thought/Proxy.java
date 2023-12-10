package whc.design.pattern.structural.object.proxy.thought;

import java.util.*;

/**
 * 代理主题角色
 */
public class Proxy extends Subject {

    /**
     * Default constructor
     */
    public Proxy() {
    }

    /**
     * 真实主题角色
     */
    private RealSubject realSubject = new RealSubject();

    /**
     * 
     */
    public void preRequest() {
        // TODO implement here
    }

    /**
     * 
     */
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    /**
     * 
     */
    public void postRequest() {
        // TODO implement here
    }

}