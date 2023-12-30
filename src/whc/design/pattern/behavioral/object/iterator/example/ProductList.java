package whc.design.pattern.behavioral.object.iterator.example;

import java.util.*;

/**
 * 商品数据类：充当具体聚合类
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> products){
        super(products);
    }


    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }

}