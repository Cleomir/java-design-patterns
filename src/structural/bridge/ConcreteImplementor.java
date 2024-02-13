package structural.bridge;

import structural.bridge.interfaces.Implementor;

public class ConcreteImplementor implements Implementor {

  @Override
  public void operation() {
    System.out.println("ConcreteImplementor operation");
  }
}
