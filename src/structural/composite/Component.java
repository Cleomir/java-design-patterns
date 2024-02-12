package structural.composite;

public abstract class Component {

  public void add(Component component) {
    throw new UnsupportedOperationException();
  }

  public void remove(Component component) {
    throw new UnsupportedOperationException();
  }

  public Component getChild(int index) {
    throw new UnsupportedOperationException();
  }

  public void operation() {
    throw new UnsupportedOperationException();
  }

  public boolean isComposite() {
    return false;
  }
}
