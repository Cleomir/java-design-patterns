package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.Product;

public class ConcreteProductA extends Product {

  AbstractFactory factory;

  public ConcreteProductA(AbstractFactory factory) {
    this.factory = factory;
  }

  @Override
  public String operation() {
    return this.factory.createProduct().operation();
  }
}
