package creational.builder;

import creational.builder.interfaces.Builder;

public class Director {

  Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.buildPartA();
    builder.buildPartB();
  }

  public Product getProduct() {
    return builder.getResult();
  }
}
