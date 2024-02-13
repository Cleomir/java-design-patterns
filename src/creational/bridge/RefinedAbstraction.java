package creational.bridge;

import creational.bridge.interfaces.Implementor;

public class RefinedAbstraction extends Abstraction {

  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  public void otherOperation() {
    System.out.println("RefinedAbstraction otherOperation");
  }
}
