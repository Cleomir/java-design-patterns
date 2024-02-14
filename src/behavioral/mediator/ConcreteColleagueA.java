package behavioral.mediator;

public class ConcreteColleagueA extends Colleague {

  public void doA() {
    System.out.println("ConcreteColleagueA does A");
    mediator.notify(this, "A");
  }

  public void doB() {
    System.out.println("ConcreteColleagueA does B");
    mediator.notify(this, "B");
  }

  public void onEvent(String event) {
    System.out.println("ConcreteColleagueA reacts to " + event);
  }
}
