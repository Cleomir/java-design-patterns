package structural.decorator;

public class ConcreteDecorator extends Decorator {

  public ConcreteDecorator(Component component) {
    this.component = component;
  }

  @Override
  public String getDescription() {
    return component.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return .20 + component.cost();
  }
}
