package behavioral.state;

import behavioral.state.interfaces.State;

public class ConcreteStateB implements State {

  private Context context;

  public ConcreteStateB(Context context) {
    this.context = context;
  }

  @Override
  public void handle() {
    System.out.println("Changing state to ConcreteStateB");
    this.context.setState(this.context.getStateB());
  }
}
