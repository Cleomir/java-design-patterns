package creational.prototype;

import creational.prototype.interfaces.Prototype;

public class ConcretePrototype implements Prototype {

  private String name;

  public ConcretePrototype(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Prototype clone() throws CloneNotSupportedException {
    return (Prototype) super.clone();
  }
}
