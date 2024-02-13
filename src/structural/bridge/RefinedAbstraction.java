package structural.bridge;

import structural.bridge.interfaces.Implementor;

public class RefinedAbstraction extends Abstraction {

  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  public void otherOperation() {
    System.out.println("RefinedAbstraction otherOperation");
  }
}
