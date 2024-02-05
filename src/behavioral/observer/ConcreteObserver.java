package behavioral.observer;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.interfaces.Subject;

public class ConcreteObserver implements Observer {

  private Subject subject;

  public ConcreteObserver(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void update() {
    System.out.println("ConcreteObserver: update");
  }

  public void unsubscribe() {
    subject.removeObserver(this);
  }
}
