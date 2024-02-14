package behavioral.memento;

import behavioral.memento.interfaces.Memento;

public class Originator {

  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return this.state;
  }

  public Memento save() {
    return new ConcreteMemento(this.state);
  }

  public void restore(Memento memento) {
    this.state = memento.getState();
  }
}
