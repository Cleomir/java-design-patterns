package creational.builder.interfaces;

import creational.builder.Product;

public interface Builder {
  void buildPartA();
  void buildPartB();
  Product getResult();
}
