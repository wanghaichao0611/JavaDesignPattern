package whc.design.pattern.behavioral.object.iterator.thought;

/**
 * 具体迭代器实例
 */
public class ConcreteIterator implements Iterator {

    //维持一个对具体聚合对象的引用，以便于访问存储在聚合对象的数据
    private ConcreteAggregate concreteAggregates;

    //定义一个游标，用于记录当前访问位置
    private int cursor;

    public ConcreteIterator(ConcreteAggregate concreteAggregates) {
        this.concreteAggregates = concreteAggregates;
    }

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public void hasNext() {

    }

    @Override
    public void currentItem() {

    }
}