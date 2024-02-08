package creational.factory;

import creational.factory.interfaces.Product;

public class ConcreteProductB implements Product {

  @Override
  public String operation() {
    return "ConcreteProductB";
  }
}
