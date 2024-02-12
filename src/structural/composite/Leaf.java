package structural.composite;

public class Leaf extends Component {

  @Override
  public void operation() {
    System.out.println("Leaf operation");
  }

  @Override
  public boolean isComposite() {
    return false;
  }
}
