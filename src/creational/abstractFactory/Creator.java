package creational.abstractFactory;

import creational.abstractFactory.interfaces.Product;

public abstract class Creator {

  public abstract Product factoryMethod(String type);
}
