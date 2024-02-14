package behavioral.chainOfResponsibility;

public class ConcreteHandlerB extends AbstractHandler {

  @Override
  public void handleRequest(String request) {
    if (request.equals("B")) {
      System.out.println("ConcreteHandlerB handles request " + request);
    } else {
      super.handleRequest(request);
    }
  }
}
