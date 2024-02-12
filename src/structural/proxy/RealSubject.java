package structural.proxy;

import structural.proxy.interfaces.Subject;

public class RealSubject implements Subject {

  @Override
  public void request() {
    System.out.println("RealSubject: Handling request.");
  }
}
