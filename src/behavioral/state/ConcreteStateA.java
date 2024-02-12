package behavioral.state;

import behavioral.state.interfaces.State;

public class ConcreteStateA implements State {

  private Context context;

  public ConcreteStateA(Context context) {
    this.context = context;
  }

  @Override
  public void handle() {
    System.out.println("Changing state to ConcreteStateA");
    this.context.setState(this.context.getStateA());
  }
}
