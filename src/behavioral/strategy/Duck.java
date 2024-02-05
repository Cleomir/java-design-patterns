package behavioral.strategy;

import behavioral.strategy.interfaces.FlyBehavior;
import behavioral.strategy.interfaces.QuackBehavior;

public class Duck {

  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }
}
