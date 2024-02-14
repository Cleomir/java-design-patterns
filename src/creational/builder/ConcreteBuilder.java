package creational.builder;

import creational.builder.interfaces.Builder;

public class ConcreteBuilder implements Builder {

  Product product = new Product();

  @Override
  public void buildPartA() {
    product.setPartA("Part A");
  }

  @Override
  public void buildPartB() {
    product.setPartB("Part B");
  }

  public Product getResult() {
    return product;
  }
}
