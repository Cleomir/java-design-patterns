package behavioral.memento;

import behavioral.memento.interfaces.Memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {

  private List<Memento> mementos = new ArrayList<>();
  private Originator originator;

  public CareTaker(Originator originator) {
    this.originator = originator;
  }

  public void backup() {
    this.mementos.add(this.originator.save());
  }

  public void undo() {
    if (this.mementos.isEmpty()) {
      return;
    }

    Memento memento = this.mementos.remove(this.mementos.size() - 1);
    this.originator.restore(memento);
  }

  public void showHistory() {
    for (Memento memento : this.mementos) {
      System.out.println(memento.getName());
    }
  }
}
