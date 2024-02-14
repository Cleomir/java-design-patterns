package behavioral.mediator;

import behavioral.mediator.interfaces.Mediator;

public class ConcreteMediator implements Mediator {

  private Colleague colleagueA;
  private Colleague colleagueB;

  public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
    this.colleagueA = colleagueA;
    this.colleagueA.setMediator(this);
    this.colleagueB = colleagueB;
    this.colleagueB.setMediator(this);
  }

  @Override
  public void notify(Colleague sender, String event) {
    if (event.equals("A")) {
      colleagueB.onEvent(event);
    } else if (event.equals("B")) {
      colleagueA.onEvent(event);
    } else if (event.equals("C")) {
      colleagueB.onEvent(event);
    } else if (event.equals("D")) {
      colleagueA.onEvent(event);
    }
  }
}
