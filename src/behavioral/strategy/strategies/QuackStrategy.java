package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.QuackBehavior;

public class QuackStrategy implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
