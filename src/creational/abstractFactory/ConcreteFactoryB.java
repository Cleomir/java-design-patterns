package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.AbstractItem;

public class ConcreteFactoryB implements AbstractFactory {

  @Override
  public AbstractItem createProduct() {
    return new ConcreteItemB();
  }
}
