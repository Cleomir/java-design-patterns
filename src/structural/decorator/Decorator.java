package structural.decorator;

public abstract class Decorator extends Component {

  protected Component component;

  @Override
  public abstract String getDescription();
}
