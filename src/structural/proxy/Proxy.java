package structural.proxy;

import structural.proxy.interfaces.Subject;

public class Proxy implements Subject {

  Subject subject;

  public Proxy(Subject subject) {
    this.subject = subject;
  }

  @Override
  public void request() {
    System.out.println("Proxy: Handling request.");
    subject.request();
  }
}
