package creational.prototype.interfaces;

public interface Prototype extends Cloneable {
  Prototype clone() throws CloneNotSupportedException;
  String getName();
  void setName(String name);
}
