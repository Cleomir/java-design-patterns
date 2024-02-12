package behavioral.iterator;

import behavioral.iterator.interfaces.Iterator;

public class ConcreteIterator implements Iterator {

  private Aggregate aggregate;
  private int index;

  public ConcreteIterator(Aggregate aggregate) {
    this.aggregate = aggregate;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < aggregate.size();
  }

  @Override
  public Object next() {
    return aggregate.get(index++);
  }
}
