package behavioral.state;

import behavioral.state.interfaces.State;

public class Context {

  private State stateA;
  private State stateB;
  private State currentState;

  public Context() {
    stateA = new ConcreteStateA(this);
    stateB = new ConcreteStateB(this);
    currentState = stateA;
  }

  public void request() {
    currentState.handle();
  }

  public void setState(State state) {
    currentState = state;
  }

  public State getStateA() {
    return stateA;
  }

  public State getStateB() {
    return stateB;
  }
}
