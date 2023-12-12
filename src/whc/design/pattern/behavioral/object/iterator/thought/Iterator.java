package whc.design.pattern.behavioral.object.iterator.thought;

/**
 * 抽象迭代器
 */
public interface Iterator {

    /**
     *
     */
    public void first();

    /**
     *
     */
    public void next();

    /**
     *
     */
    public void hasNext();

    /**
     *
     */
    public void currentItem();

}