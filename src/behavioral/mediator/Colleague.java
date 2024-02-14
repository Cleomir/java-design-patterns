package behavioral.mediator;

import behavioral.mediator.interfaces.Mediator;

public abstract class Colleague {

  protected Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void onEvent(String event);
}
