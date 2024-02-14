package behavioral.memento;

import behavioral.memento.interfaces.Memento;
import java.util.Date;

public class ConcreteMemento implements Memento {

  private String state;
  private String name;
  private String date;

  public ConcreteMemento(String state) {
    this.state = state;
    this.date = new Date().toString();
  }

  @Override
  public String getState() {
    return this.state;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDate() {
    return this.date;
  }
}
