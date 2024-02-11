package structural.facade;

public class Facade {

  private ClassA classA;
  private ClassB classB;
  private ClassC classC;

  public Facade(ClassA classA, ClassB classB, ClassC classC) {
    this.classA = classA;
    this.classB = classB;
    this.classC = classC;
  }

  public void operation() {
    this.classA.operationA();
    this.classB.operationB();
    this.classC.operationC();
  }
}
