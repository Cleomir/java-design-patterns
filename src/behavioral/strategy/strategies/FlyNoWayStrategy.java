package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.FlyBehavior;

public class FlyNoWayStrategy implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
