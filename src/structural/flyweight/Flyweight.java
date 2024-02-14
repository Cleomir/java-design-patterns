package structural.flyweight;

public class Flyweight {

  private final String intrinsicState;

  public Flyweight(String intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  public void operation(String extrinsicState) {
    System.out.println(
      "Flyweight: Displaying intrinsic state: " +
      intrinsicState +
      " and extrinsic state: " +
      extrinsicState
    );
  }
}
