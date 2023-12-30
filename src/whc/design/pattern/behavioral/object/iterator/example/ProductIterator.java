package whc.design.pattern.behavioral.object.iterator.example;

import java.util.*;

/**
 *
 */
public class ProductIterator implements AbstractIterator {


    private List<Object> products;

    /**
     * 定义一个游标：用于记录正向遍历的位置
     */
    private int cursor2;

    /**
     * 定义一个游标：用于记录逆向遍历的位置
     */
    private int cursor1;


    public ProductIterator(ProductList list) {
        /**
         * 获取集合对象：设置正向遍历游标的初始值，设置逆向游标的初始值
         */
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }


    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }


    public boolean isLast() {
        return (cursor1 == products.size());
    }

    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    public boolean isFirst() {
        return (cursor2 == -1);
    }

    public Object getNextItem() {
        return products.get(cursor1);
    }

    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}