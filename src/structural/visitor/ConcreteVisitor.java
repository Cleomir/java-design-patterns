package structural.visitor;

import structural.visitor.interfaces.Component;
import structural.visitor.interfaces.ConcreteComponentB;
import structural.visitor.interfaces.Visitor;

public class ConcreteVisitor implements Visitor {

  @Override
  public void visit(Component component) {
    if (component instanceof ConcreteComponentA) {
      System.out.println("ConcreteVisitor: visitConcreteComponentA");
      System.out.println(
        ((ConcreteComponentA) component).exclusiveMethodOfConcreteComponentA()
      );
    } else if (component instanceof ConcreteComponentB) {
      System.out.println("ConcreteVisitor: visitConcreteComponentB");
      System.out.println(
        ((ConcreteComponentB) component).specialMethodOfConcreteComponentB()
      );
    }
  }
}
