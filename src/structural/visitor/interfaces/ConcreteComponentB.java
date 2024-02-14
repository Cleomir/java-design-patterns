package structural.visitor.interfaces;

public class ConcreteComponentB implements Component {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String specialMethodOfConcreteComponentB() {
    return "B";
  }
}
