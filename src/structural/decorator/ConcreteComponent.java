package structural.decorator;

public class ConcreteComponent extends Component {

  public ConcreteComponent() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
