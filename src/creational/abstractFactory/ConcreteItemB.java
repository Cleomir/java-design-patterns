package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractItem;

public class ConcreteItemB implements AbstractItem {

  @Override
  public String operation() {
    return "ConcreteItemB";
  }
}
