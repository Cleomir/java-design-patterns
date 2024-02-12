package behavioral.iterator;

public class Aggregate {

  private Object[] items = new Object[10];
  private int count = 0;

  public void add(Object item) {
    items[count++] = item;
  }

  public Object get(int index) {
    return items[index];
  }

  public int size() {
    return count;
  }
}
