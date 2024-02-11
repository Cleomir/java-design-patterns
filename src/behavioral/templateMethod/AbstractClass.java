package behavioral.templateMethod;

public abstract class AbstractClass {

  public void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
  }

  final void concreteOperation() {
    System.out.println("Concrete operation");
  }

  abstract void primitiveOperation1();

  abstract void primitiveOperation2();
}
