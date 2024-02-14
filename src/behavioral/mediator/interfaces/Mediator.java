package behavioral.mediator.interfaces;

import behavioral.mediator.Colleague;

public interface Mediator {
  void notify(Colleague sender, String event);
}
