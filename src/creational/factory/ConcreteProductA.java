package creational.factory;

import creational.factory.interfaces.Product;

public class ConcreteProductA implements Product {

  @Override
  public String operation() {
    return "ConcreteProductA";
  }
}
