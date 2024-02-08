package creational.factory;

import creational.factory.interfaces.Product;

public class ConcreteCreator extends Creator {

  @Override
  public Product factoryMethod(String type) {
    if (type.equals("A")) {
      return new ConcreteProductA();
    }

    return new ConcreteProductB();
  }
}
