package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractItem;

public class ConcreteItemA implements AbstractItem {

  @Override
  public String operation() {
    return "ConcreteItemA";
  }
}
