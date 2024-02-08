package creational.abstractFactory;

import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.Product;

public class ConcreteCreator extends Creator {

  @Override
  public Product factoryMethod(String type) {
    if (type.equals("A")) {
      AbstractFactory factoryA = new ConcreteFactoryA();
      return new ConcreteProductA(factoryA);
    }

    AbstractFactory factoryB = new ConcreteFactoryB();
    return new ConcreteProductB(factoryB);
  }
}
