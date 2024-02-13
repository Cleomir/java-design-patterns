package creational.bridge;

import creational.bridge.interfaces.Implementor;

public class ConcreteImplementor implements Implementor {

  @Override
  public void operation() {
    System.out.println("ConcreteImplementor operation");
  }
}
