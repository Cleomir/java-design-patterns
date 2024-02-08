package creational.factory;

import creational.factory.interfaces.Product;

public abstract class Creator {

  public abstract Product factoryMethod(String type);
}
