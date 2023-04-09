package whc.design.pattern.structural.object.decorator.example;

import java.util.*;

/**
 * 黑色边框装饰类
 */
public class BlackBordDecorator extends ComponentDecorator {


    public BlackBordDecorator(AbstractComponent component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }

}