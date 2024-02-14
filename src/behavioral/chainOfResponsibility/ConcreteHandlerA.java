package behavioral.chainOfResponsibility;

public class ConcreteHandlerA extends AbstractHandler {

  @Override
  public void handleRequest(String request) {
    if (request.equals("A")) {
      System.out.println("ConcreteHandlerA handles request " + request);
    } else {
      super.handleRequest(request);
    }
  }
}
