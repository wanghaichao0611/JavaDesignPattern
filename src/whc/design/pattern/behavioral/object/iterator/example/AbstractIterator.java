package whc.design.pattern.behavioral.object.iterator.example;

/**
 * 抽象迭代器
 */
public interface AbstractIterator {

    /**
     * 移至下一个元素
     */
    public void next();

    /**
     * 判断是否为最后一个元素
     */
    public boolean isLast();

    /**
     * 移至上一个元素
     */
    public void previous();

    /**
     * 判断是否为第一个元素
     */
    public boolean isFirst();

    /**
     * 获取下一个元素
     */
    public Object getNextItem();

    /**
     * 获取上一个元素
     */
    public Object getPreviousItem();

}