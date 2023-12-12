package whc.design.pattern.behavioral.object.iterator.thought;


/**
 * 具体聚合类
 */
public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}