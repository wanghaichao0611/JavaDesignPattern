package whc.design.pattern.behavioral.object.responsibility.example;

import java.util.*;

/**
 *
 */
public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(String request) {
        if (true) {
            //处理请求
        } else {
            this.successor.handleRequest(request);
        }
    }
}