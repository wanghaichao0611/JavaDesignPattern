package whc.design.pattern.behavioral.object.iterator.thought;

import java.util.*;

/**
 * 抽象聚合接口(类)
 */
public interface Aggregate {


    /**
     * 用于存储数据和创建迭代器对象
     */
    public Iterator createIterator();

}