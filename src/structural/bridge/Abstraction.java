package structural.bridge;

import structural.bridge.interfaces.Implementor;

public abstract class Abstraction {

  private Implementor implementor;

  protected Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  public void operation() {
    this.implementor.operation();
  }

  public abstract void otherOperation();
}
