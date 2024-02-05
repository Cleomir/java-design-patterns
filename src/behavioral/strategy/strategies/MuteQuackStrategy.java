package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.QuackBehavior;

public class MuteQuackStrategy implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
