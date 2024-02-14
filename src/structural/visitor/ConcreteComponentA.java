package structural.visitor;

import structural.visitor.interfaces.Component;
import structural.visitor.interfaces.Visitor;

public class ConcreteComponentA implements Component {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String exclusiveMethodOfConcreteComponentA() {
    return "A";
  }
}
