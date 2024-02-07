package structural.decorator;

public abstract class Component {

  protected String description = "Unknown Component";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
