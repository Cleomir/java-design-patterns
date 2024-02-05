package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.FlyBehavior;

public class FlyWithWingsStrategy implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying!!");
  }
}
