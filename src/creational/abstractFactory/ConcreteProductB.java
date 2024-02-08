package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.Product;

public class ConcreteProductB extends Product {

  AbstractFactory factory;

  public ConcreteProductB(AbstractFactory factory) {
    this.factory = factory;
  }

  @Override
  public String operation() {
    return this.factory.createProduct().operation();
  }
}
