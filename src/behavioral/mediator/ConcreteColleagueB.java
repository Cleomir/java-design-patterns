package behavioral.mediator;

public class ConcreteColleagueB extends Colleague {

  public void doC() {
    System.out.println("ConcreteColleagueB does C");
    mediator.notify(this, "C");
  }

  public void doD() {
    System.out.println("ConcreteColleagueB does D");
    mediator.notify(this, "D");
  }

  public void onEvent(String event) {
    System.out.println("ConcreteColleagueB reacts to " + event);
  }
}
